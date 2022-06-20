package GalaxyGames.Service;

import GalaxyGames.Model.Games;
import GalaxyGames.Repository.GameRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
public class GameService{

    GameRepo gameRepo;


    @Autowired
    public GameService(GameRepo gameRepo){
        this.gameRepo = gameRepo;
    }

    // TO GET ALL GAMES
    public List<Games> getAllGames() {
        return gameRepo.findAllGames();
    }

    // TO GET GAME BY ID
    public Games getGameById(int id) {
        return gameRepo.findGameById(id);
    }

    // TO CREATE A NEW GAME
    public void saveGame(Games g) {
        gameRepo.save(g);
    }
}


