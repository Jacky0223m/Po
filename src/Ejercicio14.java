package src;

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        do {
            System.out.print("Ingrese un valor impar mayor que 3 para N: ");
            N = sc.nextInt();
        } while (N <= 3 || N % 2 == 0);

        int[][] matriz = new int[N][N];
        int valor = 1;

        int top = 0, bottom = N - 1, left = 0, right = N - 1;

        while (top <= bottom && left <= right) {
            // fila superior: derecha -> izquierda
            for (int j = right; j >= left; j--) {
                matriz[top][j] = valor++;
            }
            top++;

            // columna izquierda: arriba -> abajo
            for (int i = top; i <= bottom; i++) {
                matriz[i][left] = valor++;
            }
            left++;

            // fila inferior: izquierda -> derecha
            if (top <= bottom) {
                for (int j = left; j <= right; j++) {
                    matriz[bottom][j] = valor++;
                }
                bottom--;
            }

            // columna derecha: abajo -> arriba
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matriz[i][right] = valor++;
                }
                right--;
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz patrón Ejercicio 14:");
        for (int[] fila : matriz) {
            for (int v : fila) {
                System.out.printf("%3d ", v);
            }
            System.out.println();
        }

        sc.close();
    }
}
