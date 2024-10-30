package com.example.Spaceship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spaceship.models.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long>{
        
}
