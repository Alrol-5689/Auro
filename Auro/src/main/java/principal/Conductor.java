package principal;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Map;
import java.util.TreeMap;

import conductor.DiaConductor;
import gestor.Turno;

public class Conductor extends Empleado {

    private Map<YearMonth, Turno> historialTurnos;
    private Map<LocalDate, DiaConductor> historialJornada;

    public Conductor(String nik, String nombre, String apellidos, String dni, String emial, String direccion, int telefono) {
        super(nik, nombre, apellidos, dni, emial, direccion, telefono);
        this.historialTurnos = new TreeMap<>();
        this.historialJornada = new TreeMap<>(); 
    }

    public Map<YearMonth, Turno> getHistorialTurnos() {
        return historialTurnos;
    }

    public void setHistorialTurnos(Map<YearMonth, Turno> historialTurnos) {
        this.historialTurnos = historialTurnos;
    }

    public void asignarTurno(YearMonth mes, Turno turno) {
        historialTurnos.put(mes, turno);
    }

    public Map<LocalDate, DiaConductor> getHistorialJornada() {
        return historialJornada;
    }

    public void registrarDia(LocalDate dia, DiaConductor d) {
        this.historialJornada.put(dia, d);
    }

    public void setHistorialJornada(Map<LocalDate, DiaConductor> historialJornada) {
        this.historialJornada = historialJornada;
    }



}
