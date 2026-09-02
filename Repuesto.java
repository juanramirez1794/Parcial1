package Parcial1;
import java.util.Scanner;

public class Repuesto {


private String nombre;
    private String descripcion;
    private double precio;
    private int estado;

    public Repuesto(String nombre, String descripcion, double precio, int estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getEstado() {
        return estado;
    }
}
