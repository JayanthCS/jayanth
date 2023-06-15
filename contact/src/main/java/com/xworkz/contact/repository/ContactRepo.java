package com.xworkz.contact.repository;

import com.xworkz.contact.entity.ContactEntity;

public interface ContactRepo {

	boolean save(ContactEntity entity);
}
