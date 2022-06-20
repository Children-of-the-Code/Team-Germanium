package GalaxyGames.Controller;


import GalaxyGames.Model.Games;
import GalaxyGames.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class GameController {

    GameService gameService;

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    // TO GET ALL GAMES
    @GetMapping("games/all")
    public List<Games> getAllGames(){
        return gameService.getAllGames();
    }

    // TO GET GAMES BY NAME
    @GetMapping("games/{id}")
    public Games getGameById(@PathVariable int id){
        return gameService.getGameById(id);
    }

    // TO GET GAMES ALPHABETICALLY


    // TO CREATE A NEW GAME
    @PostMapping("games/new")
    public void saveGame(@RequestBody Games g){
        gameService.saveGame(g);
    }


}
