package NivelBasico;

public class OperacionesConListas {
    public static void main(String[] args) {
        int[] lista = {5, 10, 15, 20, 26, 15};
        encontrarMayor(lista);
        encontrarMenor(lista);
        calcularPromedio(lista);
        eliminarDuplicados(lista);
        ordenarLista(lista);
    }

    public static void encontrarMayor(int[] lista) {
        int mayor = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] > mayor) {
                mayor = lista[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
    }

    public static void encontrarMenor(int[] lista){
        int menor = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i] < menor) {
                menor = lista[i];
            }
        }
        System.out.println("El número menor es: " + menor);
    }

    public static void calcularPromedio(int[] lista){
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma += lista[i];
        }
        double promedio = (double) suma / lista.length;
        System.out.println("El promedio es: " + promedio);
    }

    public static void eliminarDuplicados(int[] lista){
        int[] listaSinDuplicados = new int[lista.length];
        int contador = 0;
        for (int i = 0; i < lista.length; i++) {
            boolean esDuplicado = false;
            for (int j = 0; j < contador; j++) {
                if (lista[i] == listaSinDuplicados[j]) {
                    esDuplicado = true;
                    break; 
                }
            }
            if (!esDuplicado) {
                listaSinDuplicados[contador] = lista[i];
                contador++;
            }
        }
        System.out.println("La lista sin duplicados es: ");
        for (int i = 0; i < contador; i++) {
            System.out.print(listaSinDuplicados[i] + " ");
        }
        System.out.println();
    }

    public static void ordenarLista(int[] lista){
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = 0; j < lista.length - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }
        System.out.println("La lista ordenada es: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    } 
    
}
