package GalaxyGames.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity

public class Games {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int game_ID;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private String price;

}
