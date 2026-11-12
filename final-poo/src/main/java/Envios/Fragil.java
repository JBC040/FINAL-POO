package Envios;

import Modelo.Paquete;

public class Fragil extends Envio {
    private String queContiene;

    public Fragil(String codigoConsecutivo, String nombreMensajero, Paquete paquete, String queContiene) {
        super(codigoConsecutivo, nombreMensajero, paquete);
        this.queContiene = queContiene;
    }

    @Override
    public double tarifaEnvio() {
        return super.tarifaEnvio()+ 5000;
    }
}
