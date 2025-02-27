package com.connectitvity.service;

import com.connectitvity.me.ContactUsME;
import com.connectitvity.repository.ContactFormRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactFormService {

    @Autowired
    private ContactFormRepository contactFormRepository;

    public ContactUsME saveContactForm(ContactUsME contactUsME) {
        try {
            return contactFormRepository.save(contactUsME);
        } catch (Exception e) {
            throw new RuntimeException("Error saving contact form: " + e.getMessage());
        }
    }

    public List<ContactUsME> getAllContactForms() {
        return contactFormRepository.findAll();
    }
}
