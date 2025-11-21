package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Juego> lista = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n=== MENÚ DE JUEGOS ===");
            System.out.println("1. Registrar juego Mario Bros");
            System.out.println("2. Registrar juego de Carreras");
            System.out.println("3. Mostrar todos los juegos");
            System.out.println("4. Buscar juego por nombre");
            System.out.println("5. Filtrar por tipo de juego");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            try {

                switch (opcion) {

                    case 1:
                        System.out.print("Nombre: ");
                        String nombreM = sc.nextLine();

                        System.out.print("Plataforma: ");
                        String plataformaM = sc.nextLine();

                        System.out.print("Precio: ");
                        double precioM = sc.nextDouble();

                        System.out.print("Nivel máximo: ");
                        int nivel = sc.nextInt();
                        sc.nextLine();

                        lista.add(new MarioBros(nombreM, plataformaM, precioM, nivel));
                        System.out.println("Juego Mario registrado.");
                        break;

                    case 2:
                        System.out.print("Nombre: ");
                        String nombreC = sc.nextLine();

                        System.out.print("Plataforma: ");
                        String plataformaC = sc.nextLine();

                        System.out.print("Precio: ");
                        double precioC = sc.nextDouble();

                        System.out.print("Cantidad de vehículos: ");
                        int cantV = sc.nextInt();
                        sc.nextLine();

                        lista.add(new CarreraVehiculos(nombreC, plataformaC, precioC, cantV));
                        System.out.println("Juego de carreras registrado.");
                        break;

                    case 3:
                        System.out.println("\n=== LISTA DE JUEGOS ===");
                        for (Juego j : lista) {
                            System.out.println(j.mostrarDetalles());
                        }
                        break;

                    case 4:
                        System.out.print("Ingrese nombre a buscar: ");
                        String buscar = sc.nextLine();
                        boolean encontrado = false;

                        for (Juego j : lista) {
                            if (j.getNombre().equalsIgnoreCase(buscar)) {
                                System.out.println(j.mostrarDetalles());
                                encontrado = true;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("Juego no encontrado.");
                        }
                        break;

                    case 5:
                        System.out.println("Filtrar por:");
                        System.out.println("1. Mario Bros");
                        System.out.println("2. Carrera de Vehículos");
                        int tipo = sc.nextInt();
                        sc.nextLine();

                        for (Juego j : lista) {
                            if ((tipo == 1 && j instanceof MarioBros) ||
                                    (tipo == 2 && j instanceof CarreraVehiculos)) {
                                System.out.println(j.mostrarDetalles());
                            }
                        }
                        break;

                    case 6:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción inválida");
                }

            } catch (DatoInvalidoException e) {
                System.out.println("ERROR: " + e.getMessage());
            }

        } while (opcion != 6);

        sc.close();
    }
}

