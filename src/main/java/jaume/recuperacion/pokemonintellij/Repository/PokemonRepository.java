package jaume.recuperacion.pokemonintellij.Repository;

import jaume.recuperacion.pokemonintellij.Entity.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {
}
