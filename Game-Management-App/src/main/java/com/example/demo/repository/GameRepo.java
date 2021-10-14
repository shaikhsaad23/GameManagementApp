package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Game;

@Repository
public interface GameRepo extends JpaRepository<Game, Integer>{

}
