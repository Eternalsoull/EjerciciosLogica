package NivelIntermedioAvanzado;

public class Auto extends Vehiculo {
    private int numPuertas;

    public Auto(String marca, String modelo, int anio, int numPuertas) {
        super(marca, modelo, anio);
        this.numPuertas = numPuertas;
    }

    @Override
    public double calcularCostoMantenimiento() {
        return 50000 + (anio < 2020 ? 30000 : 0);
    }

    @Override
    public String mostrar() {
        return super.mostrar() + ", Puertas: " + numPuertas + ", Costo mant.: $" + calcularCostoMantenimiento();
    }
}
