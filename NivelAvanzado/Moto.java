package NivelAvanzado;

public class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int anio, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularCostoMantenimiento() {
        return 30000 + (cilindrada > 600 ? 20000 : 0);
    }

    @Override
    public String mostrar() {
        return super.mostrar() + ", Cilindrada: " + cilindrada + "cc, Costo mant.: $" + calcularCostoMantenimiento();
    }
}
