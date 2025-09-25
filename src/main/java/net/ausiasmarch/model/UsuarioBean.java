package net.ausiasmarch.model;

public class UsuarioBean {
    
    private Long id;
    private String username;
    private String nombre;
    private String apellido1;
    private String apellido2;

    public UsuarioBean() {
        this.id = 0L;
        this.username = "";
        this.nombre = "";
        this.apellido1 = "";
        this.apellido2 = "";
    }

    public UsuarioBean(Long id, String username, String nombre, String apellido1, String apellido2) {
        this.id = id;
        this.username = username;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
}
