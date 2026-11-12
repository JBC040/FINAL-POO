package Modelo;

public enum Zona {
    CENTRO ("Centro", 6000),
    NORTE ("Norte", 8000),
    SUR ("Sur", 8000),
    ORIENTE ("Oriente", 15000);


    private String nombre;
    private double tarifaZona;

    Zona(String nombre, double tarifaZona) {
        this.nombre = nombre;
        this.tarifaZona = tarifaZona;
    }

    public String getNombre() {
        return nombre;
    }

    public double getTarifaZona() {
        return tarifaZona;
    }

    @Override
    public String toString() {
        return "Zona{" +
                "nombre='" + nombre + '\'' +
                ", tarifaZona=" + tarifaZona +
                '}';
    }
}
