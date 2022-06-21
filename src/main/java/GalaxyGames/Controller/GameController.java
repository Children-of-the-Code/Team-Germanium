package GalaxyGames.Controller;


import GalaxyGames.Model.Games;
import GalaxyGames.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("games")
public class GameController {

    GameService gameService;

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    // TO GET ALL GAMES
    @GetMapping("all")
    public List<Games> getAllGames(){
        return gameService.getAllGames();
    }

    // TO GET GAMES BY ID
    @GetMapping("{id}")
    public Games getGameById(@PathVariable int id){
        return gameService.getGameById(id);
    }

    // TO GET GAMES BY NAME
    @GetMapping("{name}")
    public Games getGameByName(@PathVariable String name){
        return gameService.getGameByName(name);
    }

    // TO GET GAMES ALPHABETICALLY


    // TO CREATE A NEW GAME
    @PostMapping("games/new")
    public void saveGame(@RequestBody Games g){
        gameService.saveGame(g);
    }


}
