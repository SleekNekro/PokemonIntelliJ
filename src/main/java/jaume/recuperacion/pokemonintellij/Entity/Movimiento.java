package jaume.recuperacion.pokemonintellij.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "MOVIMIENTOS")
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String tipo;

    @ManyToMany(mappedBy = "movimientos")
    @JsonBackReference
    private List<Pokemon> pokemons;


    public Movimiento() {
    }

    public Movimiento(int id, String nombre, String tipo, List<Pokemon> pokemons) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.pokemons = pokemons;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
