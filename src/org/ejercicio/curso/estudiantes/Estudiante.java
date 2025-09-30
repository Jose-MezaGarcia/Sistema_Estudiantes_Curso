package org.ejercicio.curso.estudiantes;

public class Estudiante {
    private String nombre;
    private Grupo grupo;

    
    public Estudiante(String nombre, Grupo grupo) {
        this.nombre = nombre;
        this.grupo = grupo;
    }

    
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.grupo = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

   
}
