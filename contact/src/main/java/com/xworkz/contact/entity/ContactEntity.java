package com.xworkz.contact.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "contact")

public class ContactEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "p_id")
	private int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_email")
	private String email;
	@Column(name = "p_mobile")
	private long mobile;
	@Column(name = "p_comments")
	private String comments;

	@Column(name = "p_fileName")
	private String fileName;
	@Column(name = "p_contentType")
	private String contentType;
	@Column(name = "p_fileSize")
	private long fileSize;
}
