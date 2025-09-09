package src;
import java.util.Scanner;

public class Ejercicio6 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer dimensiones
        System.out.print("Ingrese número de filas (N): ");
        int N = sc.nextInt();
        System.out.print("Ingrese número de columnas (M): ");
        int M = sc.nextInt();

        int[][] matriz1 = new int[N][M];
        int[][] matriz2 = new int[N][M];

        // Llenar primera matriz
        System.out.println("\nIngrese los elementos de la primera matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        // Llenar segunda matriz
        System.out.println("\nIngrese los elementos de la segunda matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = sc.nextInt();
            }
        }

        // a) Suma de matrices
        int[][] suma = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("\nMatriz resultante de la SUMA:");
        imprimirMatriz(suma);

        // b) Multiplicación de matrices (si es posible)
        if (M == N) {
            int[][] producto = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    producto[i][j] = 0;
                    for (int k = 0; k < M; k++) {
                        producto[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }

            System.out.println("\nMatriz resultante de la MULTIPLICACIÓN:");
            imprimirMatriz(producto);
        } else {
            System.out.println("\nNo es posible multiplicar las matrices (N x M y N x M no son compatibles).");
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
