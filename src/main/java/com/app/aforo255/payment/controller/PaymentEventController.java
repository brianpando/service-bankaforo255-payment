package com.app.aforo255.payment.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.aforo255.payment.domain.Transaction;
import com.app.aforo255.payment.producer.PaymentEventProducer;
import com.app.aforo255.payment.service.ITransactionService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class PaymentEventController {

	private Logger log = LoggerFactory.getLogger(PaymentEventController.class);
	@Autowired
	private ITransactionService transactionService; 

	@Autowired
	PaymentEventProducer depositEventProducer;
	
	@GetMapping("/pago")
	public List<Transaction> list(){
		return transactionService.findAll();
	}
	
	@PostMapping("/pago")
	public ResponseEntity<Transaction> postLibraryEvent(@RequestBody Transaction transactionEvent) throws JsonProcessingException{
		
		Transaction transSql = transactionService.save(transactionEvent);
		depositEventProducer.sendPaymentEvent_Approach3(transSql);
		return ResponseEntity.status(HttpStatus.CREATED).body(transSql);
		
	}
	
}
