/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;

    public ReportePolicia(String codi,ArrayList<Policia> lis) {
        super(codi);
        lista = lis;
    }
    public void establecerPromedioEdades() {
        double aux=0;
        for (int i = 0; i < obtenerLista().size(); i++) {
            aux=aux+obtenerLista().get(i).getEdad();
        }
        promedioEdades=aux/obtenerLista().size();
    }

    public void establecerLista(ArrayList<Policia> lis) {
        lista = lis;
    }

    public double obtenerPromedioEdades() {
        return promedioEdades;
    }

    public ArrayList<Policia> obtenerLista() {
        return lista;
    }
     @Override
    public String toString() {
        String cadena = "Reporte de Policias\n";
        cadena = String.format("%sCodigo: %s\nLista de Policias: \n", cadena, codigo);
        for (int i = 0; i < obtenerLista().size(); i++) {
            Policia doc = obtenerLista().get(i);
            cadena = String.format("%sNombre: %s %s - Edad: %d\n",
                    cadena, doc.getNombre(), doc.getApellido(), doc.getEdad());
        }
        cadena = String.format("%sEl promedio de Edades es: %.3f \n", cadena, obtenerPromedioEdades());

        return cadena;
    }
    
}
