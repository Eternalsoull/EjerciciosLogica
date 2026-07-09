package NivelIntermedioAvanzado;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Dado dado;
    private int lanzamientosPorRonda;

    public Juego() {
        this.jugadores = new ArrayList<>();
        this.dado = new Dado();
        this.lanzamientosPorRonda = 3;
    }

    public void agregarJugador(String nombre) {
        jugadores.add(new Jugador(nombre));
    }

    public void jugarRonda() {
        for (Jugador j : jugadores) {
            j.reiniciarPuntos();
            for (int i = 0; i < lanzamientosPorRonda; i++) {
                int valor = dado.lanzar();
                j.agregarPuntos(valor);
            }
        }
    }

    public Jugador determinarGanador() {
        Jugador ganador = null;
        int maxPuntos = -1;
        for (Jugador j : jugadores) {
            if (j.getPuntos() > maxPuntos) {
                maxPuntos = j.getPuntos();
                ganador = j;
            }
        }
        return ganador;
    }

    public ArrayList<Jugador> getJugadores() { return jugadores; }
}
