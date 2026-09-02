package Parcial1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuántos repuestos desea registrar?");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Repuesto[] repuestos = new Repuesto[cantidad];

        int opcion;

        do {
            System.out.println("\n=================================");
            System.out.println(" REPUESTOS YAMAHA");
            System.out.println("=================================");
            System.out.println("1. Registrar repuestos");
            System.out.println("2. Mostrar repuestos disponibles");
            System.out.println("3. Buscar repuesto por nombre");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < repuestos.length; i++) {
                        System.out.println("\n===== REPUESTO " + (i + 1) + " =====");

                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Descripción: ");
                        String descripcion = sc.nextLine();

                        System.out.print("Precio: ");
                        double precio = sc.nextDouble();

                        System.out.print("State (1 = Disponible / 0 = No disponible): ");
                        int estado = sc.nextInt();
                        sc.nextLine();

                        repuestos[i] = new Repuesto(nombre, descripcion, precio, estado);
                    }

                    System.out.println("\n¡Repuestos registrados correctamente!");
                    break;

                case 2:
                    System.out.println("\n===== REPUESTOS DISPONIBLES =====");

                    boolean hayDisponibles = false;
                    for (int i = 0; i < repuestos.length; i++) {
                        if (repuestos[i] != null && repuestos[i].getEstado() == 1) {
                            hayDisponibles = true;
                            System.out.println("\nNombre: " + repuestos[i].getNombre());
                            System.out.println("Descripción: " + repuestos[i].getDescripcion());
                            System.out.println("Precio: $" + repuestos[i].getPrecio());
                            System.out.println("Estado: Disponible");
                        }
                    }

                    if (!hayDisponibles) {
                        System.out.println("No hay repuestos disponibles.");
                    }
                    break;

                case 3:
                    System.out.print("\nIngrese el nombre del repuesto: ");
                    String nombreBuscado = sc.nextLine();

                    boolean encontrado = false;
                    for (int i = 0; i < repuestos.length; i++) {
                        if (repuestos[i] != null && repuestos[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                            System.out.println("\n===== REPUESTO ENCONTRADO =====");
                            System.out.println("Nombre: " + repuestos[i].getNombre());
                            System.out.println("Descripción: " + repuestos[i].getDescripcion());
                            System.out.println("Precio: $" + repuestos[i].getPrecio());
                            System.out.println("Estado: " + repuestos[i].getEstado());
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontró el repuesto.");
                    }
                    break;

                case 4:
                    System.out.println("\nGracias por utilizar el sistema.");
                    break;

                default:
                    System.out.println("\nOpción inválida.");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}

