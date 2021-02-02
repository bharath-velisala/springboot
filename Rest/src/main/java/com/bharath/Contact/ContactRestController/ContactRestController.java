package com.bharath.Contact.ContactRestController;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bharath.Contact.Contact;
import com.bharath.Contact.repos.ContactRepository;

@RestController
public class ContactRestController {

	@Autowired
	ContactRepository repository;
	
	@RequestMapping(value="/contacts",method=RequestMethod.GET)
	public List<Contact>getContacts(){
		return repository.findAll();
		
	}
	
}
