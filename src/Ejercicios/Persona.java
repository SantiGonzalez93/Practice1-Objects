package Ejercicios;
import java.util.Random;


public class Persona {
    private String nombre;
    private int edad;
    private int DNI;
    private double peso;
    private double altura;

    public Persona() {
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
    }

    public Persona(String nombre, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getDNI() {
        return DNI;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(double peso, double altura){
        // si la persona esta en su peso ideal
        double valor = peso/((altura)*(altura));
        int comparador = 0;
        if (valor < 20) {
            comparador = -1;
        } else if (valor >= 20  && 25 >= valor) {
            comparador = 0;
        } else if ( 25 > valor) {
            comparador = 1;
        }
        return comparador;
    }

    public boolean esMayorDeEdad (int edad) {
        return edad >= 18;
    }

    private int generaDNI(){

        Random nroAleatorio = new Random();
        return nroAleatorio.nextInt(100000000);
        
    }

}
