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
public class Moto extends Vehiculo_terrestre {
     private String velocidades, tipo_de_cadena, tipo_de_llanta;

    public Moto(){}
    public Moto(String velocidades, String tipo_de_cadema, String tipo_de_llanta, String peso, String tipo_de_gasolina, String tarjeta_de_circulacion, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea) {
        super(peso, tipo_de_gasolina, tarjeta_de_circulacion, placa, chasis, serie, motor, cilindros, marca, modelo, linea);
        this.velocidades = velocidades;
        this.tipo_de_cadena = tipo_de_cadena;
        this.tipo_de_llanta = tipo_de_llanta;
    }

    public String getVelocidades() {
        return velocidades;
    }

    public void setVelocidades(String velocidades) {
        this.velocidades = velocidades;
    }

    public String getTipo_de_cadena() {
        return tipo_de_cadena;
    }

    public void setTipo_de_cadena(String tipo_de_cadema) {
        this.tipo_de_cadena = tipo_de_cadema;
    }

    public String getTipo_de_llanta() {
        return tipo_de_llanta;
    }

    public void setTipo_de_llanta(String tipo_de_llanta) {
        this.tipo_de_llanta = tipo_de_llanta;
    }
     
      @Override
    public void agregar(){
    System.out.println("Velocidades" +getVelocidades());
    System.out.println("Tipo_de_cadena" +getTipo_de_cadena());
    System.out.println("Tipo_de_llanta" +getTipo_de_llanta());
    System.out.println("Peso" +getPeso());
    System.out.println("Tipo_de_gasolina" +getTipo_de_gasolina());
    System.out.println("Tarjeta_de_circulacion" +getTarjeta_de_circulacion());
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
