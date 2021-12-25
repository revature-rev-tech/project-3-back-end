package com.project3.revtech.controller;

import com.project3.revtech.joinedPojo.CartAndItemsPojo;
import com.project3.revtech.service.CartItemProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/test")

public class TestController {

    @Autowired
    CartItemProductServiceImpl cartItemProductService;

    @GetMapping
    CartAndItemsPojo getCart() {
        System.out.println("inside");
        return cartItemProductService.getAllCartItemProducts(1);
    }

}
