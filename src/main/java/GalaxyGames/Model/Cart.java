package GalaxyGames.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cart {

    @Id
    @Column(unique = true)
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int cart_ID;


    @ManyToOne
    @JoinColumn(name = "game_ID")
    public Games games;

    @ManyToOne
    @JoinColumn(name = "customer_ID")
    public Customer customer;

    @ManyToOne
    @JoinColumn(name = "purchase_ID")
    public Purchase purchase;

    @Column
    private float totalPrice;











}
