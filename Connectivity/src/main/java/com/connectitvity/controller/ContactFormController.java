package com.connectitvity.controller;

import com.connectitvity.me.ContactUsME;
import com.connectitvity.service.ContactFormService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
public class ContactFormController {
    @Autowired
    private ContactFormService contactFormService;
 // saving the data 
    @PostMapping("/save")
    public ResponseEntity<ContactUsME> submitContactForm(@RequestBody ContactUsME contactUsME) {
        try {
            ContactUsME savedForm = contactFormService.saveContactForm(contactUsME);
            return ResponseEntity.status(HttpStatus.OK)
                    .header("Info", "Data Saved Successfully")
                    .body(savedForm);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .header("Error", "Failed to Save Data")
                    .body(null);
        }
    }
    //retreiving the data for admin uses 
    @GetMapping("/get/all/users")
    public ResponseEntity<List<ContactUsME>> getAllDetails(){
    	List<ContactUsME> result =(List<ContactUsME>) contactFormService.getAllContactForms();
    	return ResponseEntity.status(HttpStatus.OK)
    			.header("ContactUs Details", "Retreived")
    			.body(result);
    }
}
