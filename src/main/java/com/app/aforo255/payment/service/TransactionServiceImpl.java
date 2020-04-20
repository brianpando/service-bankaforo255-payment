package com.app.aforo255.payment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.aforo255.payment.dao.TransactionDao;
import com.app.aforo255.payment.domain.Transaction;

@Service 
public class TransactionServiceImpl implements ITransactionService {
	
	@Autowired
	private TransactionDao transactionDao;

	@Override
	public Transaction save(Transaction transaction) {
		return transactionDao.save(transaction);
	}

	@Override
	public List<Transaction> findAll() {
		return (List<Transaction>) transactionDao.findAll();
	}
	
}
