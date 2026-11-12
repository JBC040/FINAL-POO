package Envios;

import Modelo.Paquete;

import java.util.Objects;

public abstract class Envio {
    private String codigoConsecutivo;
    private Paquete paquete;

    public Envio(String codigoConsecutivo, Paquete paquete) {
        this.codigoConsecutivo = codigoConsecutivo;
        this.paquete = paquete;
    }

    public String getCodigoConsecutivo() {
        return codigoConsecutivo;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public double tarifaEnvio () {
        return paquete.getZONA_ENVIO().getTarifaZona() + 1000 * paquete.getPESO();
    }

    @Override
    public String toString() {
        return "codigoConsecutivo='" + codigoConsecutivo + '\'' +
                ", paquete=" + paquete +
                '}';
    }
}
