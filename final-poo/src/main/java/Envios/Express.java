package Envios;

import Modelo.Paquete;

public class Express extends Envio {
    public Express(String codigoConsecutivo, String nombreMensajero, Paquete paquete) {
        super(codigoConsecutivo, nombreMensajero, paquete);
    }

    @Override
    public double tarifaEnvio() {
        return super.tarifaEnvio() + super.tarifaEnvio() / 2;
    }
}
