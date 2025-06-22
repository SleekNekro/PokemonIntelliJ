package jaume.recuperacion.pokemonintellij.Service;


import jaume.recuperacion.pokemonintellij.Entity.Pokemon;
import jaume.recuperacion.pokemonintellij.Repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> findAll() {
        return pokemonRepository.findAll();
    }

    public Optional<Pokemon> findById(int id) {
        return pokemonRepository.findById(id);
    }

    public Pokemon save(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public void deleteById(int id) {
        pokemonRepository.deleteById(id);
    }
}
