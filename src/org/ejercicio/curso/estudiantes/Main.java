package org.ejercicio.curso.estudiantes;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Grupo matematicas = new Grupo("Matematicas", 5);
        Grupo fisica = new Grupo("Fisica", 4);

        
        Estudiante ana = new Estudiante("Ana");
        Estudiante carlos = new Estudiante("Carlos",Matematicas);
        Estudiante luis = new Estudiante("Luis", fisica);
        Estudiante Maria = new Estudiante("Maria");

        
        ArrayList<Estudiante> EstudiantesFmat = new ArrayList<>();
        EstudiantesFmat.add(ana);
        EstudiantesFmat.add(carlos);
        EstudiantesFmat.add(luis);
        EstudiantesFmat.add(Maria);

       
        for (Estudiante e : EstudiantesFmat) {
            System.out.println(e);
        }
    }
}
