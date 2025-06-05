package box;

public enum Turno {

    MAÑANA("Turno de mañana", 35, new boolean[]{true, true, true, true, true, false, false}),
    TARDE("Turno de tarde", 30, new boolean[]{true, true, true, true, true, false, false}),
    NOCHE("Turno de noche", 40, new boolean[]{true, true, true, true, true, true, false}),
    FIN_DE_SEMANA("Turno fin de semana", 20, new boolean[]{false, false, false, false, false, true, true});

    private final String nombre;
    private final int horasSemanales;
    private final boolean[] trabajaDias; // lunes a domingo

    Turno(String nombre, int horasSemanales, boolean[] trabajaDias) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
        this.trabajaDias = trabajaDias;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public boolean[] getTrabajaDias() {
        return trabajaDias;
    }

    public boolean trabajaElDia(int dia) {
        // 0 = lunes, 6 = domingo
        return trabajaDias[dia];
    }

    @Override
    public String toString() {
        return nombre + " (" + horasSemanales + "h/semana)";
    }
}
