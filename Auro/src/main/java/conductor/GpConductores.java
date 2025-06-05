package conductor;

import java.util.Scanner;

import lecturaEscritura.Menus;

public class GpConductores{

    protected Scanner sc = new Scanner(System.in);
    protected Conductor cuentaActiva = null;
    protected Menus menu = new Menus();
    int opcion=0;

    public void start() {

        opcion = menu.menuSesion(sc);
        
        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
        
    }
    
}

