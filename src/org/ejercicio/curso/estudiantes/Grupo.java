public class grupo{
    package org.ejercicio.curso.estudiantes;

public class Grupo {
    private String nombreGrupo;
    private int creditos;

    public Grupo() {
        this.nombreGrupo = "";
        this.creditos = 0;
    }

    public Grupo(String nombreGrupo, int creditos) {
        this.nombreGrupo = nombreGrupo;
        this.creditos = creditos;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}

}