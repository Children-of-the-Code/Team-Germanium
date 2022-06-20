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
    @Column
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int user_Id;
    @Column(unique = true)
    private int checkOut_Id;
    @Column
    private int product_Id;
    @Column
    private  float totalPrice;






}
