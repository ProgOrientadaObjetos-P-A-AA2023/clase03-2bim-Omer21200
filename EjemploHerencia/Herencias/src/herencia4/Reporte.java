/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

/**
 *
 * @author reroes
 */
public class Reporte {

    protected String codigo;

    public Reporte(String codi) {
        codigo = codi;
    }
    
    public void establecerCodigo(String codi) {
        codigo = codi;
    }

    public String obtenerCodigo() {
        return codigo;
    }

}
