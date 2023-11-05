package com.ans.EntertainmentApi.Rest;

import com.ans.EntertainmentApi.Entity.Games;
import com.ans.EntertainmentApi.Service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/EntertainmentApi")
public class GamesRestController {

    private GamesService gamesService;

    @Autowired
    public GamesRestController(GamesService gamesService) {
        this.gamesService = gamesService;
    }

    @GetMapping("/games")
    public List<Games> getAllGames(){
        List<Games> theGames = gamesService.findAll();
        return theGames;
    }

    @GetMapping("/games/{gameId}")
    public Games getGameById(@PathVariable int gameId){
        Games theGame = gamesService.findById(gameId);
        return theGame;
    }

    @PostMapping("/games")
    public Games addTheNewGame(@RequestBody Games theGame){
        theGame.setId(0);
        Games dbGames = gamesService.save(theGame);
        return dbGames;
    }

    @PutMapping("/games")
    public Games updateTheGameInfo(@RequestBody Games theGame){
        Games dbGames = gamesService.save(theGame);
        return dbGames;
    }

    @DeleteMapping("/games/{gameId}")
    public String deleteTheGameById(@PathVariable int gameId){
        Games theGame = gamesService.findById(gameId);
        if(theGame == null){
            throw new RuntimeException("Did not find Game id - "+gameId);
        }
        gamesService.deleteById(gameId);
        return "Deleted Game with Id - "+gameId;
    }
}
