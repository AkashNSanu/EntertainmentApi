package com.ans.EntertainmentApi.dao;

import com.ans.EntertainmentApi.Entity.Games;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamesRepository extends JpaRepository<Games, Integer> {
}
