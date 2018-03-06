package es.urjc.etsii;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ControladorPrincipal {

    @Autowired
    private RepositorioJuegos repositorio;

    @PostConstruct
    private void initDatabase() {
        //repositorio.save(new Juego("Juego1","1.1","2018","Ubisoft","España","12","Muy Chuli","img.jpg","werwerwe","4","23.87"));

    }


}