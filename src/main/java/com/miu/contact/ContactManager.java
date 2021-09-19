package com.miu.contact;

import java.util.List;
import java.util.ArrayList;

public class ContactManager {
	List<Contact> contacts;

	ContactManager() {
		contacts = new ArrayList<>();
	}

	public void addContact(String fname, String lname, String mobile) {
		Contact c = new Contact(fname, lname, mobile);
		addContact(c);
	}

	public void addContact(Contact c) {
		if (!contacts.contains(c)) {
			c.validateFirstName();
			c.validateLastName();
			c.validateMobile();
			contacts.add(c);
		} else {
			throw new RuntimeException("The contact is existed!");
		}
	}

	public List<Contact> getContractList() {
		return contacts;
	}

}
