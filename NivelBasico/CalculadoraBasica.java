package NivelBasico;
public class CalculadoraBasica {
    public static void main(String[] args) {
        // int numero1 = 10;
        // int numero2 = 2;

        // int resultado = numero1 + numero2;
        System.out.println(sumar(10, 15));
        System.out.println(restar(10, 15));
        System.out.println(multiplicar(2, 5));
        System.out.println(dividir(10, 0));
        System.out.println(calcularPotencia(2,5));
        System.out.println(calcularRaizCuadrada(25));
}

    public static int sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int restar(int numero1, int numero2){
        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2){
        return numero1 * numero2;
    }

    public static int dividir(int numero1, int numero2){
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir entre 0.");
        }
        return numero1 / numero2;
    }

    public static int calcularPotencia(int base, int exponente){
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente no puede ser negativo.");
        }
        int resultado = 1;
        for (int i = 0; i < exponente; i++){
            resultado *= base;
        }
        return resultado;
    }

    public static int calcularRaizCuadrada(int numero){
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        int raiz = (int) Math.sqrt(numero);
        if (raiz * raiz != numero) {
            throw new IllegalArgumentException("El número no tiene raíz cuadrada exacta (entera).");
        }
        return raiz;
    }
    
}