package com.brm.brmbank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	

	@RequestMapping("/delete/{idMessage}")
	public ResponseEntity<String> deleteMessage(@PathVariable("idMessage") long idMessage) {
		System.out.println("Delete Customer with ID = " + idMessage + "...");

		messagerepository.deleteById(idMessage);

		return new ResponseEntity<>("message a été supprimée", HttpStatus.OK);
	}
	
	 //details 
	@GetMapping(value = "/details/{idMessage}")
	public Optional<Message> findById(@PathVariable Long idMessage) {

		Optional<Message> message = messagerepository.findById(idMessage);
		return message;
	}
}
