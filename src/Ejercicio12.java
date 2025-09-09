package src;

import java.util.Scanner;

public class Ejercicio12 {
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
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = valor++;
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz generada:");
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
