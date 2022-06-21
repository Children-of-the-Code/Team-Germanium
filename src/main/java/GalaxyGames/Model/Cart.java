package GalaxyGames.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Data
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






}
