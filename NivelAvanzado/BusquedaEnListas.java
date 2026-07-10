package NivelAvanzado;

import java.util.ArrayList;

public class BusquedaEnListas {

    public static int busquedaBinaria(int[] arr, int objetivo) {
        int izq = 0, der = arr.length - 1;
        while (izq <= der) {
            int medio = (izq + der) / 2;
            if (arr[medio] == objetivo) return medio;
            if (arr[medio] < objetivo) izq = medio + 1;
            else der = medio - 1;
        }
        return -1;
    }

    public static int busquedaLinealCentinela(int[] arr, int objetivo) {
        int n = arr.length;
        int ultimo = arr[n - 1];
        arr[n - 1] = objetivo;

        int i = 0;
        while (arr[i] != objetivo) i++;

        arr[n - 1] = ultimo;

        if (i < n - 1 || arr[n - 1] == objetivo) return i;
        return -1;
    }

    public static int elementoMasCercano(int[] arr, int valor) {
        int masCercano = arr[0];
        int minDiff = Math.abs(arr[0] - valor);
        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - valor);
            if (diff < minDiff) {
                minDiff = diff;
                masCercano = arr[i];
            }
        }
        return masCercano;
    }

    public static ArrayList<Integer> encontrarTodosIndices(int[] arr, int objetivo) {
        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == objetivo) indices.add(i);
        }
        return indices;
    }

    public static String imprimirArreglo(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
