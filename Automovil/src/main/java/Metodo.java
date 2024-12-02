/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MARJORIE
 */
public class Metodo {
        //Metodos para Acelerar, desacelerar y frenar
    public void acelerar(double incremento) {
        double velocidadActual = 0;
        double velocidadMaxima = 200;

        if (velocidadActual + incremento > velocidadMaxima) {
            System.out.println("No se puede superar la velocidad máxima de " + velocidadMaxima + " km/h.");
        } else {
            velocidadActual += incremento;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h.");
        }
    }

    public void desacelerar(double decremento) {
        double velocidadActual= 200;
        if (velocidadActual - decremento < 0) {
            System.out.println("No se puede tener una velocidad negativa.");
        } else {
            velocidadActual -= decremento;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h.");
        }
    }

    public void frenar() {
        double velocidadActual = 0;
        System.out.println("El vehículo se ha detenido. Velocidad actual: " + velocidadActual + " km/h.");

    }   
}
