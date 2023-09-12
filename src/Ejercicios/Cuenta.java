package Ejercicios;

public class Cuenta {
    private String titular;
    private double cantidad;

    public Cuenta() {
    }
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double monto, double cantidad) {

        if (monto >= 0){

            this.cantidad = cantidad + monto;

        } else {
            System.out.printf("no estoy haciendo nada");
        }
    }

    public  void retirar(double retiro, double cantidad) {

        if (retiro <= cantidad){

            this.cantidad = cantidad - retiro;

        } else {
            this.cantidad = 0;
        }
    }
}
