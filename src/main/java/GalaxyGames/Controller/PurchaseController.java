package GalaxyGames.Controller;


import GalaxyGames.Model.Purchase;
import GalaxyGames.Service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PurchaseController {

    // I WANT THE CLASS TO BECOME A VARIABLE
    PurchaseService purchaseService;

    // THIS CONSTRUCTOR TELLS ME THAT THE METHODS WRITTEN IN
    // PURCHASE SERVICE WOULD BE PULLED DURING HTTP REQUESTS BELOW IT
    @Autowired
    public PurchaseController(PurchaseService purchaseService){
        this.purchaseService = purchaseService;
    }

    /**
     @AutoWired = automatically injects the dependent bean
      *            into this POJO class
     **/

    // TO GET PURCHASE BY ID
    @GetMapping("purchase/{id}")
    public Purchase getPurchaseById(@PathVariable int id){
        return purchaseService.getPurchaseById(id);
    }

    // TO GET ALL PURCHASES
    @GetMapping("purchase/all")
    public List<Purchase> getAllPurchases(){
        return purchaseService.getAllPurchases();
    }

    // TO CREATE A NEW ORDER
    @PostMapping("purchase/new")
    public void savePurchase(@RequestBody Purchase p){
        purchaseService.savePurchase(p);
    }

}
