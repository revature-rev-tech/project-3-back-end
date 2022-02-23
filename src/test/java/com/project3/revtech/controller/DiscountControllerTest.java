package com.project3.revtech.controller;

import com.project3.revtech.controller.DiscountController;
import com.project3.revtech.exception.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoProperties;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.project3.revtech.exception.GlobalExceptionHandler;
import com.project3.revtech.dao.UserRepository;
import com.project3.revtech.entity.User;
import com.project3.revtech.entity.Role;
import com.project3.revtech.entity.ERole;
import com.project3.revtech.request.LoginRequest;
import com.project3.revtech.request.SignupRequest;
import com.project3.revtech.response.MessageResponse;
import org.testng.annotations.Test;

public class DiscountControllerTest {

    @Autowired
    private DiscountController discountController;


    @Autowired
    private MockMvc mockMvc;


    @Test
    public void contextLoads() throws Exception {
        assertThat(discountController).isNull();
    }
}
