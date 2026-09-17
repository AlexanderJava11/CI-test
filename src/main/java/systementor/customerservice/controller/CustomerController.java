package systementor.customerservice.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import systementor.customerservice.model.Customer;
import systementor.customerservice.repo.CustomerRepository;

@RestController
public class CustomerController {

    private final CustomerRepository repo;

    public CustomerController(CustomerRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/customer")
    public String getCustomer() {
        return repo.findById(1L).map(Customer::getName)
                .orElse("Unknown customer");
    }



}
