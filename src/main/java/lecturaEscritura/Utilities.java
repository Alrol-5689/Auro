package lecturaEscritura;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class Utilities {

    public int pedirOpcion(Scanner sc, int nOpciones, String mensaje) {
        System.out.print(mensaje);
        while (true) {
            try {
                int out = Integer.parseInt(sc.nextLine());
                if (out >= 1 && out <= nOpciones) {
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
    
    public Duration pedirDuracion(Scanner sc, String mensaje) {
        System.out.println(mensaje);
        while (true) {
            try {
                int horas = pedirInt(sc, "Horas: ");
                int minutos = pedirInt(sc, "Minutos: ");
                if (horas < 0 || minutos < 0 || minutos >= 60) {
                    throw new IllegalArgumentException("Valores inválidos (minutos entre 0 y 59, horas >= 0)");
                }
                return Duration.ofHours(horas).plusMinutes(minutos);
            } catch (IllegalArgumentException e) {
                System.err.println("Duración no válida: " + e.getMessage());
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

    public double pedirDouble(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        while (true) {
            try {
                double out = Double.parseDouble(sc.nextLine().replace(",", "."));
                return out;
            } catch (NumberFormatException e) {
                System.err.println("Error. Introduce solo números. ");
                System.out.print(mensaje);
            }
        }
    }

    public String pedirString(Scanner sc, boolean permitirVacio, String mensaje) {
        System.out.print(mensaje);
        while (true) {
            String input = sc.nextLine();
            if(permitirVacio || !input.trim().isEmpty()) {
                return input;
            }
            System.err.println("Error. El campo no puede estar vacío. ");
            System.out.println(mensaje);
        }
    }

}
