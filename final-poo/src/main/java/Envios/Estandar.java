package Envios;

import Modelo.Paquete;

public class Estandar extends Envio {
    public Estandar(String codigoConsecutivo, String nombreMensajero, Paquete paquete) {
        super(codigoConsecutivo, nombreMensajero, paquete);
    }

    @Override
    public double tarifaEnvio() {
        return super.tarifaEnvio();
    }
}
