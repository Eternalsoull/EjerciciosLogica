package NivelIntermedioAvanzado;

public class Habitacion {
    private int numero;
    private String tipo;
    private double precioPorNoche;
    private boolean ocupada;

    public Habitacion(int numero, String tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.ocupada = false;
    }

    public int getNumero() { return numero; }
    public String getTipo() { return tipo; }
    public double getPrecioPorNoche() { return precioPorNoche; }
    public boolean isOcupada() { return ocupada; }
    public void ocupar() { this.ocupada = true; }
    public void liberar() { this.ocupada = false; }

    public String mostrar() {
        return "Hab. " + numero + " | Tipo: " + tipo + " | $" + precioPorNoche + "/noche | " + (ocupada ? "Ocupada" : "Libre");
    }
}
