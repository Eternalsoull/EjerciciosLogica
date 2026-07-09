package NivelAvanzado;

import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private ArrayList<Habitacion> habitaciones;
    private ArrayList<Reserva> reservas;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public Habitacion buscarHabitacionLibre(String tipo) {
        for (Habitacion h : habitaciones) {
            if (!h.isOcupada() && h.getTipo().equalsIgnoreCase(tipo)) return h;
        }
        return null;
    }

    public String hacerReserva(String cliente, String tipoHabitacion, int dias) {
        Habitacion hab = buscarHabitacionLibre(tipoHabitacion);
        if (hab == null) return "No hay habitaciones libres de tipo " + tipoHabitacion + ".";
        hab.ocupar();
        Reserva reserva = new Reserva(cliente, hab, dias);
        reservas.add(reserva);
        return "Reserva exitosa. " + reserva.mostrar();
    }

    public String cancelarReserva(int numeroHabitacion) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getHabitacion().getNumero() == numeroHabitacion) {
                reservas.get(i).getHabitacion().liberar();
                reservas.remove(i);
                return "Reserva cancelada.";
            }
        }
        return "Reserva no encontrada.";
    }

    public ArrayList<Reserva> listarReservas() { return reservas; }
    public ArrayList<Habitacion> listarHabitaciones() { return habitaciones; }
    public String getNombre() { return nombre; }
}
