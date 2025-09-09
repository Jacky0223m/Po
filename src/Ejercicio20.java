package src;

import java.util.Scanner;

public class Ejercicio20 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        do {
            System.out.print("Ingrese un valor impar mayor que 3 para N: ");
            N = sc.nextInt();
        } while (N <= 3 || N % 2 == 0);

        int[][] matriz = new int[N][N];
        int total = N * N;

        int top = 0, bottom = N - 1, left = 0, right = N - 1;
        int valor = 1;

        while (valor <= total) {
            // izquierda -> derecha
            for (int j = left; j <= right && valor <= total; j++) {
                matriz[top][j] = valor++;
            }
            top++;

            // arriba -> abajo
            for (int i = top; i <= bottom && valor <= total; i++) {
                matriz[i][right] = valor++;
            }
            right--;

            // derecha -> izquierda
            for (int j = right; j >= left && valor <= total; j--) {
                matriz[bottom][j] = valor++;
            }
            bottom--;

            // abajo -> arriba
            for (int i = bottom; i >= top && valor <= total; i--) {
                matriz[i][left] = valor++;
            }
            left++;
        }

        // Imprimir matriz
        System.out.println("\nMatriz espiral desde la esquina:");
        for (int[] fila : matriz) {
            for (int v : fila) System.out.printf("%3d ", v);
            System.out.println();
        }

        sc.close();
    }
}
