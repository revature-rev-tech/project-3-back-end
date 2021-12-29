import com.project3.revtech.dao.ProductRepository;
import com.project3.revtech.entity.Product;
import com.project3.revtech.exception.ApplicationException;
import com.project3.revtech.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductTesting {
    /*

    @Autowired
    private ProductService service;

    @MockBean
    private ProductRepository repository;

    //Test to get a Product
    @Test
    public  void getAProductTest() throws ApplicationException {

        //Call the when method & return the data within
        when(repository.findAll()).thenReturn((List<Product>) Stream.of(
                new Product(4, "C09H11R00234", "MSound-79",
                new BigDecimal(350.21), "Head Phones",
                 "Amazing Sound, bass etc, Noise Cancelling features better than  Apple.",
                6, "http://pexels.com/img40", false)).collect(Collectors.toList()));

        //The expected outcome productID to be 4
        assertEquals(4, service.getAProductService(4).getProductId());
    }

    //Test for Getting all Products
    @Test
    public  void getAllProductTest() throws ApplicationException {

        List list = repository.findAll();
        assertThat(list).size().isGreaterThan(0);


        //Call the when method & return the data within
        when(repository.findAll()).thenReturn((List<Product>) Stream.of(
                new Product(4, "C09H11R00234", "MSound-79",
                        new BigDecimal(350.21), "Head Phones",
                        "Amazing Sound, bass etc, Noise Cancelling features better than  Apple.",
                        6, "http://pexels.com/img40", false)).collect(Collectors.toList()));

        //The expected outcome productID to be 4
        assertEquals(4, service.getAProductService(4).getProductId());


    }

    // Test for Creating a Product
    @Test
    public  void createProductTest() throws ApplicationException {
        //
        when(repository.saveAllAndFlush()).thenReturn((List<Product>) Stream.of(
                new Product(9, "VFG90123HK", "Keyboard Xmap",
                        new BigDecimal(120.71), "PC accessories",
                        "Bluetooth PC Keyboard German Version.",
                        2, "http://pexels.com/img33", false)).collect(Collectors.toList()));

    }

    // Test for Updating  a Product

    // Test for Deleting  a Product

     */
}
