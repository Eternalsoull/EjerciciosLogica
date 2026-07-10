package NivelAvanzado;

public class ListaEnlazada {
    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }

    public void insertar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public boolean eliminar(int dato) {
        if (cabeza == null) return false;
        if (cabeza.dato == dato) {
            cabeza = cabeza.siguiente;
            return true;
        }
        Nodo actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.dato == dato) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public boolean buscar(int dato) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.dato == dato) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    public void invertir() {
        Nodo anterior = null;
        Nodo actual = cabeza;
        while (actual != null) {
            Nodo siguiente = actual.siguiente;
            actual.siguiente = anterior;
            anterior = actual;
            actual = siguiente;
        }
        cabeza = anterior;
    }

    public boolean detectarCiclo() {
        if (cabeza == null) return false;
        Nodo lento = cabeza;
        Nodo rapido = cabeza;
        while (rapido != null && rapido.siguiente != null) {
            lento = lento.siguiente;
            rapido = rapido.siguiente.siguiente;
            if (lento == rapido) return true;
        }
        return false;
    }

    public int obtenerEnPosicion(int n) {
        Nodo actual = cabeza;
        int indice = 0;
        while (actual != null) {
            if (indice == n) return actual.dato;
            actual = actual.siguiente;
            indice++;
        }
        throw new IndexOutOfBoundsException("Posición " + n + " fuera de rango.");
    }

    public String mostrar() {
        if (cabeza == null) return "Lista vacía.";
        StringBuilder sb = new StringBuilder();
        Nodo actual = cabeza;
        while (actual != null) {
            sb.append(actual.dato);
            if (actual.siguiente != null) sb.append(" -> ");
            actual = actual.siguiente;
        }
        return sb.toString();
    }
}
