package com.ans.EntertainmentApi.Service;

import com.ans.EntertainmentApi.Entity.Games;
import com.ans.EntertainmentApi.dao.GamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GamesServiceImpl implements GamesService{

    private GamesRepository gamesRepository;

    @Autowired
    public GamesServiceImpl(GamesRepository gamesRepository) {
        this.gamesRepository = gamesRepository;
    }

    @Override
    public List<Games> findAll() {
        return gamesRepository.findAll();
    }

    @Override
    public Games findById(int gameId) {
        Optional<Games> result = gamesRepository.findById(gameId);
        Games theGame = null;
        if(result.isPresent()){
            theGame=result.get();
        }
        else {
            throw new RuntimeException("Did not find Game id - "+gameId);
        }
        return theGame;
    }

    @Override
    public Games save(Games theGame) {
        Games game = gamesRepository.save(theGame);
        return game;
    }

    @Override
    public void deleteById(int gameId) {
        gamesRepository.deleteById(gameId);
    }
}
