package com.project3.revtech.dao;

import com.project3.revtech.controller.entity.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepository extends JpaRepository<Discount, Integer> {

}