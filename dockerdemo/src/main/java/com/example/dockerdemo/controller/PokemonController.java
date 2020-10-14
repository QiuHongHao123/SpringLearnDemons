package com.example.dockerdemo.controller;

import com.example.dockerdemo.entity.Pokemon;
import com.example.dockerdemo.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PokemonController {

    @Autowired
    private PokemonRepository pokemonRepository;

    @PostMapping("/pokemons")
    public Pokemon create(@RequestBody Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    @RequestMapping(value = "/pokemons", method = RequestMethod.GET)
    public List<Pokemon> findAll() {
        return pokemonRepository.findAll();
    }

    @PutMapping("/pokemons/{pokemon_id}")
    public Pokemon update(@PathVariable("pokemon_id") Long pokemonId, @RequestBody Pokemon pokemonObject) {
        Pokemon pokemon = pokemonRepository.getOne(pokemonId);
        pokemon.setName(pokemonObject.getName());
        pokemon.setPower(pokemonObject.getPower());
        return pokemonRepository.save(pokemon);
    }

}