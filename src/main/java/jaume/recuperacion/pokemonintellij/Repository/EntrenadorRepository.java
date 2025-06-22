package jaume.recuperacion.pokemonintellij.Repository;

import jaume.recuperacion.pokemonintellij.Entity.Entrenador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrenadorRepository extends JpaRepository<Entrenador, Integer> {
}
