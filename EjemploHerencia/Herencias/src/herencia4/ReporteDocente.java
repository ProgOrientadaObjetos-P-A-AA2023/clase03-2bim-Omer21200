/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String codi, ArrayList<Docente> lis) {
        super(codi);
        lista = lis;
    }

    public void establecerPromedioSueldos() {
        double aux = 0;
        for (int i = 0; i < obtenerLista().size(); i++) {
            aux = aux + obtenerLista().get(i).getSueldo();
        }
        promedioSueldos = aux / obtenerLista().size();
    }

    public void establecerLista(ArrayList<Docente> lista) {
        this.lista = lista;
    }

    public double obtenerPromedioSueldos() {
        return promedioSueldos;
    }

    public ArrayList<Docente> obtenerLista() {
        return lista;
    }

    @Override
    public String toString() {
        String cadena = "Reporte de Docentes\n";
        cadena = String.format("%sCodigo: %s\nLista de docentes: \n", cadena, codigo);
        for (int i = 0; i < obtenerLista().size(); i++) {
            Docente doc = obtenerLista().get(i);
            cadena = String.format("%sNombre: %s %s - Sueldo: %.2f\n",
                    cadena, doc.getNombre(), doc.getApellido(), doc.getSueldo());
        }
        cadena = String.format("%sEl promedio de sueldos es: %.3f \n", cadena, obtenerPromedioSueldos());

        return cadena;
    }
}
