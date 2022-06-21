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

    private int checkout_ID;

    @ManyToOne
    @JoinColumn(name = "game_ID")
    public Games games;

    @ManyToOne
    @JoinColumn(name = "customer_ID")
    public Customer customer;

    @Column
    private float totalPrice;

    @Column
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int user_Id;

    @Column(unique = true)
    private int checkOut_Id;

    @Column
    private int product_Id;

    @Column
    private float totalPrice;







}
