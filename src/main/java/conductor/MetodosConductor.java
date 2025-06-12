package conductor;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

import lecturaEscritura.Utilities;
import lecturaEscritura.Validador;
import principal.Conductor;

public class MetodosConductor {

    public void registrarJornada(Scanner sc, Conductor cuentaActiva, Utilities u, Validador v) {

        while (true) { 
            LocalDate dia = u.pedirFecha(sc, "Introduce la fecha del día que quieres registra: ");
            Duration conexion = u.pedirDuracion(sc, "Introcuce el tiempo de conexión:");
            Duration presencia = u.pedirDuracion(sc, "Introduce el tiempo de presencia:");
            double facturacion = u.pedirDouble(sc, "Facturado: ");
    
            System.out.println("Resumen: [" + dia + "]. Conexión: " + conexion + ". Presencia: " + presencia + ". Factiración: " + facturacion + "€.");
    
            boolean datosCorrectos = u.confirmacionSiNo(sc, "¿Son correctos los datos a registrar? ( 's' / 'n' ): ");
            
            if(datosCorrectos){
                // TODO: Hay que meter el nuevo día en la lista del condustor. Pensar en cambiarlo por un List normal.
                var nuevoRegistro = new DiaConductor(conexion, presencia, facturacion, dia, cuentaActiva); 
                System.out.println("Registro realizado con éxito.");
                return;
            }else{
                String mensaje = """
                        1.- Volver a introducir el regustro de jornada.
                        2.- Salir
                        Introduce una opción: 
                        """;
                int op = u.pedirOpcion(sc, 2, mensaje + " ");
                if(op == 2){
                    System.out.println("Abortamos registro del día.");
                    return;
                }
            }                    
        }
    }

}
