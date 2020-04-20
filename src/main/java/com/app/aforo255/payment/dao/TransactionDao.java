package com.app.aforo255.payment.dao;

import org.springframework.data.repository.CrudRepository;

import com.app.aforo255.payment.domain.Transaction;


public interface TransactionDao extends CrudRepository<Transaction, Integer>{

	
}
