package Envios;
import Excepciones.ExcesoPesoException;
import java.util.ArrayList;
import java.util.List;

public class Despacho <T extends Envio> {
    private String nombreMensajero;
    private final List <Envio> envios;

    public Despacho(List<Envio> envios, String nombreMensajero) throws ExcesoPesoException {
        this.envios = new ArrayList<>();
        this.nombreMensajero = nombreMensajero;
    }
}
