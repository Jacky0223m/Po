package src;

import java.util.Scanner;

public class Ejercicio7 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer dimensiones
        System.out.print("Ingrese número de filas (N): ");
        int N = sc.nextInt();
        System.out.print("Ingrese número de columnas (M): ");
        int M = sc.nextInt();

        int[][] matriz = new int[N][M];

        // Llenar matriz
        System.out.println("\nIngrese los elementos de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        // a) Eliminar fila X
        System.out.print("\nIngrese la fila a eliminar (0-" + (N - 1) + "): ");
        int filaEliminar = sc.nextInt();
        if (filaEliminar >= 0 && filaEliminar < N) {
            int[][] nuevaMatriz = new int[N - 1][M];
            int ni = 0;
            for (int i = 0; i < N; i++) {
                if (i == filaEliminar) continue;
                for (int j = 0; j < M; j++) {
                    nuevaMatriz[ni][j] = matriz[i][j];
                }
                ni++;
            }
            System.out.println("\nMatriz tras eliminar fila " + filaEliminar + ":");
            imprimirMatriz(nuevaMatriz);
        }

        // b) Eliminar columna Y
        System.out.print("\nIngrese la columna a eliminar (0-" + (M - 1) + "): ");
        int colEliminar = sc.nextInt();
        if (colEliminar >= 0 && colEliminar < M) {
            int[][] nuevaMatriz = new int[N][M - 1];
            for (int i = 0; i < N; i++) {
                int nj = 0;
                for (int j = 0; j < M; j++) {
                    if (j == colEliminar) continue;
                    nuevaMatriz[i][nj] = matriz[i][j];
                    nj++;
                }
            }
            System.out.println("\nMatriz tras eliminar columna " + colEliminar + ":");
            imprimirMatriz(nuevaMatriz);
        }

        // c) Insertar nueva fila en X
        System.out.print("\nIngrese la posición para insertar nueva fila (0-" + N + "): ");
        int filaInsertar = sc.nextInt();
        if (filaInsertar >= 0 && filaInsertar <= N) {
            int[][] nuevaMatriz = new int[N + 1][M];
            for (int i = 0; i < nuevaMatriz.length; i++) {
                if (i == filaInsertar) {
                    System.out.println("Ingrese valores para la nueva fila:");
                    for (int j = 0; j < M; j++) {
                        nuevaMatriz[i][j] = sc.nextInt();
                    }
                } else if (i < filaInsertar) {
                    nuevaMatriz[i] = matriz[i];
                } else {
                    nuevaMatriz[i] = matriz[i - 1];
                }
            }
            System.out.println("\nMatriz tras insertar fila:");
            imprimirMatriz(nuevaMatriz);
        }

        // d) Insertar nueva columna en Y
        System.out.print("\nIngrese la posición para insertar nueva columna (0-" + M + "): ");
        int colInsertar = sc.nextInt();
        if (colInsertar >= 0 && colInsertar <= M) {
            int[][] nuevaMatriz = new int[N][M + 1];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < nuevaMatriz[0].length; j++) {
                    if (j == colInsertar) {
                        System.out.print("Nuevo valor en fila " + i + ": ");
                        nuevaMatriz[i][j] = sc.nextInt();
                    } else if (j < colInsertar) {
                        nuevaMatriz[i][j] = matriz[i][j];
                    } else {
                        nuevaMatriz[i][j] = matriz[i][j - 1];
                    }
                }
            }
            System.out.println("\nMatriz tras insertar columna:");
            imprimirMatriz(nuevaMatriz);
        }

        sc.close();
    }

    // Método auxiliar para imprimir matrices
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int val : fila) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
