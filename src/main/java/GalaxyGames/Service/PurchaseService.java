package GalaxyGames.Service;

import GalaxyGames.Model.Purchase;
import GalaxyGames.Repository.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PurchaseService {

    PurchaseRepo purchaseRepo;

    @Autowired
    public PurchaseService(PurchaseRepo purchaseRepo){
        this.purchaseRepo = purchaseRepo;
    }

    // TO GET PURCHASE BY ID
    public Purchase getPurchaseById(int id){
        return purchaseRepo.findOrderById(id);
    }


    // TO GET ALL PURCHASES
    public List<Purchase> getAllPurchases() {
        return purchaseRepo.findAllPurchases();
    }


    // TO CREATE A NEW PURCHASE
    public void savePurchase(Purchase p) {
        purchaseRepo.save(p);
    }

}
