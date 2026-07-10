package NivelAvanzado;

public class NodoArbol {
    public int valor;
    public NodoArbol izquierdo;
    public NodoArbol derecho;

    public NodoArbol(int valor) {
        this.valor = valor;
        this.izquierdo = null;
        this.derecho = null;
    }
}
