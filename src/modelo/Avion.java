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
public class Avion extends Vehiculo_aereo {
    private String tipo_de_avion, tipo_de_clase,numero_de_tripulantes;

    public Avion(){}
    public Avion(String tipo_de_avion, String tipo_de_clase, String numero_de_tripulantes, String queroseno, String capasidad, String pilotos, String permisos, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea) {
        super(queroseno, capasidad, pilotos, permisos, placa, chasis, serie, motor, cilindros, marca, modelo, linea);
        this.tipo_de_avion = tipo_de_avion;
        this.tipo_de_clase = tipo_de_clase;
        this.numero_de_tripulantes = numero_de_tripulantes;
    }

    public String getTipo_de_avion() {
        return tipo_de_avion;
    }

    public void setTipo_de_avion(String tipo_de_avion) {
        this.tipo_de_avion = tipo_de_avion;
    }

    public String getTipo_de_clase() {
        return tipo_de_clase;
    }

    public void setTipo_de_clase(String tipo_de_clase) {
        this.tipo_de_clase = tipo_de_clase;
    }

    public String getNumero_de_tripulantes() {
        return numero_de_tripulantes;
    }

    public void setNumero_de_tripulantes(String numero_de_tripulantes) {
        this.numero_de_tripulantes = numero_de_tripulantes;
    }
   

  
    @Override
    public void agregar(){
    System.out.println("Tipo_de_avion" +getTipo_de_avion());
    System.out.println("Tipo_de_clase" +getTipo_de_clase());
    System.out.println("Numero_de_tripulantes" +getNumero_de_tripulantes());
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
