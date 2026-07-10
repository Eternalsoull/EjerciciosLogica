package NivelAvanzado2;

public class ReservaVuelo {
    private Pasajero pasajero;
    private Vuelo vuelo;
    private String codigoReserva;

    public ReservaVuelo(Pasajero pasajero, Vuelo vuelo, String codigoReserva) {
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.codigoReserva = codigoReserva;
    }

    public Pasajero getPasajero() { return pasajero; }
    public Vuelo getVuelo() { return vuelo; }
    public String getCodigoReserva() { return codigoReserva; }

    public String mostrar() {
        return codigoReserva + " | " + pasajero.getNombre() + " | " + vuelo.getCodigo() + " | " + vuelo.getOrigen() + " -> " + vuelo.getDestino();
    }
}
