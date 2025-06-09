package excepciones;

public class NikNoEncontradoException extends Exception {

    private static final long serialVersionUID = 1L;

    public NikNoEncontradoException(String mensaje) {
        super(mensaje);
    }

}
