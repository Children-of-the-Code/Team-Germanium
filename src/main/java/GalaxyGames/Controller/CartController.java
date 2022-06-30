package GalaxyGames.Controller;
import GalaxyGames.Service.CartService;
import GalaxyGames.Model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;


@CrossOrigin(origins = "*", allowedHeaders = "*")

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

    @GetMapping("{game_ID}")
    public  Cart getCartByGameId(@PathVariable int id){
        return cartService.getCartByGameId(id);
    }

    @GetMapping("{product_ID}")
    public  Cart getCartByPurchaseId(@PathVariable int id){
        return cartService.getCartByPurchaseId(id);
    }

}