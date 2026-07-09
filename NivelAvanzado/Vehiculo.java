package NivelAvanzado;

public abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anio;

    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public abstract double calcularCostoMantenimiento();

    public String mostrar() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio;
    }
}
