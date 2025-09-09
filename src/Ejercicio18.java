package src;
import java.util.Scanner;

public class Ejercicio18 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        do {
            System.out.print("Ingrese un valor impar mayor que 3 para N: ");
            N = sc.nextInt();
        } while (N <= 3 || N % 2 == 0);

        int[][] matriz = new int[N][N]; // inicializada con ceros
        int valor = 1;

        // k representa la diferencia i - j (diagonales)
        for (int k = 0; k < N; k++) {
            if (k % 2 == 0) {
                // recorrer de abajo hacia arriba: i = N-1 .. k
                for (int i = N - 1; i >= k; i--) {
                    int j = i - k;
                    matriz[i][j] = valor++;
                }
            } else {
                // recorrer de arriba hacia abajo: i = k .. N-1
                for (int i = k; i <= N - 1; i++) {
                    int j = i - k;
                    matriz[i][j] = valor++;
                }
            }
        }

        // imprimir matriz
        System.out.println("\nMatriz patrón Ejercicio 18:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%3d ", matriz[i][j]);
            }
            System.out.println();
        }

        sc.close();
    }
}
