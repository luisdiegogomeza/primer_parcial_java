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
public class Vehiculo_terrestre extends Vehiculo {
    private String peso, tipo_de_gasolina,tarjeta_de_circulacion;
    
    public Vehiculo_terrestre(){}
    public Vehiculo_terrestre(String peso, String tipo_de_gasolina, String tarjeta_de_circulacion, String placa, String chasis, String serie, String motor, String cilindros, String marca, String modelo, String linea) {
        super(placa, chasis, serie, motor, cilindros, marca, modelo, linea);
        this.peso = peso;
        this.tipo_de_gasolina = tipo_de_gasolina;
        this.tarjeta_de_circulacion = tarjeta_de_circulacion;
    }

    public Vehiculo_terrestre(String text, String text0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Vehiculo_terrestre(String text, String text0, String text1, String text2, String text3, String text4, String text5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Vehiculo_terrestre(String text, String text0, String text1, String text2, String text3, String text4, String text5, String text6, String text7, String text8) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipo_de_gasolina() {
        return tipo_de_gasolina;
    }

    public void setTipo_de_gasolina(String tipo_de_gasolina) {
        this.tipo_de_gasolina = tipo_de_gasolina;
    }

    public String getTarjeta_de_circulacion() {
        return tarjeta_de_circulacion;
    }

    public void setTarjeta_de_circulacion(String tarjeta_de_circulacion) {
        this.tarjeta_de_circulacion = tarjeta_de_circulacion;
    }
    
    public void agregar(){
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
