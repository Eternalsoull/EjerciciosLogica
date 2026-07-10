package NivelAvanzado2;

import java.util.Random;

public class Sudoku {

    public static boolean validar(int[][] tablero) {
        for (int i = 0; i < 9; i++) {
            boolean[] fila = new boolean[10];
            boolean[] col = new boolean[10];
            for (int j = 0; j < 9; j++) {
                int valFila = tablero[i][j];
                int valCol = tablero[j][i];
                if (valFila < 0 || valFila > 9 || valCol < 0 || valCol > 9) return false;
                if (valFila != 0 && fila[valFila]) return false;
                if (valCol != 0 && col[valCol]) return false;
                fila[valFila] = true;
                col[valCol] = true;
            }
        }

        for (int bi = 0; bi < 3; bi++) {
            for (int bj = 0; bj < 3; bj++) {
                boolean[] bloque = new boolean[10];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int val = tablero[bi * 3 + i][bj * 3 + j];
                        if (val != 0 && bloque[val]) return false;
                        bloque[val] = true;
                    }
                }
            }
        }
        return true;
    }

    public static boolean resolver(int[][] tablero) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (tablero[i][j] == 0) {
                    for (int num = 1; num <= 9; num++) {
                        if (esSeguro(tablero, i, j, num)) {
                            tablero[i][j] = num;
                            if (resolver(tablero)) return true;
                            tablero[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean esSeguro(int[][] tablero, int fila, int col, int num) {
        for (int j = 0; j < 9; j++) {
            if (tablero[fila][j] == num) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (tablero[i][col] == num) return false;
        }
        int bi = (fila / 3) * 3;
        int bj = (col / 3) * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[bi + i][bj + j] == num) return false;
            }
        }
        return true;
    }

    public static int[][] generar(int celdasVacias) {
        int[][] tablero = new int[9][9];
        resolver(tablero);
        Random rand = new Random();
        int eliminadas = 0;
        while (eliminadas < celdasVacias) {
            int i = rand.nextInt(9);
            int j = rand.nextInt(9);
            if (tablero[i][j] != 0) {
                tablero[i][j] = 0;
                eliminadas++;
            }
        }
        return tablero;
    }

    public static String imprimir(int[][] tablero) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) sb.append("------+-------+------\n");
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) sb.append("| ");
                sb.append(tablero[i][j] == 0 ? "." : tablero[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
