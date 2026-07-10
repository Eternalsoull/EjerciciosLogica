package NivelAvanzado2;

import java.util.ArrayList;

public class Pasajero {
    private String nombre;
    private String documento;
    private ArrayList<String> historialVuelos;

    public Pasajero(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
        this.historialVuelos = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public String getDocumento() { return documento; }

    public void agregarVuelo(String codigoVuelo) {
        historialVuelos.add(codigoVuelo);
    }

    public void eliminarVuelo(String codigoVuelo) {
        historialVuelos.remove(codigoVuelo);
    }

    public String mostrar() {
        return nombre + " | Doc: " + documento + " | Vuelos: " + historialVuelos.size();
    }

    public String verHistorial() {
        if (historialVuelos.isEmpty()) return "Sin vuelos registrados.";
        return "Historial de " + nombre + ": " + historialVuelos.toString();
    }
}
