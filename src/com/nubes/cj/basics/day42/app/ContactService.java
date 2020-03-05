package com.nubes.cj.basics.day42.app;

import java.util.List;

public interface ContactService {

	Contact addContact(Contact contact);

	List<Contact> getContacts();

	Contact updateContact(Contact contact);

	String deleteContact(Integer cid);

	List<Contact> search(String name);

	Contact getContact(Integer cid);

	List<Contact> sortByName();
}
