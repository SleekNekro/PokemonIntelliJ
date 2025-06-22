package jaume.recuperacion.pokemonintellij.Entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "POKEMON")
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "entrenador_id")
    @JsonBackReference
    private Entrenador entrenador;

    @ManyToMany
    @JoinTable(
            name = "pokemon_movimientos",
            joinColumns = @JoinColumn(name = "pokemon_id"),
            inverseJoinColumns = @JoinColumn(name = "movimiento_id")
    )
    @JsonManagedReference
    private List<Movimiento> movimientos;



    public Pokemon() {
    }

    public Pokemon(int id, String nombre, String tipo, Entrenador entrenador, List<Movimiento> movimientos) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.entrenador = entrenador;
        this.movimientos = movimientos;
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

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
}
