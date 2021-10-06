package Aula;

import javax.swing.*;

public class Profesor extends Humano {

    private String [][][] imparteAsignatura;
    private String ramo;

    public Profesor(String name, String age, String gender, String[][][] imparteAsignatura,  String ramo) {
        super(name, age, gender);
        this.imparteAsignatura = imparteAsignatura;
    }

    public String getRamo() {
        return ramo;
    }

    public String setRamo(String ramo) {
         return this.ramo = ramo;
    }

    public String[][][] getImparteAsignatura() {
        return imparteAsignatura;
    }
    public void setImparteAsignatura(){
        int opcion, NSemana, NDia, opcionDisponible;
        String nd = "No disponible";
        String sd = "Disponible";
        do {
            NSemana = Integer.parseInt(JOptionPane.showInputDialog("¿Que semana quiere modificar? \n" +
                                                                    "1. Semana 1 \n" +
                                                                    "2. Semana 2"));
            NDia = Integer.parseInt(JOptionPane.showInputDialog("¿Qué día de la semana quiere modificar? \n" +
                                                                    "1. Dia 1 \n" +
                                                                    "2. Día 2 \n" +
                                                                    "3. Día 3 \n" +
                                                                    "4. Día 4 \n" +
                                                                    "5. Día 5 \n"));
            String fecha = new String(JOptionPane.showInputDialog("Ingrese fecha"));
            imparteAsignatura[NSemana-1][NDia-1][1] = fecha;
            String titulo = new String(JOptionPane.showInputDialog("Ingrese titulo"));
            imparteAsignatura[NSemana-1][NDia-1][2] = titulo;
            opcionDisponible = Integer.parseInt(JOptionPane.showInputDialog("¿Esta disponible este día? \n" +
                                                                            "1. Si \n" +
                                                                            "2. No"));
            if (opcionDisponible == 1){
                imparteAsignatura[NSemana-1][NDia-1][0] = sd;
            }else{
                imparteAsignatura[NSemana-1][NDia-1][0] = nd;
            }
            JOptionPane.showMessageDialog(null,"La fecha asignada es: " + imparteAsignatura[NSemana-1][NDia-1][1]);
            JOptionPane.showMessageDialog(null,"El titulo asignado es " + imparteAsignatura[NSemana-1][NDia-1][2]);
            JOptionPane.showMessageDialog(null,"El estado asignado es " + imparteAsignatura[NSemana-1][NDia-1][0]);
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea seguir modificando días? \n" +
                                                                    "1. Si \n" +
                                                                    "2. No \n"));
        }while (opcion == 1);
    }
    public void mostrarHorario(){
        for (int i=0; i < 2;i++){
            for (int j=0; j < 5; j++){
                JOptionPane.showMessageDialog(null, "El calendario para el día " + imparteAsignatura[i][j][1] +", con asignatura "+ imparteAsignatura[i][j][2] +", presenta el estado "+ imparteAsignatura[i][j][0]);
            }
        }
    }
    public double calcularPorcentajeDeAsistencia(){
        int contador = 0;
        for (int i=0; i < 2;i++){
            for (int j=0; j < 5; j++){
                if (imparteAsignatura[i][j][0] == "Disponible"){
                    contador += 1;
                }
            }
        }
        double porcentajeDeAsistencia = contador * 100 / 10;
        JOptionPane.showMessageDialog(null, "El porcentaje del docente es: " + porcentajeDeAsistencia);
        return porcentajeDeAsistencia;
    }
    public void MostrarDatosDocente(){
        JOptionPane.showMessageDialog(null, "El nombre del docente es: " + getName());
        JOptionPane.showMessageDialog(null, "La edad del docente es: " + getAge());
        JOptionPane.showMessageDialog(null, "El género del docente es: " + getGender());
        JOptionPane.showMessageDialog(null, "La asignatura que el docente imparte es: " + getRamo());
        JOptionPane.showMessageDialog(null, "El porcentaje de asistencia del docente es: " + calcularPorcentajeDeAsistencia());
    }
}