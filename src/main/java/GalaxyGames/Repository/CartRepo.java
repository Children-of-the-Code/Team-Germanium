package GalaxyGames.Repository;

import GalaxyGames.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

// Mohammed's code

public interface CartRepo extends JpaRepository<Cart, Integer> {
    @Query("FROM Cart")
    List<Cart> FindAllCart();

    @Query("From Cart where User_Id  = :user_Id ")
    Cart FindCartById(@Param("user_Id") int id);

    @Query(" From Cart where checkout_Id =  :checkout_Id ")
    Cart findAllCartCheckOutId(@Param("checkout_Id") int id);
        // IS changed letter "o" to lowercase
}