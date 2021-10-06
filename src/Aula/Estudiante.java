package Aula;

import javax.swing.*;
import javax.swing.text.html.Option;

public class Estudiante extends Humano {

    private double[][] Asignatura;

    public Estudiante(String name, String age, String gender, double[][] Asignatura) {
        super(name, age, gender);
        this.Asignatura = Asignatura;
    }
    public String Input(String text){
        return JOptionPane.showInputDialog(text);
    }

    public double[][] getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura() {
        int NAsignatura, NPrueba, opcion, shownotas, NFisica, NMatematicas, NFilosofia;
        double Calificacion;
        do {
            //posicion 0 = Fisica, posición 1 = matematicas, posicion 2 = filosofia
            NAsignatura = Integer.parseInt(JOptionPane.showInputDialog("¿A cual asignatura desea ingresar calificaciones? \n" +
                                                                        "1. Física \n" +
                                                                        "2. Matemáticas \n" +
                                                                        "3. Filosofía \n"));
            NPrueba = Integer.parseInt(JOptionPane.showInputDialog("¿Cual exámen desea modificar? \n" +
                                                                    "1. Exámen 1 \n" +
                                                                    "2. Exámen 2 \n" +
                                                                    "3. Exámen 3 \n" +
                                                                    "4.Exámen 4 \n"));
            Calificacion = Double.parseDouble(JOptionPane.showInputDialog("¿Qué calificación desea insertar?"));
            this.Asignatura[NAsignatura - 1][NPrueba - 1] = Calificacion;
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Quiere ingresar otra calificación a este estudiante? \n"
                                                                    + "1. Si \n"
                                                                    + "2. No"));
        } while (opcion == 1);
        JOptionPane.showMessageDialog(null, "Las notas de Física son: " + Asignatura[0][0] +" | " + Asignatura[0][1] +" | " + Asignatura[0][2] +" | " + Asignatura[0][3]);
        JOptionPane.showMessageDialog(null, "Las notas de Matemáticas son: " + Asignatura[1][0] +" | "+ Asignatura[1][1] +" | " + Asignatura[1][2] +" | " + Asignatura[1][3]);
        JOptionPane.showMessageDialog(null, "Las notas de Filosofia son: " + Asignatura[2][0] +" | " + Asignatura[2][1] +" | " + Asignatura[2][2] +" | " + Asignatura[2][3]);
    }
    public void verificarAprobacionDeAsignatura(Estudiante estudiante){

        double porcentajeFisica = (Asignatura[0][0] * 0.25 + Asignatura[0][1] * 0.25 + Asignatura[0][2] * 0.25 + Asignatura[0][3] * 0.25) * 100 / 7.0;
        double porcentajeMatematica = (Asignatura[1][0] * 0.25 + Asignatura[1][1] * 0.25 + Asignatura[1][2] * 0.25 + Asignatura[1][3] * 0.25) * 100 / 7.0;
        double porcentajeFilosofia = (Asignatura[2][0] * 0.25 + Asignatura[2][1] * 0.25 + Asignatura[2][2] * 0.25 + Asignatura[2][3] * 0.25) * 100 / 7.0;
        JOptionPane.showMessageDialog(null, "El porcentaje mínimo de aprobación es de 65%");
        JOptionPane.showMessageDialog(null, "El porcentaje de aprobación de Física es " + porcentajeFisica);
        JOptionPane.showMessageDialog(null, "El porcentaje de aprobación de Filospfía es " + porcentajeFilosofia);
        JOptionPane.showMessageDialog(null, "El porcentaje de aprobación de Matemática es " + porcentajeMatematica);
    }
    public void mostrarDatosEstudiante(){
        JOptionPane.showMessageDialog(null,"El nombre del estudiante es: " + this.getName() +", " +
        "La edad del estudiante es: " + this.getAge() + ", " + "El género del estudiante es: " + this.getGender());
        JOptionPane.showMessageDialog(null, "El procentaje de aprobación de la asignatura de Fisica del estudiante es: " + (Asignatura[0][0] * 0.25 + Asignatura[0][1] * 0.25 + Asignatura[0][2] * 0.25 + Asignatura[0][3] * 0.25) * 100 / 7.0);
        JOptionPane.showMessageDialog(null, "El porcentaje de aprobación de la asignatura de Matemática del estudiante es: " + (Asignatura[1][0] * 0.25 + Asignatura[1][1] * 0.25 + Asignatura[1][2] * 0.25 + Asignatura[1][3] * 0.25) * 100 / 7.0);
        JOptionPane.showMessageDialog(null, "El porcentaje de aprobación de la asginatura de Filosofía del estudiante es: " + (Asignatura[2][0] * 0.25 + Asignatura[2][1] * 0.25 + Asignatura[2][2] * 0.25 + Asignatura[2][3] * 0.25) * 100 / 7.0);
    }
}

