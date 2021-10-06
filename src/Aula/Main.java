package Aula;

import javax.swing.*;
import java.util.Scanner;
import java.util.*;

public class Main {

    public static int cantAsignaturas = 3;
    public static int cantNotas = 4;
    public static int NDias = 5;
    public static int NSemana = 2;
    public static int eventos = 3;

    public static void main(String[] args) {
        int opción;
        int IDEstudiante;
        int IDProfesor;
        ListaEstudiante lista = new ListaEstudiante();
        ListaProfesor listaP = new ListaProfesor();
        Scanner reader = new Scanner(System.in);
        do{
            opción = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al menú principal, por favor seleccione una opción: \n"
                                                                +"1. Ingresar estudiantes \n"
                                                                +"2. Ver el estado de aprobado/reprobado de un estudiante \n"
                                                                +"3. Modificar notas de un estudiante \n"
                                                                +"4. Mostrar datos del estudiante \n"
                                                                +"5. Se añade Docente \n"
                                                                +"6. Modificar el horario de un docente \n"
                                                                +"7. Mostrar el horario de un docente \n"
                                                                +"8. Se muestra el porcentaje de asistencia del docente \n"
                                                                +"9. Se muestran los datos del docente \n"
                                                                +"0. Salir"));
            switch (opción){
                case 1:
                    //Se ingresa a lxs estudiantes a la lista
                        lista.addEstudiante();
                    break;
                case 2:
                    //Se ve si el estudiante reprobó o aprobó
                        IDEstudiante = Integer.parseInt(JOptionPane.showInputDialog("¿De cúal estudiante quiere saber el estado?"));
                        Estudiante estudianteVerificar = lista.getEstudiante(IDEstudiante);
                        estudianteVerificar.verificarAprobacionDeAsignatura(estudianteVerificar);
                    break;
                case 3:
                    //Se modifica las calificaciones de un estudiante
                    IDEstudiante = Integer.parseInt(JOptionPane.showInputDialog("¿A cúal estudiante desea modoficar sus calificaciones?"));
                    Estudiante estudiante = lista.getEstudiante(IDEstudiante);
                    estudiante.setAsignatura();
                    lista.setEstudiante(IDEstudiante, estudiante);
                    System.out.println(lista.getEstudiante(IDEstudiante));
                    break;
                case 4:
                    //Se muestran los datos de un estudiante
                    IDEstudiante = Integer.parseInt(JOptionPane.showInputDialog("¿De que estudiante desea saber los datos?"));
                    Estudiante estudianteMostrar = lista.getEstudiante(IDEstudiante);
                    estudianteMostrar.mostrarDatosEstudiante();
                    break;
                case 5:
                    //Se añade profesor
                    listaP.addProfesor();
                    break;
                case 6:
                    //Se consulta por el horario de un docente
                    IDProfesor = Integer.parseInt(JOptionPane.showInputDialog("¿De qué docente desea modifica el horario"));
                    Profesor profesor = listaP.getProfesor(IDProfesor);
                    profesor.setImparteAsignatura();
                    break;
                case 7:
                    //Se muestra el horario de un docente
                    IDProfesor = Integer.parseInt(JOptionPane.showInputDialog("¿De qué docente desea saber el horario?"));
                    Profesor profesorHorario = listaP.getProfesor(IDProfesor);
                    profesorHorario.mostrarHorario();
                    break;
                case 8:
                    //Se muestra el porcentaje de asistencia del docente
                    IDProfesor = Integer.parseInt(JOptionPane.showInputDialog("¿De qué docente desea saber el porcentaje de asistencia?"));
                    Profesor profesorAsistencia = listaP.getProfesor(IDProfesor);
                    profesorAsistencia.calcularPorcentajeDeAsistencia();
                    break;
                case 9:
                    //Se muestra los datos del docente
                    IDProfesor = Integer.parseInt((JOptionPane.showInputDialog("¿De cúal docente desea conocer los datos?")));
                    Profesor profesorDatos = listaP.getProfesor(IDProfesor);
                    profesorDatos.MostrarDatosDocente();
                    break;
            }
        }while (opción!=0);
    }
}
