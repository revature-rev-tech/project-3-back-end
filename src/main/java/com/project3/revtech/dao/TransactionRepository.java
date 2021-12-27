package com.project3.revtech.dao;

import java.util.List;

import com.project3.revtech.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

	@Query("select * from transaction_details where cart_id = ?1")
	List<Transaction> findAllTransactionsForCart(Integer cartId);
	
	
}
