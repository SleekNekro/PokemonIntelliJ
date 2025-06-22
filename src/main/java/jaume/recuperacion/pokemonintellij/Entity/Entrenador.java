package jaume.recuperacion.pokemonintellij.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "ENTRENADORES")
public class Entrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int edad;

    @OneToMany(mappedBy = "entrenador", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Pokemon> pokemonList;

    @OneToOne(mappedBy = "entrenador", cascade = CascadeType.ALL)
    @JsonManagedReference
    private DetallesEntrenador detallesEntrenador;


    public Entrenador() {
    }

    public Entrenador(int id, String nombre, int edad, DetallesEntrenador detallesEntrenador, List<Pokemon> pokemonList) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.detallesEntrenador = detallesEntrenador;
        this.pokemonList = pokemonList;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public DetallesEntrenador getDetallesEntrenador() {
        return detallesEntrenador;
    }

    public void setDetallesEntrenador(DetallesEntrenador detallesEntrenador) {
        this.detallesEntrenador = detallesEntrenador;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }
}
