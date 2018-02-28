/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.faces.bean.ManagedBean;


/**
 *
 * @author miguel
 */
@ManagedBean(name="iva")

public class ivaBean {

    private int num1=0;
    private int num2=0;
    private String respuesta="";
    private String sumatoria="";
    
    public void calculo(){
        Sumaproductos();
        respuesta=String.valueOf(consumir(num1+num2));
    }
    
    public void Sumaproductos(){
        sumatoria=String.valueOf(num1+num2);
    }
    
    private static double consumir(double iva) {
        service.iva.Iva_Service service = new service.iva.Iva_Service();
        service.iva.Iva port = service.getIvaPort();
        return port.consumir(iva);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(String sumatoria) {
        this.sumatoria = sumatoria;
    }
    
    
}
