package es.urjc.etsii;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/* Al anotar una clase con @Entity se indica a JPA que se trata de un objeto que tendrá
   su tabla equivalente en la base de datos. */

@Entity
public class Juego {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    /* El atributo anotado como @Id será la clave primaria, aquí incremental. */

    private String nombre, version, year, studio, pais, edad, descripcion, img, youtube, valoracion, precio;

    public Juego(String nombre, String version, String year, String studio, String pais, String edad, String descripcion, String img, String youtube, String valoracion, String precio) {
        this.nombre = nombre;
        this.version = version;
        this.year = year;
        this.studio = studio;
        this.pais = pais;
        this.edad = edad;
        this.descripcion = descripcion;
        this.img = img;
        this.youtube = youtube;
        this.valoracion = valoracion;
        this.precio = precio;
    }

    public Long getId() {
        return Id;
    }

    public void setIduser(Long iduser) {
        this.Id = iduser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getYoutube() {
        return youtube;
    }

    public void setYoutube(String youtube) {
        this.youtube = youtube;
    }

    public String getValoracion() {
        return valoracion;
    }

    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}

