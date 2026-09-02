package Parcial1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("¿Cuántos repuestos desea registrar?");
    int cantidad = sc.nextInt();
    sc.nextLine();


    Repuesto[] repuestos = new Repuesto[cantidad];


    for (int i = 0; i < repuestos.length; i++) {

        System.out.println("\n===== REPUESTO " + (i + 1) + " =====");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Descripción: ");
        String descripcion = sc.nextLine();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        System.out.print("Estado (1 = Disponible / 0 = No disponible): ");
        int estado = sc.nextInt();

        sc.nextLine();


    repuestos[i] = new Repuesto(nombre, descripcion, precio, estado);
}

        System.out.println("\n=================================");
        System.out.println(" REPUESTOS DISPONIBLES");
        System.out.println("=================================");


        for (int i = 0; i < repuestos.length; i++) {

        if (repuestos[i].getEstado() == 1) {

        System.out.println("\nRepuesto " + (i + 1));
        System.out.println("Nombre: " + repuestos[i].getNombre());

        System.out.println("Descripción: " + repuestos[i].getDescripcion());

        System.out.println("Precio: $" + repuestos[i].getPrecio());

        System.out.println("Estado: Disponible");
    
        } else {
            System.out.println("\nRepuesto " + (i + 1));
            System.out.println("Nombre: " + repuestos[i].getNombre());
            System.out.println("Descripción: " + repuestos[i].getDescripcion());
            System.out.println("Precio: $" + repuestos[i].getPrecio());
            System.out.println("Estado: No disponible");
        }
    }

    sc.close();
}
}
      
        

        
    
