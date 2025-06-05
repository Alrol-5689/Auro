package lecturaEscritura;

import java.util.Scanner;

public class Menus {

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
    


}
