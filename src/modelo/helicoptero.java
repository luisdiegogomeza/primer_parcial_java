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
public class helicoptero  extends Vehiculo_aereo{
    private String tipo_de_helicoptero, tipo_de_helices,capasidad_trasporte;

    public helicoptero(){}
    public helicoptero(String tipo_de_helicoptero, String tipo_de_helices, String capasidad_trasporte, String queroseno, String capasidad, String pilotos, String permisos, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea) {
        super(queroseno, capasidad, pilotos, permisos, placa, chasis, serie, motor, cilindros, marca, modelo, linea);
        this.tipo_de_helicoptero = tipo_de_helicoptero;
        this.tipo_de_helices = tipo_de_helices;
        this.capasidad_trasporte = capasidad_trasporte;
    }

    public String getTipo_de_helicoptero() {
        return tipo_de_helicoptero;
    }

    public void setTipo_de_helicoptero(String tipo_de_helicoptero) {
        this.tipo_de_helicoptero = tipo_de_helicoptero;
    }

    public String getTipo_de_helices() {
        return tipo_de_helices;
    }

    public void setTipo_de_helices(String tipo_de_helices) {
        this.tipo_de_helices = tipo_de_helices;
    }

    public String getCapasidad_trasporte() {
        return capasidad_trasporte;
    }

    public void setCapasidad_trasporte(String capasidad_trasporte) {
        this.capasidad_trasporte = capasidad_trasporte;
    }
    
    @Override
    public void agregar(){
    System.out.println("Tipo_de_helicoptero" +getTipo_de_helicoptero());
    System.out.println("Tipo_de_helices" +getTipo_de_helices());
    System.out.println(getCapasidad_trasporte() +"Capasidad_trasporte");
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
