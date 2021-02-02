package com.bharath.Contact.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.Contact.Contact;

public interface ContactRepository extends JpaRepository<Contact,Long> {

}
