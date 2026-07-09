package NivelIntermedioAvanzado;

public abstract class Figura {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String mostrar() {
        return "Área: " + calcularArea() + ", Perímetro: " + calcularPerimetro();
    }
}
