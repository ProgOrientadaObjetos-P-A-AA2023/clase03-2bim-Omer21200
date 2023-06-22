/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {

    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String codi, ArrayList<Estudiante> lis) {
        super(codi);
        lista = lis;
    }

    public void establecerPromedioMatriculas() {
        double aux = 0;
        for (int i = 0; i < obtenerLista().size(); i++) {
            aux = aux + obtenerLista().get(i).getMatricula();
        }
        promedioMatriculas = aux / obtenerLista().size();
    }

    public void setLista(ArrayList<Estudiante> lis) {
        lista = lis;
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = "Reporte de Estudiante\n";
        cadena = String.format("%sCodigo: %s\nLista de Estudiantes: \n", cadena, codigo);
        for (int i = 0; i < obtenerLista().size(); i++) {
            Estudiante doc = obtenerLista().get(i);
            cadena = String.format("%sNombre: %s %s - Matricula: %.2f\n",
                    cadena, doc.getNombre(), doc.getApellido(), doc.getMatricula());
        }
        cadena = String.format("%sEl promedio de matriculas es: %.3f \n", cadena, obtenerPromedioMatriculas());

        return cadena;
    }
}
