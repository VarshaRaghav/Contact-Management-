package com.contact.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.Service.ContactService;
import com.contact.model.Contact;

@RestController
@RequestMapping("/")
public class ContactController 
{
	@Autowired
	private ContactService service;
	
	@PostMapping("/contact")
	public Contact createContact(@RequestBody Contact contact){
		
		return service.createContact(contact);
	}

	@GetMapping("/contacts")
    public List<Contact> getAllContacts() {
        return service.getAllcontacts();
    }

    @GetMapping("contacts/{id}")
    public Contact getUserById(@PathVariable Integer cid) {
        return service.getContactbyId(cid);
    }

    @PutMapping("updatecontact/{id}")
    public Contact updateContact(@PathVariable Integer cid) {
        return service.updateContact(cid);
    }

    @DeleteMapping("/{cid}")
    public void deleteUser(@PathVariable Integer cid) {
    	service.deleteContact(cid);
    }
	
	
	
}
