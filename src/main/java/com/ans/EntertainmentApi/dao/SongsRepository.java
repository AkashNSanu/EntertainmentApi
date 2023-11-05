package com.ans.EntertainmentApi.dao;

import com.ans.EntertainmentApi.Entity.Songs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongsRepository extends JpaRepository<Songs, Integer> {
}
