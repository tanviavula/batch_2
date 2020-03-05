package com.nubes.cj.basics.day42.app;

import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl implements ContactService {

	private List<Contact> contacts=new ArrayList<>();
	
	@Override
	public Contact addContact(Contact contact) {
		contacts.add(contact);
		System.out.println("Contact is added with the id:"+contact.getCid());
		return contact;
	}

	@Override
	public List<Contact> getContacts() {
		if(contacts.size()==0) {
			System.out.println("No contacts are added yet. please add contacts");
		}
		return contacts;
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteContact(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact getContact(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact> sortByName() {
		// TODO Auto-generated method stub
		return null;
	}

}
