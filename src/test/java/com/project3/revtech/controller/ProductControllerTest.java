package com.project3.revtech.controller;

import com.project3.revtech.dao.ProductRepository;
import com.project3.revtech.entity.Product;
import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.ProductPojo;
import com.project3.revtech.service.ProductService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {

    @Autowired
    private ProductController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    // User needs to be logged in to get product
    // "Full authentication is required to access this resource","status":401
    @Test
    public void shouldReturnUnauthorizedNotLoggedIn() throws Exception {
        this.mockMvc.perform(get("/products/getone/1")).andDo(print()).andExpect(status().isUnauthorized());
    }

    //"Full authentication is required to access this resource","status":401
    @Test
    public void shouldReturnGetAllUnauthorizedNotLoggedIn() throws Exception {
        this.mockMvc.perform(get("/products/getall")).andDo(print()).andExpect(status().isUnauthorized());
    }


}

