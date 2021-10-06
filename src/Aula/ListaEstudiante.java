package Aula;

import javax.swing.*;
import javax.xml.namespace.QName;
import java.util.*;

import static Aula.Main.*;

public class ListaEstudiante {

    ArrayList <Estudiante> ListaEstudiante = new ArrayList<>();

    public String Input(String text){
        return JOptionPane.showInputDialog(text);
    }

    public void addEstudiante(){
        String name = Input("Nombre de estudiante");
        String age = Input("Edad de estudiante");
        String gender = Input("Género de estudiante");
        double[][] asignatura = new double[cantAsignaturas][cantNotas];
        Estudiante estudiante = new Estudiante(name,age,gender,asignatura);
        estudiante.setName(name);
        estudiante.setAge(age);
        estudiante.setGender(gender);
        this.ListaEstudiante.add(estudiante);
    }
    public Estudiante getEstudiante(int IDEstudiante){
        return this.ListaEstudiante.get(IDEstudiante);
    }

    public void setEstudiante(int IDEstudiante, Estudiante estudiante) {
        this.ListaEstudiante.set(IDEstudiante,estudiante);
    }
}
