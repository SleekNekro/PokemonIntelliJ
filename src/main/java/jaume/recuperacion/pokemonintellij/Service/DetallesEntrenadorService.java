package jaume.recuperacion.pokemonintellij.Service;



import jaume.recuperacion.pokemonintellij.Entity.DetallesEntrenador;
import jaume.recuperacion.pokemonintellij.Repository.DetallesEntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetallesEntrenadorService {

    @Autowired
    private DetallesEntrenadorRepository detallesEntrenadorRepository;

    public List<DetallesEntrenador> findAll() {
        return detallesEntrenadorRepository.findAll();
    }

    public Optional<DetallesEntrenador> findById(int id) {
        return detallesEntrenadorRepository.findById(id);
    }

    public DetallesEntrenador save(DetallesEntrenador detallesEntrenador) {
        return detallesEntrenadorRepository.save(detallesEntrenador);
    }

    public void deleteById(int id) {
        detallesEntrenadorRepository.deleteById(id);
    }
}
