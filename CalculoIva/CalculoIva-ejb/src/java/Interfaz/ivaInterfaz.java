/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.ejb.Local;

/**
 *
 * @author miguel
 */
@Local
public interface ivaInterfaz {
    public double calcularIva(double iva);
    
}
