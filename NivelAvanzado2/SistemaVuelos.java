package NivelAvanzado2;

import java.util.ArrayList;

public class SistemaVuelos {
    private ArrayList<Vuelo> vuelos;
    private ArrayList<Pasajero> pasajeros;
    private ArrayList<ReservaVuelo> reservas;
    private int contadorReservas;

    public SistemaVuelos() {
        this.vuelos = new ArrayList<>();
        this.pasajeros = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.contadorReservas = 1;
    }

    public void agregarVuelo(Vuelo vuelo) { vuelos.add(vuelo); }

    public void registrarPasajero(Pasajero pasajero) { pasajeros.add(pasajero); }

    public Vuelo buscarVuelo(String codigo) {
        for (Vuelo v : vuelos) {
            if (v.getCodigo().equals(codigo)) return v;
        }
        return null;
    }

    public Pasajero buscarPasajero(String documento) {
        for (Pasajero p : pasajeros) {
            if (p.getDocumento().equals(documento)) return p;
        }
        return null;
    }

    public ArrayList<Vuelo> buscarVuelos(String origen, String destino) {
        ArrayList<Vuelo> resultado = new ArrayList<>();
        for (Vuelo v : vuelos) {
            if (v.getOrigen().equalsIgnoreCase(origen) && v.getDestino().equalsIgnoreCase(destino) && v.getAsientosDisponibles() > 0) {
                resultado.add(v);
            }
        }
        return resultado;
    }

    public String reservar(String documento, String codigoVuelo) {
        Pasajero pasajero = buscarPasajero(documento);
        if (pasajero == null) return "Pasajero no encontrado.";

        Vuelo vuelo = buscarVuelo(codigoVuelo);
        if (vuelo == null) return "Vuelo no encontrado.";
        if (!vuelo.reservar()) return "No hay asientos disponibles.";

        String codigo = "RES" + (contadorReservas++);
        reservas.add(new ReservaVuelo(pasajero, vuelo, codigo));
        pasajero.agregarVuelo(codigoVuelo);
        return "Reserva exitosa. Código: " + codigo;
    }

    public String cancelar(String codigoReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            ReservaVuelo r = reservas.get(i);
            if (r.getCodigoReserva().equals(codigoReserva)) {
                r.getVuelo().cancelar();
                r.getPasajero().eliminarVuelo(r.getVuelo().getCodigo());
                double reembolso = r.getVuelo().getPrecio() * 0.7;
                reservas.remove(i);
                return "Reserva cancelada. Reembolso: $" + reembolso;
            }
        }
        return "Reserva no encontrada.";
    }

    public String listarReservas() {
        if (reservas.isEmpty()) return "Sin reservas.";
        StringBuilder sb = new StringBuilder();
        for (ReservaVuelo r : reservas) {
            sb.append(r.mostrar()).append("\n");
        }
        return sb.toString();
    }

    public String listarVuelos() {
        if (vuelos.isEmpty()) return "Sin vuelos.";
        StringBuilder sb = new StringBuilder();
        for (Vuelo v : vuelos) {
            sb.append(v.mostrar()).append("\n");
        }
        return sb.toString();
    }
}
