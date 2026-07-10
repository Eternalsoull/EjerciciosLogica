package NivelAvanzado;

import java.util.ArrayList;

public class ArbolBinario {
    private NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(int valor) {
        raiz = insertarRec(raiz, valor);
    }

    private NodoArbol insertarRec(NodoArbol nodo, int valor) {
        if (nodo == null) return new NodoArbol(valor);
        if (valor < nodo.valor) nodo.izquierdo = insertarRec(nodo.izquierdo, valor);
        else if (valor > nodo.valor) nodo.derecho = insertarRec(nodo.derecho, valor);
        return nodo;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(NodoArbol nodo, int valor) {
        if (nodo == null) return false;
        if (valor == nodo.valor) return true;
        if (valor < nodo.valor) return buscarRec(nodo.izquierdo, valor);
        return buscarRec(nodo.derecho, valor);
    }

    public void eliminar(int valor) {
        raiz = eliminarRec(raiz, valor);
    }

    private NodoArbol eliminarRec(NodoArbol nodo, int valor) {
        if (nodo == null) return null;
        if (valor < nodo.valor) nodo.izquierdo = eliminarRec(nodo.izquierdo, valor);
        else if (valor > nodo.valor) nodo.derecho = eliminarRec(nodo.derecho, valor);
        else {
            if (nodo.izquierdo == null) return nodo.derecho;
            if (nodo.derecho == null) return nodo.izquierdo;
            nodo.valor = encontrarMinimo(nodo.derecho);
            nodo.derecho = eliminarRec(nodo.derecho, nodo.valor);
        }
        return nodo;
    }

    private int encontrarMinimo(NodoArbol nodo) {
        while (nodo.izquierdo != null) nodo = nodo.izquierdo;
        return nodo.valor;
    }

    public String inorden() {
        ArrayList<Integer> lista = new ArrayList<>();
        inordenRec(raiz, lista);
        return lista.toString();
    }

    private void inordenRec(NodoArbol nodo, ArrayList<Integer> lista) {
        if (nodo != null) {
            inordenRec(nodo.izquierdo, lista);
            lista.add(nodo.valor);
            inordenRec(nodo.derecho, lista);
        }
    }

    public String preorden() {
        ArrayList<Integer> lista = new ArrayList<>();
        preordenRec(raiz, lista);
        return lista.toString();
    }

    private void preordenRec(NodoArbol nodo, ArrayList<Integer> lista) {
        if (nodo != null) {
            lista.add(nodo.valor);
            preordenRec(nodo.izquierdo, lista);
            preordenRec(nodo.derecho, lista);
        }
    }

    public String postorden() {
        ArrayList<Integer> lista = new ArrayList<>();
        postordenRec(raiz, lista);
        return lista.toString();
    }

    private void postordenRec(NodoArbol nodo, ArrayList<Integer> lista) {
        if (nodo != null) {
            postordenRec(nodo.izquierdo, lista);
            postordenRec(nodo.derecho, lista);
            lista.add(nodo.valor);
        }
    }

    public int altura() {
        return alturaRec(raiz);
    }

    private int alturaRec(NodoArbol nodo) {
        if (nodo == null) return 0;
        int izq = alturaRec(nodo.izquierdo);
        int der = alturaRec(nodo.derecho);
        return Math.max(izq, der) + 1;
    }

    public boolean estaVacio() {
        return raiz == null;
    }
}
