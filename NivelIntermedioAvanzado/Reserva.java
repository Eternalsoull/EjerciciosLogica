package NivelIntermedioAvanzado;

public class Reserva {
    private String cliente;
    private Habitacion habitacion;
    private int dias;

    public Reserva(String cliente, Habitacion habitacion, int dias) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.dias = dias;
    }

    public String getCliente() { return cliente; }
    public Habitacion getHabitacion() { return habitacion; }
    public int getDias() { return dias; }

    public double calcularCostoTotal() {
        return habitacion.getPrecioPorNoche() * dias;
    }

    public String mostrar() {
        return "Cliente: " + cliente + " | Hab. " + habitacion.getNumero() + " | Días: " + dias + " | Total: $" + calcularCostoTotal();
    }
}
