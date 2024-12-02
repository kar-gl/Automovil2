/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mavenproject1.automovil;

/**
 *
 * @author MARJORIE
 */
public class Automovil {
    public String marca;
    public int modelo;
    public double motor;
    public String tipoCombustible;
    public String tipoAutomovil;
    public int numeroPuertas;
    public int cantidadAsientos;
    public double velocidadMaxima;
    public String color;
    public double VelocidadActual;
   
   
    //Constructor
    
    public Automovil(String marca, int modelo, double motor, String tipoCombustible,
            String tipoAutomovil, int numeroPuertas, int cantidadAsientos, 
            double velocidadMaxima, String color) {
        
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.VelocidadActual = 0; //Iniciamos la velocidad en o
    }
    
    //GET Y SET

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidadActual() {
        return VelocidadActual;
    }

    public void setVelocidadActual(double VelocidadActual) {
        this.VelocidadActual = VelocidadActual;


    }
}
