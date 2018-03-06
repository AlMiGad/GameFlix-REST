package es.urjc.etsii;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioJuegos extends CrudRepository<Juego,Long> {

    List<Juego> findByNombre(String nombre);

}
