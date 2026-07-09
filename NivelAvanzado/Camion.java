package NivelAvanzado;

public class Camion extends Vehiculo {
    private double capacidadToneladas;

    public Camion(String marca, String modelo, int anio, double capacidadToneladas) {
        super(marca, modelo, anio);
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularCostoMantenimiento() {
        return 80000 + (capacidadToneladas * 5000);
    }

    @Override
    public String mostrar() {
        return super.mostrar() + ", Capacidad: " + capacidadToneladas + " ton, Costo mant.: $" + calcularCostoMantenimiento();
    }
}
