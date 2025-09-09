package src;

import java.util.Scanner;

public class Ejercicio8 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer dimensión
        System.out.print("Ingrese el tamaño de la matriz (N): ");
        int N = sc.nextInt();

        int[][] matriz = new int[N][N];

        // Llenar matriz
        System.out.println("\nIngrese los elementos de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Mostrar matriz original
        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        // Reemplazar en la misma matriz
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (matriz[i][j] < 0) {
                    matriz[i][j] = 0;
                } else if (matriz[i][j] > 0) {
                    matriz[i][j] = 9;
                }
            }
        }

        // Mostrar matriz modificada
        System.out.println("\nMatriz modificada:");
        imprimirMatriz(matriz);

        sc.close();
    }

    // Método auxiliar
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int val : fila) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}
