package jaume.recuperacion.pokemonintellij.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity(name = "DETALLESENTRENADORES")
public class DetallesEntrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String region;

    @OneToOne
    @JoinColumn(name = "entrenador_id")
    @JsonBackReference
    private Entrenador entrenador;


    // Getters and Setters

    public DetallesEntrenador() {
    }

    public DetallesEntrenador(int id, String region, Entrenador entrenador) {
        this.id = id;
        this.region = region;
        this.entrenador = entrenador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }
}