package lecturaEscritura;

import java.util.Scanner;

public class MenuSesion {

    public int acceso(Scanner sc) {
        while(true) {
            System.out.println("\n======================================================\n");
            System.out.println("1.- Área de conductores.");
            System.out.println("2.- Área de gestores.");
            System.out.println("3.- Área de jefatura.");
            System.out.println("4.- Salir");
            System.out.print("\nIntroduce una opción: ");
            try {
                int opcion = Integer.parseInt(sc.next());
                sc.nextLine();
                if(opcion > 0 && opcion <5) {
                    return opcion;
                } else System.err.println("Error: introduce un número dentro del rango. ");
            } catch(NumberFormatException e) {
                System.err.println("Error: introduce un valor numérico. ");
            }
        }
    }

    public int sesionConductor(Scanner sc) {
        while(true) {
            System.out.println("\n========================  ÁREA CONDUCTOR  ========================\n");
            System.out.println("1.- Iniciar sesión.");
            System.out.println("2.- Cerrar sesión.");
            System.out.println("3.- Atrás.");
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
    


}
