package by.cromvel.servicebeld.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import by.cromvel.servicebeld.service.ContactService;

@RestController
public class RestContactController {
	
	@Autowired
	ContactService contactService;

}
