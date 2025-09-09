package src;

import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        do {
            System.out.print("Ingrese un N impar mayor que 3: ");
            N = sc.nextInt();
        } while (N <= 3 || N % 2 == 0);

        int[][] matriz = new int[N][N];
        int total = N * N;

        // Centro
        int i = N / 2, j = N / 2;
        int valor = 1;
        matriz[i][j] = valor++;

        // Direcciones: arriba, izquierda, abajo, derecha
        int[][] dir = { {-1, 0}, {0, -1}, {1, 0}, {0, 1} };

        int pasos = 1;
        while (valor <= total) {
            for (int d = 0; d < 4; d++) {
                for (int k = 0; k < pasos; k++) {
                    if (valor > total) break;
                    i += dir[d][0];
                    j += dir[d][1];
                    if (i >= 0 && i < N && j >= 0 && j < N) {
                        matriz[i][j] = valor++;
                    }
                }
                // cada dos direcciones, aumentar pasos
                if (d % 2 == 1) pasos++;
            }
        }

        // Imprimir
        System.out.println("\nMatriz espiral (desde el centro, dirección inicial = ARRIBA):");
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                System.out.printf("%3d ", matriz[r][c]);
            }
            System.out.println();
        }

        sc.close();
    }
}
