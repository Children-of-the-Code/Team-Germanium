package GalaxyGames.Repository;

import GalaxyGames.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import java.util.List;

@Component

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

    @Query("FROM Customer where customer_ID = :customer_ID")
    Customer findCustomerById(@Param("customer_ID") int id);

    @Query("FROM Customer where username = :username")
    Customer findCustomerByUsername(@Param("username") String name);

    @Query("FROM Customer")
    List<Customer> findAllCustomers();

}
