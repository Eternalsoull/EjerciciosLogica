package NivelAvanzado2;

import java.util.Stack;

public class AnalizadorExpresiones {

    private static int precedencia(char op) {
        switch (op) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
            default: return 0;
        }
    }

    private static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    public static String infijaAPostfija(String infija) {
        StringBuilder postfija = new StringBuilder();
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < infija.length(); i++) {
            char c = infija.charAt(i);

            if (c == ' ') continue;

            if (Character.isDigit(c) || c == '.') {
                while (i < infija.length() && (Character.isDigit(infija.charAt(i)) || infija.charAt(i) == '.')) {
                    postfija.append(infija.charAt(i));
                    i++;
                }
                postfija.append(' ');
                i--;
            } else if (c == '(') {
                pila.push(c);
            } else if (c == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    postfija.append(pila.pop()).append(' ');
                }
                pila.pop();
            } else if (esOperador(c)) {
                while (!pila.isEmpty() && precedencia(pila.peek()) >= precedencia(c)) {
                    postfija.append(pila.pop()).append(' ');
                }
                pila.push(c);
            }
        }

        while (!pila.isEmpty()) {
            postfija.append(pila.pop()).append(' ');
        }

        return postfija.toString().trim();
    }

    public static double evaluarPostfija(String postfija) {
        Stack<Double> pila = new Stack<>();
        String[] tokens = postfija.split("\\s+");

        for (String token : tokens) {
            if (token.isEmpty()) continue;

            if (esNumero(token)) {
                pila.push(Double.parseDouble(token));
            } else {
                double b = pila.pop();
                double a = pila.pop();
                switch (token.charAt(0)) {
                    case '+': pila.push(a + b); break;
                    case '-': pila.push(a - b); break;
                    case '*': pila.push(a * b); break;
                    case '/': pila.push(a / b); break;
                    case '^': pila.push(Math.pow(a, b)); break;
                }
            }
        }
        return pila.pop();
    }

    private static boolean esNumero(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String resolver(String expresion) {
        String postfija = infijaAPostfija(expresion);
        double resultado = evaluarPostfija(postfija);
        return "Postfija: " + postfija + "\nResultado: " + resultado;
    }
}
