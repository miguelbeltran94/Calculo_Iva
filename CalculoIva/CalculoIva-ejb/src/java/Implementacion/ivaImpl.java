/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Implementacion;

import Interfaz.ivaInterfaz;
import javax.ejb.Stateless;

/**
 *
 * @author miguel
 */
@Stateless
public class ivaImpl implements ivaInterfaz{

    @Override
    public double calcularIva(double iva) {
        return iva*0.19;
    }
    
}
