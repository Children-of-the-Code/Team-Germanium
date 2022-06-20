package GalaxyGames.Service;

import GalaxyGames.Repository.CartRepo;
import GalaxyGames.Model.Cart;
import GalaxyGames.Repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


// Mohammed's code

@Component
public class CartService {
    CartRepo cartDAO;
    @Autowired
    public CartService(CartRepo cartDAO) {
        this.cartDAO = cartDAO;
    }
    public void saveCart(Cart c){
        cartDAO.save(c);
    }
    public List<Cart> getAllCarts(){
        return cartDAO.FindAllCart();
    }
    public  Cart getCartById(int id){
        return cartDAO.FindCartById(id);

    }
    public Cart getCartCheckoutId(int checkout_Id){     // IS changed letter "o" to lowercase
        return cartDAO.findAllCartCheckOutId(checkout_Id);
    }


}