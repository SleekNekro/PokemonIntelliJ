package jaume.recuperacion.pokemonintellij.Controller;


import jaume.recuperacion.pokemonintellij.Entity.DetallesEntrenador;
import jaume.recuperacion.pokemonintellij.Entity.Entrenador;
import jaume.recuperacion.pokemonintellij.Entity.Movimiento;
import jaume.recuperacion.pokemonintellij.Entity.Pokemon;
import jaume.recuperacion.pokemonintellij.Service.DetallesEntrenadorService;
import jaume.recuperacion.pokemonintellij.Service.EntrenadorService;
import jaume.recuperacion.pokemonintellij.Service.MovimientoService;
import jaume.recuperacion.pokemonintellij.Service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ControllerTodo {

    private static final Logger logger = Logger.getLogger(ControllerTodo.class.getName());

    @Autowired
    private EntrenadorService entrenadorService;

    @Autowired
    private DetallesEntrenadorService detallesEntrenadorService;

    @Autowired
    private PokemonService pokemonService;

    @Autowired
    private MovimientoService movimientoService;

    @GetMapping("/entrenadores")
    public List<Entrenador> getAllEntrenadores() {
        List<Entrenador> entrenadores = entrenadorService.findAll();
        logger.info("Entrenadores recuperados: " + entrenadores.size());
        return entrenadores;
    }

    @PostMapping("/entrenadores")
    public Entrenador addEntrenador(@RequestBody Entrenador entrenador) {
        return entrenadorService.save(entrenador);
    }

    @PutMapping("/entrenadores/{id}")
    public Entrenador updateEntrenador(@PathVariable int id, @RequestBody Entrenador entrenador) {
        entrenador.setId(id);
        return entrenadorService.save(entrenador);
    }

    @DeleteMapping("/entrenadores/{id}")
    public void deleteEntrenador(@PathVariable int id) {
        entrenadorService.deleteById(id);
    }

    @GetMapping("/detallesEntrenadores")
    public List<DetallesEntrenador> getAllDetallesEntrenadores() {
        return detallesEntrenadorService.findAll();
    }

    @PostMapping("/detallesEntrenadores")
    public DetallesEntrenador addDetallesEntrenador(@RequestBody DetallesEntrenador detallesEntrenador) {
        return detallesEntrenadorService.save(detallesEntrenador);
    }

    @PutMapping("/detallesEntrenadores/{id}")
    public DetallesEntrenador updateDetallesEntrenador(@PathVariable int id, @RequestBody DetallesEntrenador detallesEntrenador) {
        detallesEntrenador.setId(id);
        return detallesEntrenadorService.save(detallesEntrenador);
    }

    @DeleteMapping("/detallesEntrenadores/{id}")
    public void deleteDetallesEntrenador(@PathVariable int id) {
        detallesEntrenadorService.deleteById(id);
    }

    @GetMapping("/pokemons")
    public List<Pokemon> getAllPokemons() {
        List<Pokemon> pokemons = pokemonService.findAll();
        logger.info("Pokemons recuperados: " + pokemons.size());
        return pokemons;
    }

    @PostMapping("/pokemons")
    public Pokemon addPokemon(@RequestBody Pokemon pokemon) {
        return pokemonService.save(pokemon);
    }

    @PutMapping("/pokemons/{id}")
    public Pokemon updatePokemon(@PathVariable int id, @RequestBody Pokemon pokemon) {
        pokemon.setId(id);
        return pokemonService.save(pokemon);
    }

    @DeleteMapping("/pokemons/{id}")
    public void deletePokemon(@PathVariable int id) {
        pokemonService.deleteById(id);
    }

    @GetMapping("/movimientos")
    public List<Movimiento> getAllMovimientos() {
        List<Movimiento> movimientos = movimientoService.findAll();
        logger.info("Movimientos recuperados: " + movimientos.size());
        return movimientos;
    }

    @PostMapping("/movimientos")
    public Movimiento addMovimiento(@RequestBody Movimiento movimiento) {
        return movimientoService.save(movimiento);
    }

    @PutMapping("/movimientos/{id}")
    public Movimiento updateMovimiento(@PathVariable int id, @RequestBody Movimiento movimiento) {
        movimiento.setId(id);
        return movimientoService.save(movimiento);
    }

    @DeleteMapping("/movimientos/{id}")
    public void deleteMovimiento(@PathVariable int id) {
        movimientoService.deleteById(id);
    }
}
