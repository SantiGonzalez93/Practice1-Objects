import Ejercicios.Cuenta;

public class Main {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Santiago", 155493.4 );

        cuenta1.ingresar(7, cuenta1.getCantidad());

        System.out.println("la cantidad actual en la cuenta es: "+ cuenta1.getCantidad());

        cuenta1.retirar(5000, cuenta1.getCantidad());
        System.out.println("la nueva cantidad actual es " + cuenta1.getCantidad());
    }

}