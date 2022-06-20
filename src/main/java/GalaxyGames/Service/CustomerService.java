package GalaxyGames.Service;

import GalaxyGames.Model.Customer;
import GalaxyGames.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class CustomerService {

    CustomerRepo customerRepo;

    @Autowired
    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }

    // TO GET CUSTOMER BY ID
    public Customer getCustomerById(int id){
        return customerRepo.findCustomerById(id);
    }

    // TO GET CUSTOMER BY USERNAME
    public Customer getCustomerByUsername(String name){
        return customerRepo.findCustomerByUsername(name);
    }

    // TO GET ALL CUSTOMERS
    public List<Customer> getAllCustomers(){
        return customerRepo.findAllCustomers();
    }


    // TO CHECK IF CUSTOMERS EXISTS BY ID
    public boolean checkIfCustomerExistsById(int id){
        Customer c = customerRepo.findCustomerById(id);
        if(c == null){
            return false;
        }
        return true;
    }

    // TO CHECK IF CUSTOMER EXISTS BY USERNAME
    public boolean checkIfCustomerExistsByUsername(String name){
        Customer c = customerRepo.findCustomerByUsername(name);
        if(c == null){
            return false;
        }
        return true;
    }


    // TO CREATE A NEW CUSTOMER
    public void saveCustomer(Customer c){
        customerRepo.save(c); // save - a JPA method in Spring

    }


}
