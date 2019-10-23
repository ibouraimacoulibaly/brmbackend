package com.brm.brmbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brm.brmbank.entities.Message;
import com.brm.brmbank.repository.MessageRepository;

@RestController
@RequestMapping("message")
public class MessageController {
	
	@Autowired
	private MessageRepository messagerepository;
	
	@RequestMapping(value ="",  method = RequestMethod.GET)
	public List<Message> getAll() {
		return messagerepository.findAll();
		
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveMessage(@ModelAttribute("messagerepository") Message messagerepository) {
		messagerepository.save(messagerepository);
	     
	    return "redirect:/";
	}

}
