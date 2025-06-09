package conductor;

import java.time.Duration;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Map;
import java.util.TreeMap;

import principal.Conductor;

public class DiaConductor {

    // Atributos

    private Conductor conductor;
    private Duration conexion, presencia, tareasAux;
    private LocalDate dia;
    private double facturacion;
    private static Map<YearMonth, Duration> historial_tareas_aux = new TreeMap<>();

    // Constructor

    public DiaConductor(Duration conexion, Duration presencia, double facturacion, LocalDate dia, Conductor conductor) {
        this.conexion = conexion;
        this.presencia = presencia;
        this.conductor = conductor;
        YearMonth mes = YearMonth.from(dia);
        this.tareasAux = historial_tareas_aux.getOrDefault(mes, Duration.ZERO);
    }

    // Métodos

	public Duration getConexion() {
        return conexion;
    }

    public void setConexion(Duration conexion) {
        this.conexion = conexion;
    }

    public Duration getPresencia() {
        return presencia;
    }

    public void setPresencia(Duration presencia) {
        this.presencia = presencia;
    }

    public Duration getTareasAux() {
        return tareasAux;
    }

    public void setTareasAux(Duration tareasAux) {
        this.tareasAux = tareasAux;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public double getFacturacion() {
        return facturacion;
    }

    public void setFacturacion(double facturacion) {
        this.facturacion = facturacion;
    }

    public static void registrar_tareasAux_mesActual(Duration tiempo){
        historial_tareas_aux.put(YearMonth.now(), tiempo);
    }

    public static void registrar_tareasAux_hastaFinDeAnio(Duration tiempo) {

        YearMonth mesActual = YearMonth.now();
        int anio = mesActual.getYear();

        for (int mes = mesActual.getMonthValue(); mes <= 12; mes++) {
            YearMonth ym = YearMonth.of(anio, mes);
            historial_tareas_aux.put(ym, tiempo);
        }

    }

    public static Map<YearMonth, Duration> getHistorial_tareas_aux() {
        return historial_tareas_aux;
    }

    public static void setHistorial_tareas_aux(Map<YearMonth, Duration> historial_tareas_aux) {
        DiaConductor.historial_tareas_aux = historial_tareas_aux;
    }

}
