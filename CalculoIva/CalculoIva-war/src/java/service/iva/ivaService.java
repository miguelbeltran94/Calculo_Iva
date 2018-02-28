/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.iva;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Implementacion.ivaImpl;
import Interfaz.ivaInterfaz;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author miguel
 */
@WebService(serviceName = "service")
public class ivaService {
    
    @EJB
    private ivaInterfaz iva;
    
    @WebMethod(action = "iva")
    public double consumirServicio(@WebParam(name ="iva")double num){
        iva = new ivaImpl();
        iva.calcularIva(num);
        return iva.calcularIva(num);
    }
    
}

