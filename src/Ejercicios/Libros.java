package Ejercicios;

public class Libros {
    private String nombre;
    private String autor;
    private int cantidad;
    private int cantparaPrestamos;
    private int cantPrestados = 0;

    public Libros() {
    }

    public Libros(String nombre, String autor, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantidad = cantidad;
        this.cantparaPrestamos = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantparaPrestamos() {
        return cantparaPrestamos;
    }

    public void setCantparaPrestamos(int cantparaPrestamos) {
        this.cantparaPrestamos = cantparaPrestamos;
    }

    public int getCantPrestados() {
        return cantPrestados;
    }

    public void setCantPrestados(int cantPrestados) {
        this.cantPrestados = cantPrestados;
    }
    // los metodos son prestamo y devolucion

    public boolean prestamo(){
        if (this.cantparaPrestamos > 0){
            this.cantparaPrestamos = cantparaPrestamos -1;
            this.cantPrestados = cantPrestados +1;
            return true;
        } else {
            return false;
        }
    }
    public boolean devolucion(){
        if(this.cantPrestados > 0){
            this.cantPrestados = cantPrestados -1;
            this.cantparaPrestamos = cantparaPrestamos +1;
            return true;
        } else {
            return false;
        }
    }
}
