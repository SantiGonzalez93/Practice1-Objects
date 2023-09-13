import Ejercicios.*;

public class Main {
    public static void main(String[] args) {

        //Exercise number 1
        Cuenta cuenta1 = new Cuenta("Santiago", 155493.4 );

        cuenta1.ingresar(7, cuenta1.getCantidad());

        System.out.println("la cantidad actual en la cuenta es: "+ cuenta1.getCantidad());

        cuenta1.retirar(5000, cuenta1.getCantidad());
        System.out.println("la nueva cantidad actual es " + cuenta1.getCantidad());

        //Exercise number 2

        Persona santi = new Persona("Santiago", 30, 70.1, 1.73);

        int resuesta = santi.calcularIMC(santi.getPeso(), santi.getAltura());

        System.out.println("el indice de masa corporal es: "+resuesta);

        System.out.println("la persona es mayor de edad? "+santi.esMayorDeEdad(santi.getEdad()));

        System.out.println("el DNI es: " + santi.getDNI());

        //Exercise number 3

        Serie friends = new Serie("Friends", "Ni-idea");
        Serie juegoDeTronos = new Serie();
        Serie theWolkingDead = new Serie("The Wolking Dead", 10, "Fantasóa", "Ni-idea");


        // Exercise number 4
        Videojuego callofduty = new Videojuego();

        // Exercise number 5
        // String nombre, String autor, int cantidad
        Libros elNombreDelViento = new Libros("El nombre del viento", "Patrick Rotfus", 37 );

        elNombreDelViento.prestamo();
        System.out.println(elNombreDelViento.devolucion());

    }
}