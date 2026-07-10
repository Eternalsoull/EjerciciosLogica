package NivelAvanzado2;

import java.util.ArrayList;

public class Vuelo {
    private String codigo;
    private String origen;
    private String destino;
    private int asientosTotales;
    private int asientosDisponibles;
    private double precio;

    public Vuelo(String codigo, String origen, String destino, int asientos, double precio) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.asientosTotales = asientos;
        this.asientosDisponibles = asientos;
        this.precio = precio;
    }

    public String getCodigo() { return codigo; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public int getAsientosDisponibles() { return asientosDisponibles; }
    public double getPrecio() { return precio; }

    public boolean reservar() {
        if (asientosDisponibles <= 0) return false;
        asientosDisponibles--;
        return true;
    }

    public void cancelar() {
        if (asientosDisponibles < asientosTotales) asientosDisponibles++;
    }

    public String mostrar() {
        return codigo + " | " + origen + " -> " + destino + " | $" + precio + " | Asientos: " + asientosDisponibles + "/" + asientosTotales;
    }
}
