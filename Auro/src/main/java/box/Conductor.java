package box;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.HashMap;
import java.util.Map;

public class Conductor {

    private String nombre, apellidos, dni, email, direccion;
    private int id, telefono;
    private Map<YearMonth, Turno> historialTurnos;
    private Map<LocalDate, DiaConductor> historialJornada;
    private static int idSiguiente;

    public Conductor(String nombre, String apellidos, String dni, String emial, String direccion, int telefono, Turno turno) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = emial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.historialTurnos = new HashMap<>();
        this.id = ++idSiguiente;
    }

    @Override
    public String toString() {
        return "[ID: " + id + "] " + nombre + " " + apellidos + ", DNI: " + dni + ", email: " + email
                + ", direccion: " + direccion + ", id=" + id + ", telefono=" + telefono + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
        result = prime * result + id;
        result = prime * result + telefono;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Conductor other = (Conductor) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellidos == null) {
            if (other.apellidos != null)
                return false;
        } else if (!apellidos.equals(other.apellidos))
            return false;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (direccion == null) {
            if (other.direccion != null)
                return false;
        } else if (!direccion.equals(other.direccion))
            return false;
        if (id != other.id)
            return false;
        if (telefono != other.telefono)
            return false;
        return true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Map<YearMonth, Turno> getHistorialTurnos() {
        return historialTurnos;
    }

    public void setHistorialTurnos(Map<YearMonth, Turno> historialTurnos) {
        this.historialTurnos = historialTurnos;
    }

    public void asignarTurno(YearMonth mes, Turno turno){
        historialTurnos.put(mes, turno);
    }

    public Map<LocalDate, DiaConductor> getHistorialJornada() {
        return historialJornada;
    }

    public void registrarDia(LocalDate dia, DiaConductor d){
        this.historialJornada.put(dia, d);
    }

    public void setHistorialJornada(Map<LocalDate, DiaConductor> historialJornada) {
        this.historialJornada = historialJornada;
    }

    public static int getIdSiguiente() {
        return idSiguiente;
    }

    public static void setIdSiguiente(int idSiguiente) {
        Conductor.idSiguiente = idSiguiente;
    }

}
