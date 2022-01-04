package com.project3.revtech.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project3.revtech.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    //----- Product Custom JPA Queries ----------//


	List<Product> findAllByProductCategory(String productCategory);
}
