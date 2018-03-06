package es.urjc.etsii;

import javax.persistence.*;


/* Al anotar una clase con @Entity se indica a JPA que se trata de un objeto que tendrá
   su tabla equivalente en la base de datos. */

@Entity
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String fecha;
    @OneToOne
    private Usuario jugador;
    @OneToOne
    private Juego juego;
    private int duracion;

    public Partida(String fecha, Usuario jugador, Juego juego, int duracion) {
        this.fecha = fecha;
        this.jugador = jugador;
        this.juego = juego;
        this.duracion = duracion;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getJugador() {
        return jugador;
    }

    public void setJugador(Usuario jugador) {
        this.jugador = jugador;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
