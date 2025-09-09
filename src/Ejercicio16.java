package src;

import java.util.Scanner;

public class Ejercicio16 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        // El PDF pide N impar > 3; si quieres quítale la restricción, el patrón igual funciona.
        do {
            System.out.print("Ingrese un valor impar mayor que 3 para N: ");
            N = sc.nextInt();
        } while (N <= 3 || N % 2 == 0);

        int[][] matriz = new int[N][N]; // inicia en ceros por defecto
        int valor = 1;

        // Diagonales que arrancan en la fila 0, de izquierda a derecha
        for (int c = 0; c < N; c++) {
            int i = 0, j = c;
            while (i < N && j < N) {
                matriz[i][j] = valor++;
                i++;
                j++;
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz (diagonales desde la fila 0 hacia abajo):");
        imprimirMatriz(matriz);

        sc.close();
    }

    // Auxiliar para imprimir bonito
    private static void imprimirMatriz(int[][] m) {
        for (int[] fila : m) {
            for (int v : fila) System.out.printf("%3d ", v);
            System.out.println();
        }
    }
}
