package NivelAvanzado;

import java.util.Arrays;
import java.util.Comparator;

public class OrdenamientoAvanzado {

    public static void quickSort(int[] arr, int bajo, int alto) {
        if (bajo < alto) {
            int pivote = particion(arr, bajo, alto);
            quickSort(arr, bajo, pivote - 1);
            quickSort(arr, pivote + 1, alto);
        }
    }

    private static int particion(int[] arr, int bajo, int alto) {
        int pivote = arr[alto];
        int i = bajo - 1;
        for (int j = bajo; j < alto; j++) {
            if (arr[j] <= pivote) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[alto];
        arr[alto] = temp;
        return i + 1;
    }

    public static void mergeSort(int[] arr, int izq, int der) {
        if (izq < der) {
            int medio = (izq + der) / 2;
            mergeSort(arr, izq, medio);
            mergeSort(arr, medio + 1, der);
            merge(arr, izq, medio, der);
        }
    }

    private static void merge(int[] arr, int izq, int medio, int der) {
        int n1 = medio - izq + 1;
        int n2 = der - medio;
        int[] izquierda = new int[n1];
        int[] derecha = new int[n2];

        for (int i = 0; i < n1; i++) izquierda[i] = arr[izq + i];
        for (int j = 0; j < n2; j++) derecha[j] = arr[medio + 1 + j];

        int i = 0, j = 0, k = izq;
        while (i < n1 && j < n2) {
            if (izquierda[i] <= derecha[j]) {
                arr[k] = izquierda[i];
                i++;
            } else {
                arr[k] = derecha[j];
                j++;
            }
            k++;
        }
        while (i < n1) { arr[k] = izquierda[i]; i++; k++; }
        while (j < n2) { arr[k] = derecha[j]; j++; k++; }
    }

    public static String compararTiempos(int[] arr) {
        int[] copia1 = Arrays.copyOf(arr, arr.length);
        int[] copia2 = Arrays.copyOf(arr, arr.length);

        long inicio = System.nanoTime();
        quickSort(copia1, 0, copia1.length - 1);
        long tiempoQuick = System.nanoTime() - inicio;

        inicio = System.nanoTime();
        mergeSort(copia2, 0, copia2.length - 1);
        long tiempoMerge = System.nanoTime() - inicio;

        return "QuickSort: " + tiempoQuick + " ns | MergeSort: " + tiempoMerge + " ns";
    }

    public static String ordenarPorCriterios(ProductoSimple[] productos) {
        Arrays.sort(productos, Comparator
                .comparingDouble(ProductoSimple::getPrecio)
                .thenComparing(ProductoSimple::getNombre));

        StringBuilder sb = new StringBuilder();
        for (ProductoSimple p : productos) {
            sb.append(p.mostrar()).append("\n");
        }
        return sb.toString();
    }

    public static String imprimirArreglo(int[] arr) {
        return Arrays.toString(arr);
    }
}
