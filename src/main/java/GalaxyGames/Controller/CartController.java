package GalaxyGames.Controller;
import GalaxyGames.Service.CartService;
import GalaxyGames.Model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

// Mohammed's code

@RestController
@RequestMapping("cart")

public  class CartController {
    CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }


    @PostMapping
    public void saveCart(@RequestBody Cart c){
        cartService.saveCart(c);
    }

    @GetMapping
    public List<Cart> getAllCarts(){
        return cartService.getAllCarts();
    }

    @GetMapping("{id}")
    public  Cart getCartById(@RequestBody Cart c, @PathVariable int id){
        return cartService.getCartById(id);
    }

    @GetMapping("{chekout_Id}")
    public  Cart getCartByCheckOutById(@PathVariable int checkout_Id){
        return cartService.getCartCheckoutId(checkout_Id);
        // IS changed letter "o" to lowercase
    }
}