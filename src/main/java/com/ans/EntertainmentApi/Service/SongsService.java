package com.ans.EntertainmentApi.Service;

import com.ans.EntertainmentApi.Entity.Songs;

import java.util.List;

public interface SongsService {
    List<Songs> findAll();

    Songs findById(int songId);

    Songs save(Songs theSong);

    void deleteById(int songId);
}
