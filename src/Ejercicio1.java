package src;
/*   1. Leer una matriz A de orden M x N y un número K. Multiplicar todos los 
elementos de la matriz por el número K. Mostrar la matriz resultante. */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer dimensiones
        System.out.print("Ingrese número de filas (M): ");
        int M = sc.nextInt();
        System.out.print("Ingrese número de columnas (N): ");
        int N = sc.nextInt();

        int[][] matriz = new int[M][N];

        // Llenar matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Leer K
        System.out.print("Ingrese el número K: ");
        int K = sc.nextInt();

        // Multiplicar y mostrar la matriz resultante
        System.out.println("\nMatriz resultante:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print((matriz[i][j] * K) + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
