package jaume.recuperacion.pokemonintellij.Repository;

import jaume.recuperacion.pokemonintellij.Entity.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepository extends JpaRepository<Movimiento, Integer> {
}
