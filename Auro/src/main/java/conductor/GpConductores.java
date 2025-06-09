package conductor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import excepciones.NikNoEncontradoException;
import excepciones.PinIncorrectoException;
import excepciones.PinInvalidoException;
import lecturaEscritura.MenuSesion;
import lecturaEscritura.Utilities;
import lecturaEscritura.Validador;
import principal.Conductor;

public class GpConductores {

    // protected Scanner sc = new Scanner(System.in);
    protected MetodosConductor metodosConductor = new MetodosConductor();
    protected Conductor cuentaActiva = null;
    private List<Conductor> conductores = new ArrayList<>();
    protected MenuSesion menu = new MenuSesion();
    int opcion;

    public void loginConductor(Scanner sc, Utilities u, Validador v) {

        do {
            opcion = menu.sesionConductor(sc); // Este menú solo aparece si no hay login
            switch (opcion) {
                case 1:
                    iniciarSesion_conductor(sc, u, v);
                    if (cuentaActiva != null) {
                        opcionesConductor(sc, u, v);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Sesión cerrada correctamente.");
                    break;
                default:
                    break;
            }
        } while (opcion != 3);

        cuentaActiva = null;

    }

    public void opcionesConductor(Scanner sc, Utilities u, Validador v) {
        do {
            opcion = menu.opciones_Conductor(sc);
            switch (opcion) {
                case 1:
                    opcion = menu.registrosDiarios_conductor(sc);
                    switch (opcion) {
                        case 1:
                            metodosConductor.registrarJornada(sc, cuentaActiva, u, v);
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;

                        default:
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        } while (opcion != 3);

    }

    private void iniciarSesion_conductor(Scanner sc, Utilities u, Validador v) {
        int intentos = 0;
        while (intentos < 4) {
            try {
                String nik = u.pedirString(sc, false, "Nik: ");
                v.validarNik_loginEmpleado(nik, conductores);
                for (Conductor c : conductores) {
                    if (c.getNik().equals(nik)) {
                        String pin = u.pedirString(sc, false, "Pin: ");
                        v.validarPin(pin);
                        v.validarPin_loginEmpleado(pin, c);
                        cuentaActiva = c;
                        break;
                    }
                }
            } catch (NikNoEncontradoException | PinInvalidoException | PinIncorrectoException e) {
                System.out.println("Error: " + e.getMessage());
                cuentaActiva = null;
                intentos++;
            }
        }
        if (cuentaActiva != null) {
            System.out.println("Sesión iniciada correctamente.");
        } else {
            System.out.println("Superado el número de intentos. Sesión no iniciada.");
        }
    }

    // private void iniciarSesion(Scanner sc, Utilities u) {
    // Conductor aIniciar = null;
    // String nik = u.pedirString(sc, false, "Nik: ");
    // for (Conductor c : conductores) {
    // if (c.getNik().equals(nik)) {
    // aIniciar = c;
    // break;
    // }
    // }
    // if (aIniciar == null) {
    // System.out.println("Cuenta no encontrada.");
    // return;
    // } else {
    // int intentos = 0;
    // while (intentos < 4) {
    // String pin = u.pedirString(sc, false, "pin: ");
    // if (pin.equals(aIniciar.getPin())) {
    // cuentaActiva = aIniciar;
    // System.out.println("Sesión iniciada correctamente.");
    // }else{
    // System.out.println("Pin incorrecto. ");
    // }
    // }
    // }

    // }

}
