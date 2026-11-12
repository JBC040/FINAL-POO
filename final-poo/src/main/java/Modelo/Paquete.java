package Modelo;

import Excepciones.PesoInvalidoException;

import java.util.Objects;

public class Paquete {
    final private String NUMERO_GUIA;
    final private double PESO;
    final private Zona ZONA_ENVIO;

    public Paquete(String NUMERO_GUIA, double PESO, Zona ZONA_ENVIO) throws PesoInvalidoException {
        if (PESO <= 0) {
            throw new PesoInvalidoException("El Peso ingresado es inválido");
        }
        this.NUMERO_GUIA = NUMERO_GUIA;
        this.PESO = PESO;
        this.ZONA_ENVIO = ZONA_ENVIO;
    }

    public String getNUMERO_GUIA() {
        return NUMERO_GUIA;
    }

    public double getPESO() {
        return PESO;
    }

    public Zona getZONA_ENVIO() {
        return ZONA_ENVIO;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Paquete paquete)) return false;
        return Objects.equals(NUMERO_GUIA, paquete.NUMERO_GUIA);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(NUMERO_GUIA);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
