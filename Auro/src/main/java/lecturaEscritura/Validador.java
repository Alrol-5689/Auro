package lecturaEscritura;

import java.util.List;

import excepciones.NikNoEncontradoException;
import excepciones.PinIncorrectoException;
import excepciones.PinInvalidoException;
import principal.Empleado;

public class Validador {

    public void validarPin(String pin) throws PinInvalidoException {
        if (pin == null || !pin.matches("\\d{4}")) {
            throw new PinInvalidoException("el PIN debe tener 4 dígitos.");
        }
    }

    public void validarPin_loginEmpleado(String pin, Empleado empleado) throws PinIncorrectoException {
        if (!pin.equals(empleado.getPin())) {
            throw new PinIncorrectoException("el PIN es incorrecto.");
        }
    }

    public void validarNik_loginEmpleado(String nik, List<? extends Empleado> empleado) throws NikNoEncontradoException {
        boolean match = false;
        for(Empleado e : empleado){
            if(e.getNik().equals(nik)){
                match = true;
            }
        }
        if (!match) {
            throw new NikNoEncontradoException("Nik no encontrado.");
        }
    }

}
