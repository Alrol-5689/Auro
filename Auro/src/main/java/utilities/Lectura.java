package utilities;

import java.time.LocalDate;
import java.util.Scanner;

public class Lectura {

    public int menuSesion(Scanner sc) {
        while(true) {
            System.out.println("\n===========================================================================================================================================\n");
            System.out.println("1.- Iniciar sesión.");
            System.out.println("2.- Cerrar sesión.");
            System.out.println("3.- Salir.");
            System.out.print("Introduce una opción: ");
            try {
                int opcion = Integer.parseInt(sc.next());
                sc.nextLine();
                if(opcion > 0 && opcion <4) {
                    return opcion;
                } else System.err.println("Error: introduce un número dentro del rango. ");
            } catch(NumberFormatException e) {
                System.err.println("Error: introduce un valor numérico. ");
            }
        }
    }
    
    public int pedirOpcion(Scanner sc, int nOpciones, String mensaje) {
        System.out.print(mensaje);
        while (true) {
            try {
                int out = Integer.parseInt(sc.nextLine());
                if(out >= 1 && out <= nOpciones) {
                    return out;
                }
                System.err.println("Por favor, introduce un número entre 1 y " + nOpciones + ":");
            } catch (NumberFormatException e) {
                System.err.println("Error. Introduce solo números. ");
            }
            System.out.print(mensaje);
        }
    }

    public boolean confirmacionSiNo(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String entrada = sc.nextLine();
            if (entrada.equalsIgnoreCase("s")) {
                return true;
            }
            if (entrada.equalsIgnoreCase("n")) {
                return false;
            }
            System.err.println("\nError: Introduce 'S' o 'N'. ");
        }
    }

    public LocalDate pedirFecha(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        while (true) {
            try {
                int anio = pedirInt(sc, "Año: ");
                int mes = pedirInt(sc, "Mes: ");
                int dia = pedirInt(sc, "Día: ");
                return LocalDate.of(anio, mes, dia);
            } catch (java.time.DateTimeException e) {
                System.err.println("Fecha no válida: " + e.getMessage());
                System.out.println("Por favor, introdúcela de nuevo.\n");
            }
        }
    }

    public int pedirInt(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        while (true) {
            try {
                int out = Integer.parseInt(sc.nextLine());
                return out;
            } catch (NumberFormatException e) {
                System.err.println("Error. Introduce solo números. ");
                System.out.print(mensaje);
            }
        }
    }

}
