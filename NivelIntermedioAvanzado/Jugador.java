package NivelIntermedioAvanzado;

public class Jugador {
    private String nombre;
    private int puntos;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntos = 0;
    }

    public String getNombre() { return nombre; }
    public int getPuntos() { return puntos; }
    public void agregarPuntos(int puntos) { this.puntos += puntos; }
    public void reiniciarPuntos() { this.puntos = 0; }

    public String mostrar() {
        return nombre + " - Puntos: " + puntos;
    }
}
