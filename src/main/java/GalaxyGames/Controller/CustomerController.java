package GalaxyGames.Controller;


import GalaxyGames.Model.Customer;
import GalaxyGames.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }


    // TO GET CUSTOMER BY ID
    @GetMapping("id/{id}")
    public Customer getCustomerById(@PathVariable int id){
        return customerService.getCustomerById(id);
    }


    // TO GET CUSTOMER BY USERNAME
    @GetMapping("username/{name}")
    public Customer getCustomerByUsername(@PathVariable String name){
        return customerService.getCustomerByUsername(name);
    }


    // TO GET ALL CUSTOMER

    @GetMapping("all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }


    // TO CHECK IF CUSTOMERS EXISTS BY ID
    @GetMapping("idexists/{id}")
    public boolean checkIfCustomerExistsById(@PathVariable int id){
        return customerService.checkIfCustomerExistsById(id);
    }


    // TO CHECK IF CUSTOMER EXISTS BY USERNAME
    @GetMapping("nameexists/{name}")
    public boolean checkIfCustomerExistsByUsername(@PathVariable String name){
        return customerService.checkIfCustomerExistsByUsername(name);
    }


    // TO CREATE A NEW CUSTOMER

    @PostMapping("register")

    public void saveCustomer(@RequestBody Customer c){
        customerService.saveCustomer(c);
    }


}


