/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.iva;

import Implementacion.ivaImpl;
import Interfaz.ivaInterfaz;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author miguel
 */
@WebService(serviceName = "iva")
public class iva {

    private ivaInterfaz iva;
    
    @WebMethod(operationName = "consumir")
    public double consumirServicio(@WebParam(name ="iva")double num){
        iva = new ivaImpl();
        iva.calcularIva(num);
        return iva.calcularIva(num);
    }
}
