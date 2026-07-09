package NivelAvanzado;

import java.util.Random;

public class Dado {
    private int valor;
    private Random random;

    public Dado() {
        this.random = new Random();
        this.valor = 1;
    }

    public int lanzar() {
        this.valor = random.nextInt(6) + 1;
        return this.valor;
    }

    public int getValor() { return valor; }
}
