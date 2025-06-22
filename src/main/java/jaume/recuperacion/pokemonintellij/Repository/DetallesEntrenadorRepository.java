package jaume.recuperacion.pokemonintellij.Repository;

import jaume.recuperacion.pokemonintellij.Entity.DetallesEntrenador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetallesEntrenadorRepository extends JpaRepository<DetallesEntrenador, Integer> {
}
