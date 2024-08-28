package com.contact.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.contact.Repo.ContactRepository;
import com.contact.model.Contact;

@Service

public class ContactService 
{
     @Autowired
	 private ContactRepository contactRepo;
     
	 
	 
	public Contact createContact(Contact contact) {
		
		return contactRepo.save(contact);
	}



	public List<Contact> getAllcontacts() {
	
		return contactRepo.findAll();
	}



	public Contact getContactbyId(Integer cid) {
		
		 return contactRepo.findById(cid).orElse(null);
	}



	public Contact updateContact(Integer cid, Contact contact) {
		contact.setCid(cid);
	        return contactRepo.save(contact);
	}



	public void deleteContact(Integer cid) {
		contactRepo.deleteById(cid);
	}
	
	
}
