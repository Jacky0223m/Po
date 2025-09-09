package src;

import java.util.Scanner;

public class Ejercicio17 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        // Validar que N sea impar y mayor que 3
        do {
            System.out.print("Ingrese un valor impar mayor que 3 para N: ");
            N = sc.nextInt();
        } while (N <= 3 || N % 2 == 0);

        int[][] matriz = new int[N][N];

        // Construir la Z
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 || i == N - 1 || i + j == N - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz con forma de Z:");
        imprimirMatriz(matriz);

        sc.close();
    }

    // Auxiliar
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int val : fila) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
