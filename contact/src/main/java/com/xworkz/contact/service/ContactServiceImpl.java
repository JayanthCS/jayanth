package com.xworkz.contact.service;

import java.util.List;
import java.util.Properties;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.contact.dto.ContactDTO;
import com.xworkz.contact.entity.ContactEntity;
import com.xworkz.contact.repository.ContactRepo;

@Service
@Component
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepo repo;

	public ContactServiceImpl() {
		System.out.println("no-arg constructor of ConatctServiceImpl");
	}

	@Override
	public boolean validateAndThenSave(ContactDTO dto) {
		System.out.println("Running validate and save method");
		ContactEntity contactEntity = new ContactEntity();
		BeanUtils.copyProperties(dto, contactEntity);
		System.out.println("Entity:" + contactEntity);
		Long cont=this.repo.emailCount(dto.getEmail());
		if(cont==0) {
		boolean save = repo.save(contactEntity);
		if (save) {
			boolean sendMail = sendMail(contactEntity.getEmail());
			System.out.println(sendMail);
		} else {
			System.out.println("mail not send");
		}
		}else {
			return false;
		}
		return true;
	}

	@Override
	public List<ContactDTO> findByName(String name) {
		System.out.println("Running findByName method");
		List<ContactEntity> entities = this.repo.findByName(name);

		List<ContactDTO> dtos = entities.stream().map(ent -> {
			ContactDTO contactDTO = new ContactDTO();
			BeanUtils.copyProperties(ent, contactDTO);
			return contactDTO;
		}).collect(Collectors.toList());
		return dtos;
	}

	@Override
	public Long emailCount(String email) {
		System.out.println("Running eamilCount");
		Long value = this.repo.emailCount(email);

		return value;
	}

	public boolean sendMail(String email) {
		String to = email;// change accordingly
		String from = "jayanthcs634@outlook.com";// change accordingly
		String password = "Jay@1234";
		String host = "smtp.office365.com";// or IP address

		// Get the session object
		Properties properties = System.getProperties();
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.auth", "true");
		properties.put("mail.debug", "true");
		properties.put("mail.transport.protocol", "smtp");

		Session session = Session.getDefaultInstance(properties, null);

		// compose the message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("hi");
			message.setText("Hello, this is example of sending email  ");

			// Send message
			Transport.send(message, from, password);
			System.out.println("message sent successfully....");

		} catch (MessagingException mex) {
			mex.printStackTrace();
		}
		return true;
	}

}
