/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mavenproject1.automovil3;

/**
 *
 * @author Marjorie
 */
public class Automovil3 {
    //ATRIBUTOS
    private String marca;
    private int modelo;
    private double motor;
    private String tipoCombustible;
    private String tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private double velocidadMaxima;
    private String color;
    private double velocidadActual;

    // CONSTRUCTOR
    public Automovil3(String marca, int modelo, double motor, String tipoCombustible,
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
        this.velocidadActual = 0; 
    }

    //GETTER Y SETTER
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public int getModelo() { return modelo; }
    public void setModelo(int modelo) { this.modelo = modelo; }

    public double getMotor() { return motor; }
    public void setMotor(double motor) { this.motor = motor; }

    public String getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(String tipoCombustible) { this.tipoCombustible = tipoCombustible; }

    public String getTipoAutomovil() { return tipoAutomovil; }
    public void setTipoAutomovil(String tipoAutomovil) { this.tipoAutomovil = tipoAutomovil; }

    public int getNumeroPuertas() { return numeroPuertas; }
    public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas; }

    public int getCantidadAsientos() { return cantidadAsientos; }
    public void setCantidadAsientos(int cantidadAsientos) { this.cantidadAsientos = cantidadAsientos; }

    public double getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(double velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double getVelocidadActual() { return velocidadActual; }
    public void setVelocidadActual(double velocidadActual) { this.velocidadActual = velocidadActual; }

    // Métodos funcionales
    public void acelerar(double incremento) {
        if (velocidadActual + incremento <= velocidadMaxima) {
            velocidadActual += incremento;
            System.out.println("El automóvil ha acelerado. Velocidad actual: " + velocidadActual + " km/h");
        } else {
            System.out.println("No se puede acelerar más allá de la velocidad máxima de " + velocidadMaxima + " km/h.");
        }
    }

    public void desacelerar(double decremento) {
        if (velocidadActual - decremento >= 0) {
            velocidadActual -= decremento;
            System.out.println("El automóvil ha desacelerado. Velocidad actual: " + velocidadActual + " km/h");
        } else {
            System.out.println("No se puede desacelerar más allá de 0 km/h.");
        }
    }

    public void frenar() {
        velocidadActual = 0;
        System.out.println("El automóvil se ha detenido. Velocidad actual: " + velocidadActual + " km/h");
    }

    public double calcularTiempoEstimado(double distancia) {
        if (velocidadActual > 0) {
            double tiempo = distancia / velocidadActual;
            System.out.println("El tiempo estimado de llegada es: " + tiempo + " horas.");
            return tiempo;
        } else {
            System.out.println("El automóvil está detenido. No se puede calcular el tiempo estimado.");
            return -1;
        }
    }

    public void mostrarAtributos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " litros");
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Tipo de automóvil: " + tipoAutomovil);
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Cantidad de asientos: " + cantidadAsientos);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
    }

  
    public static void main(String[] args) {
        
        Automovil3 auto = new Automovil3("Toyota", 2022, 1.8, "Gasolina", "Compacto", 4, 5, 180, "Rojo");

        //ATRIBUTO
        auto.mostrarAtributos();

        // FUNCIONALIDADES
        auto.acelerar(100);
        auto.acelerar(50);
        auto.desacelerar(30);
        auto.frenar();

        //CALCULAR TIEMPO
        auto.setVelocidadActual(80); 
        auto.calcularTiempoEstimado(200);
    }
}
