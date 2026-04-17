package NivelBasico;

public class ManipulacionDeCadenas {
    public static void main(String[] args) {
        System.out.println(contarVocales("Hola, soy Victor"));
        System.out.println(cualquierCosa("Hola, soy Victor"));
        System.out.println(invertirCadena("Hola, soy Victor"));
        System.out.println(contarPalabras("Hola, soy Victor"));
    }

    public static String contarVocales(String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++){
            char letra = cadena.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return "La cantidad de vocales es: " + contador;
    }

    public static String cualquierCosa(String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++){
            char letra = cadena.charAt(i);
            if (letra == 'b' || letra == 'c' || letra == 'd' || letra == 'f' || letra == 'g' || letra == 'h' || letra == 'j' || letra == 'k' || letra == 'l' || letra == 'm' || letra == 'n' || letra == 'p' || letra == 'q' || letra == 'r' || letra == 's' || letra == 't' || letra == 'v' || letra == 'w' || letra == 'x' || letra == 'y' || letra == 'z' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'F' || letra == 'G' || letra == 'H' || letra == 'J' || letra == 'K' || letra == 'L' || letra == 'M' || letra == 'N' || letra == 'P' || letra == 'Q' || letra == 'R' || letra == 'S' || letra == 'T' || letra == 'V' || letra == 'W' || letra == 'X' || letra == 'Y' || letra == 'Z') {
                contador++;
            }
        }
        return "La cantidad de consonantes es: " + contador;
    }

    public static String invertirCadena(String cadena){
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--){
            cadenaInvertida += cadena.charAt(i);
        }
        return "La cadena invertida es: " + cadenaInvertida;
    }

    public static String contarPalabras(String cadena){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++){
            char letra = cadena.charAt(i);
            if (letra == ' ') {
                contador++;
            }
        }
        return "La cantidad de palabras es: " + (contador + 1);
    }
}
