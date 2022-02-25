package com.project3.revtech.controller;

import com.project3.revtech.dao.TransactionRepository;
import com.project3.revtech.entity.Transaction;
import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.pojo.TransactionPojo;
import com.project3.revtech.service.TransactionService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class TransactionControllerTest {

    @Autowired
    private TransactionController transactionController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @WithMockUser(roles = "ADMIN", username = "admin")
    public void getTransactionByIdAuthorizedLoggedInTest() throws Exception {
        this.mockMvc.perform(get("/api/transaction/123/get")).andDo(print()).andExpect(status().is5xxServerError());
    }

    @Test
    @WithMockUser(roles = "ADMIN", username = "admin")
    public void getCartTransactionsAuthorizedLoggedInTest() throws Exception {
        this.mockMvc.perform(get("/api/transaction/cart/{cid}/get",1)).andDo(print()).andExpect(status().isOk());
    }

    //Make sure to add the two other methods, post and put...

    @Test
    @WithMockUser(roles = "ADMIN", username = "admin")
    public void deleteTransactionAuthorizedLoggedInTest() throws Exception {
        this.mockMvc.perform(delete("/api/transaction/transaction/delete")).andExpect(status().isNotFound());
    }


    // --------------------------------------------------------- Negative Test --------------------------------



    @Test
    public void contextLoads() throws Exception {
        assertThat(transactionController).isNotNull();
    }

    //getTransactionById Constructor Test
    @Test
    public void shouldReceiveTheTransactionIdUnauthorizedLoggedInTest() throws Exception {
        this.mockMvc.perform(get("/10/get")).andDo(print()).andExpect(status().isUnauthorized());
    }

    //getCartTransaction Constructor Test
    @Test
    public void gettingCartTransactionByCardIdUnauthorizedLoggedInTest() throws Exception {
        this.mockMvc.perform(get("/cart/1/get")).andDo(print()).andExpect(status().isUnauthorized());
    }

    //createTransaction Constructor Test
    @Test
    public void creatingTransactionPostUnauthorizedLoggedInTest() throws Exception {
        this.mockMvc.perform(get("/post")).andDo(print()).andExpect(status().isUnauthorized());
    }

    //UpdateTransaction Constructor Test
    @Test
    public void updateTransactionPutUnauthorizedLoggedInTest() throws Exception {
        this.mockMvc.perform(get("/put")).andDo(print()).andExpect(status().isUnauthorized());
    }

    //deleteTransaction Constructor Test
    @Test
    public void deleteTransactionUnauthorizedLoggedInTest() throws Exception {
        this.mockMvc.perform(get("/transaction/delete")).andExpect(status().isUnauthorized());
    }

}
