package NivelAvanzado;

import java.util.ArrayList;

public class Pila<T> {
    private ArrayList<T> elementos;

    public Pila() {
        this.elementos = new ArrayList<>();
    }

    public void push(T elemento) {
        elementos.add(elemento);
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("La pila está vacía.");
        return elementos.remove(elementos.size() - 1);
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("La pila está vacía.");
        return elementos.get(elementos.size() - 1);
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }

    public static boolean parentesisBalanceados(String expresion) {
        Pila<Character> pila = new Pila<>();
        for (char c : expresion.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) return false;
                char tope = pila.pop();
                if (c == ')' && tope != '(') return false;
                if (c == ']' && tope != '[') return false;
                if (c == '}' && tope != '{') return false;
            }
        }
        return pila.isEmpty();
    }
}
