package NivelBasico;
public class ValidadorDeNumeros {
    public static void main(String[] args) {
        System.out.println(esPar(10));
        System.out.println(esPrimo(6));
        System.out.println(esPerfecto(28));
        System.out.println(esPalindromo(55555));
    }

    public static int esPar(int numero){
        if (numero%2 ==0){
            System.out.println("El número es par:");
            return numero;
        } else {
            System.out.println("El número es impar:");
            return numero;
        }
    }

    public static int esPrimo(int numero){
        int resultado = 0;
        for (int i = 2; i < numero; i++){
            resultado = numero % i;
            if (resultado == 0) {
                System.out.println("El número NO es primo:");
                return numero;
            } 
        }
        System.out.println("El número ES primo:");
        return numero;
    }

    public static int esPerfecto(int numero){
        int contador = 0;
        for (int i = 1; i < numero; i++){
            if (numero % i == 0) {
                contador +=i;
                if(contador == numero){
                    System.out.println("El número ES perfecto:");
                    return numero;
                }
            }
        }
        System.out.println("El número NO es perfecto:");
        return numero;
    }

    public static int esPalindromo(int numero){
        int numeroInvertido = 0;
        int numeroOriginal = numero;
        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }
        if (numeroOriginal == numeroInvertido) {
            System.out.println("El número ES palíndromo:");
            return numeroOriginal;
        } else {
            System.out.println("El número NO es palíndromo:");
            return numeroOriginal;
        }
    } 


    


}
