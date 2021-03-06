package GalaxyGames.Repository;

import GalaxyGames.Model.Games;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface GameRepo extends JpaRepository<Games, Integer> {

    // TO GET GAMES BY ID
    @Query("FROM Games where game_ID = :game_ID")
    Games findGameById(@Param("game_ID") int id);

    @Query("FROM Games")
    List<Games> findAllGames();

    /*
    @Query("FROM Games where name = (select max(name) from Games)")
    Games findGamesAlphabetically();
    */


}
