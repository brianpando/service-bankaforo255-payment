package com.app.aforo255.payment.service;

import java.util.List;

import com.app.aforo255.payment.domain.Transaction;

public interface ITransactionService {
	public List<Transaction> findAll();
	public Transaction save(Transaction transaction);

}
