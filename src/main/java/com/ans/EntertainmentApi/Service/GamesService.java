package com.ans.EntertainmentApi.Service;

import com.ans.EntertainmentApi.Entity.Games;

import java.util.List;

public interface GamesService {
    List<Games> findAll();

    Games findById(int gameId);

    Games save(Games theGame);

    void deleteById(int gameId);
}
