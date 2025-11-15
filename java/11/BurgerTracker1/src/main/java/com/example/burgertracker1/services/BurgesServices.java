package com.example.burgertracker1.services;

import com.example.burgertracker1.models.Burger;
import com.example.burgertracker1.repositories.BurgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BurgesServices {
    @Autowired
    BurgerRepository burgerRepository;



    public Burger createBurger(Burger burger) {
        return burgerRepository.save(burger);
    }
    public Burger updateBurger(Burger burger) {
        return burgerRepository.save(burger);
    }


    public Burger findbyid(long id ){
        Optional <Burger> optional = burgerRepository.findById(id);
        Burger burger =  optional.orElse(null);
        return burger;
    }
    public void delete(Burger burger) {
        burgerRepository.delete(burger);
    }


    public List<Burger> findAll(){
        return burgerRepository.findAll();
    }


}
