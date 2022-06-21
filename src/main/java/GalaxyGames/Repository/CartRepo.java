package GalaxyGames.Repository;

import GalaxyGames.Model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


public interface CartRepo extends JpaRepository<Cart, Integer> {
    @Query("FROM Cart")
    List<Cart> FindAllCart();

    @Query("From Cart where cart_ID  = :cart_ID ")
    Cart FindCartById(@Param("cart_ID") int id);

    @Query(" From Cart where purchase_ID =  :purchase_ID ")
    Cart findAllCartByPurchaseId(@Param("purchase_ID") int id);


    @Query(" From Cart where game_ID =  :game_ID ")
    Cart findAllCartByGameId(@Param("game_ID") int id);


}