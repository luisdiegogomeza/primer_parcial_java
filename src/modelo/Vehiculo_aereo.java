/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LUIS
 */
public class Vehiculo_aereo extends Vehiculo{
 private String queroseno, capasidad, pilotos, permisos;

    public Vehiculo_aereo(){}
    public Vehiculo_aereo(String queroseno, String capasidad, String pilotos, String permisos, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea) {
        super(placa, chasis, serie, motor, cilindros, marca, modelo, linea);
        this.queroseno = queroseno;
        this.capasidad = capasidad;
        this.pilotos = pilotos;
        this.permisos = permisos;
    }

    public Vehiculo_aereo(String text, String text0, String text1, String text2, String text3, String text4, String text5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Vehiculo_aereo(String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6, String text7, String text8) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getQueroseno() {
        return queroseno;
    }

    public void setQueroseno(String queroseno) {
        this.queroseno = queroseno;
    }

    public String getCapasidad() {
        return capasidad;
    }

    public void setCapasidad(String capasidad) {
        this.capasidad = capasidad;
    }

    public String getPilotos() {
        return pilotos;
    }

    public void setPilotos(String pilotos) {
        this.pilotos = pilotos;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }
 public void agregar(){
    System.out.println("Queroseno" +getQueroseno());
    System.out.println("Capasidad" +getCapasidad());
    System.out.println("Pilotos" +getPilotos());
    System.out.println("Placa" +getPlaca());
    System.out.println("Chasis" +getChasis());
    System.out.println("Serie" +getSerie());
    System.out.println("Motor" +getMotor());
    System.out.println("Cilindros" +getCilindros());
    System.out.println("Marca" +getMarca());
    System.out.println("Modelo" +getModelo());
    System.out.println("Linea" +getLinea());
    System.out.println("____________________________________________________" );
 }
 
    
}
