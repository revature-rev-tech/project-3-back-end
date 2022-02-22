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

public class ProductControllerTest {
    public static ProductService productService;

    @BeforeClass
    public void setup(){
        productService = Mockito.mock(ProductService.class);
    }



    @Test
    void getProductById()throws ApplicationException {
        ProductPojo returned_product = new ProductPojo(1, "1234", "Ipod mini", null, "cat", "description", 1, "asdf", false);
        Mockito.when(productService.getAProductService(1)).thenReturn(returned_product);
        ProductPojo mocked_product = productService.getAProductService(1);
        Assert.assertEquals(returned_product.getProductSku(), "1234");

    }
}
