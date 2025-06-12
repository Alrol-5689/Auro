package excepciones;

public class PinIncorrectoException extends Exception {

    private static final long serialVersionUID = 1L;

    public PinIncorrectoException(String mensaje) {
        super(mensaje);
    }

}
