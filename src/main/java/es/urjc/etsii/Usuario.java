package es.urjc.etsii;

import javax.persistence.*;


/* Al anotar una clase con @Entity se indica a JPA que se trata de un objeto que tendrá
   su tabla equivalente en la base de datos. */

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    /* El atributo anotado como @Id será la clave primaria, aquí incremental. */

    private String username, pass, nombre, apellidos, email, fecha, pais, ciudad, perfil;
    private Boolean estado;

    public Usuario(String username, String pass, String nombre, String apellidos, String email, String fecha, String pais, String ciudad, String perfil, Boolean estado) {
        this.username = username;
        this.pass = pass;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.fecha = fecha;
        this.pais = pais;
        this.ciudad = ciudad;
        this.perfil = perfil;
        this.estado = estado;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}

