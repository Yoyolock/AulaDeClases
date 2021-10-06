package Aula;

import javax.swing.*;
import java.util.*;

import static Aula.Main.*;

public class ListaProfesor {

    ArrayList <Profesor> ListaProfesor = new ArrayList<>();

    public String Input(String text){
        return JOptionPane.showInputDialog(text);
    }

    public void addProfesor(){
        String name = Input("Nombre de Docente");
        String age = Input("Edad de Docente");
        String gender = Input("Género de Docente");
        String[][][] imparteAsignatura = new String[NSemana][NDias][eventos];
        Profesor profesor = new Profesor(name,age,gender,imparteAsignatura);
        profesor.setName(name);
        profesor.setAge(age);
        profesor.setGender(gender);
        this.ListaProfesor.add(profesor);
    }
    public Profesor getProfesor(int IDProfesor){
        return this.ListaProfesor.get(IDProfesor);
    }
    public void setProfesor(int IDProfesor, Profesor profesor){
        this.ListaProfesor.set(IDProfesor,profesor);
    }
}
