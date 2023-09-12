import Ejercicios.Cuenta;
import Ejercicios.Persona;

public class Main {
    public static void main(String[] args) {

        // Ejercicio nro 1
        Cuenta cuenta1 = new Cuenta("Santiago", 155493.4 );

        cuenta1.ingresar(7, cuenta1.getCantidad());

        System.out.println("la cantidad actual en la cuenta es: "+ cuenta1.getCantidad());

        cuenta1.retirar(5000, cuenta1.getCantidad());
        System.out.println("la nueva cantidad actual es " + cuenta1.getCantidad());

        // Ejercicio nro 2

        Persona santi = new Persona("Santiago", 30, 70.1, 1.73);

        int resuesta = santi.calcularIMC(santi.getPeso(), santi.getAltura());

        System.out.println("el indice de masa corporal es: "+resuesta);

        System.out.println("la persona es mayor de edad? "+santi.esMayorDeEdad(santi.getEdad()));

        System.out.println("el DNI es: " + santi.getDNI());

        //Ejercicio nro 3



    }
}