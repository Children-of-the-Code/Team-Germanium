package GalaxyGames.Repository;

import GalaxyGames.Model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PurchaseRepo extends JpaRepository<Purchase, Integer> {

    @Query("FROM Purchase where purchase_ID = :purchase_ID")
    public Purchase findOrderById(@Param("purchase_ID") int id);

    @Query("FROM Purchase")
    List<Purchase> findAllPurchases();
}

