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
<<<<<<< HEAD
    @GetMapping("all")
=======
    @GetMapping("games/all")
>>>>>>> 4d97d0eb141ff57bcf4bfe250416caf6321f9387
    public List<Games> getAllGames(){
        return gameService.getAllGames();
    }

    // TO GET GAMES BY ID
    @GetMapping("{id}")
    public Games getGameById(@PathVariable int id){
        return gameService.getGameById(id);
    }

    // TO GET GAMES BY NAME
<<<<<<< HEAD
    @GetMapping("{name}")
    public Games getGameByName(@PathVariable String name){
        return gameService.getGameByName(name);
=======
    @GetMapping("games/{id}")
    public Games getGameById(@PathVariable int id){
        return gameService.getGameById(id);
>>>>>>> 4d97d0eb141ff57bcf4bfe250416caf6321f9387
    }

    // TO GET GAMES ALPHABETICALLY


    // TO CREATE A NEW GAME
    @PostMapping("games/new")
    public void saveGame(@RequestBody Games g){
        gameService.saveGame(g);
    }


}
