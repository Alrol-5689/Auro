package box;

import java.util.Scanner;

import utilities.Lectura;

public class GestionPrincipal{

    protected Scanner sc = new Scanner(System.in);
    protected Conductor cuentaActiva = null;
    protected Lectura l = new Lectura();
    int opcion=0;

    public void start() {

        opcion = l.menuSesion(sc);
        
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

