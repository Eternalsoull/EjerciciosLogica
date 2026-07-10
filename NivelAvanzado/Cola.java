package NivelAvanzado;

import java.util.ArrayList;

public class Cola<T> {
    private ArrayList<T> elementos;

    public Cola() {
        this.elementos = new ArrayList<>();
    }

    public void enqueue(T elemento) {
        elementos.add(elemento);
    }

    public T dequeue() {
        if (isEmpty()) throw new RuntimeException("La cola está vacía.");
        return elementos.remove(0);
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("La cola está vacía.");
        return elementos.get(0);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }

    public static String simularFilaBanco(String[] clientes) {
        Cola<String> fila = new Cola<>();
        StringBuilder sb = new StringBuilder();

        for (String cliente : clientes) {
            fila.enqueue(cliente);
            sb.append("Llega: ").append(cliente).append(" | Fila: ").append(fila.size()).append("\n");
        }

        sb.append("\n--- Atendiendo ---\n");
        while (!fila.isEmpty()) {
            String atendido = fila.dequeue();
            sb.append("Atendido: ").append(atendido).append(" | Fila restante: ").append(fila.size()).append("\n");
        }
        return sb.toString();
    }
}
