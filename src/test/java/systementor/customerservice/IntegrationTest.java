package systementor.customerservice;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import systementor.customerservice.model.Customer;
import systementor.customerservice.repo.CustomerRepository;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest

public class IntegrationTest {

   @Autowired
    CustomerRepository customerRepository;

   @BeforeEach
    void setup() {
       customerRepository.deleteAll();
   }

   @Test
    void createAndFetchUser(){
       Customer customer = new Customer();
       customer.setId(1L);
       customer.setName("Alex");

       customerRepository.save(customer);

       List<Customer> customers = customerRepository.findAll();

       assertEquals(1, customers.size());
       assertEquals("Alex", customers.get(0).getName());
   }

}
