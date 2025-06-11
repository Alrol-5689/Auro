package principal;

import java.util.Scanner;

import conductor.GpConductores;
import gestor.GpGestores;
import interfazGrafica.VentanaArea;
import lecturaEscritura.MenuSesion;
import lecturaEscritura.Utilities;
import lecturaEscritura.Validador;

public class Main {

    public static void main(String[] args) {
    	
        javax.swing.SwingUtilities.invokeLater(() -> {
            VentanaArea va = new VentanaArea();
            va.setVisible(true);
        });

//        GpConductores gpC = new GpConductores();
//        GpGestores gpG = new GpGestores();
//        Scanner sc = new Scanner(System.in);
//        MenuSesion menu = new MenuSesion();
//        Validador v = new Validador();
//        Utilities u = new Utilities();
//        int opcion;
//
//        do {
//            opcion = menu.acceso(sc);
//
//            switch (opcion) {
//                case 1: gpC.loginConductor(sc, u, v);
//                    break;
//                case 2: //gpG.start();
//                    break;
//                case 3: //gpJ.start();
//                    break;
//                case 4: System.out.println("""
//                    ======================
//                    HASTA LA PRÓXIMA
//                    ======================""");
//                    break;
//                default: System.err.println("Opción incorrecta.");
//                    break;
//            }
//        } while (opcion != 4);

    }
}