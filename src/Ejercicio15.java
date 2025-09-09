package src;

import java.util.Scanner;

public class Ejercicio15 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        // Validar que N sea impar y mayor que 3
        do {
            System.out.print("Ingrese un valor impar mayor que 3 para N: ");
            N = sc.nextInt();
        } while (N <= 3 || N % 2 == 0);

        int[][] matriz = new int[N][N];
        int valor = 1;

        // Llenar diagonales
        for (int k = 0; k < 2 * N - 1; k++) {
            if (k % 2 == 0) {
                // Subdiagonales: arriba -> abajo
                for (int i = 0; i <= k; i++) {
                    int j = k - i;
                    if (i < N && j < N) {
                        matriz[i][j] = valor++;
                    }
                }
            } else {
                // Subdiagonales: abajo -> arriba
                for (int j = 0; j <= k; j++) {
                    int i = k - j;
                    if (i < N && j < N) {
                        matriz[i][j] = valor++;
                    }
                }
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz generada en diagonales:");
        imprimirMatriz(matriz);

        sc.close();
    }

    // Método auxiliar
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int val : fila) {
                System.out.printf("%3d ", val);
            }
            System.out.println();
        }
    }
}
