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
public class Automovil extends Vehiculo_terrestre{
    private String capasidad,tipo_automovil,tipo_de_licencia;

    public Automovil(){}
    public Automovil(String capasidad, String tipo_automovil, String tipo_de_licencia, String peso, String tipo_de_gasolina, String tarjeta_de_circulacion, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea) {
        super(peso, tipo_de_gasolina, tarjeta_de_circulacion, placa, chasis, serie, motor, cilindros, marca, modelo, linea);
        this.capasidad = capasidad;
        this.tipo_automovil = tipo_automovil;
        this.tipo_de_licencia = tipo_de_licencia;
    }

    public String getCapasidad() {
        return capasidad;
    }

    public void setCapasidad(String capasidad) {
        this.capasidad = capasidad;
    }

    public String getTipo_automovil() {
        return tipo_automovil;
    }

    public void setTipo_automovil(String tipo_automovil) {
        this.tipo_automovil = tipo_automovil;
    }

    public String getTipo_de_licencia() {
        return tipo_de_licencia;
    }

    public void setTipo_de_licencia(String tipo_de_licencia) {
        this.tipo_de_licencia = tipo_de_licencia;
    }
    
    @Override
    public void agregar(){
    System.out.println("Capasidad" +getCapasidad());
    System.out.println("Tipo_automovil" +getTipo_automovil());
    System.out.println("Tipo_de_licencia" +getTipo_de_licencia());
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
