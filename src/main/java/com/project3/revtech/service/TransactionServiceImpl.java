package com.project3.revtech.service;



import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import com.project3.revtech.pojo.TransactionPojo;
import com.project3.revtech.dao.TransactionRepository;
import com.project3.revtech.entity.Transaction;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService{
	
	TransactionRepository TR;

	@Override
	public List<TransactionPojo> getAllTransactions() {
		
		List<Transaction> allTransactionsEntity = this.TR.findAll();
		List<TransactionPojo> allTransactionsPojo = new LinkedList<TransactionPojo>();
		
		allTransactionsEntity.forEach((transaction) -> {
			TransactionPojo transactionPojo = new TransactionPojo(transaction.getTransactionId(), transaction.getTransactionDate(), transaction.getCartId());
			allTransactionsPojo.add(transactionPojo);
		});
		return allTransactionsPojo;
	}

	@Override
	public TransactionPojo getTransactionById(int transactionId) {
		Optional<Transaction> optional = this.TR.findById(transactionId);
		
		Transaction transaction = optional.get();
		TransactionPojo transactionPojo = new TransactionPojo(transaction.getTransactionId(), transaction.getTransactionDate(), transaction.getCartId());
			
		return transactionPojo;
	}

	@Override
	public List<TransactionPojo> findAllTransactionsInCart(int cartId) {
		List<Transaction> allTransactionsEntity = this.TR.findAllTransactionsForCart(cartId);
		List<TransactionPojo> allTransactionsPojo = new LinkedList<TransactionPojo>();
		
		allTransactionsEntity.forEach((transaction) -> {
			TransactionPojo transactionPojo = new TransactionPojo(transaction.getTransactionId(), transaction.getTransactionDate(), transaction.getCartId());
			allTransactionsPojo.add(transactionPojo);
		});
		return allTransactionsPojo;
	}

	@Override
	public TransactionPojo createTransaction(TransactionPojo tp) {
		Transaction transaction = new Transaction(tp.getTransactionId(), tp.getTransactionDate(), tp.getCartId());
		Transaction created = this.TR.saveAndFlush(transaction);
		
		
		TransactionPojo transactionPojo = new TransactionPojo(created.getTransactionId(), created.getTransactionDate(), created.getCartId());
			
		return transactionPojo;
	}

	@Override
	public TransactionPojo deleteTransaction(TransactionPojo tp) {
		Transaction transaction = new Transaction(tp.getTransactionId(), tp.getTransactionDate(), tp.getCartId());
		this.TR.delete(transaction);
			
		return tp;
	}

	@Override
	public TransactionPojo updateTransaction(TransactionPojo tp) {
		Transaction transaction = new Transaction(tp.getTransactionId(), tp.getTransactionDate(), tp.getCartId());
		Transaction updated = this.TR.saveAndFlush(transaction);
		
		
		TransactionPojo transactionPojo = new TransactionPojo(updated.getTransactionId(), updated.getTransactionDate(), updated.getCartId());
			
		return transactionPojo;
	}

	
}
