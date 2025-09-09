package src;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer dimensiones
        System.out.print("Ingrese número de filas (A): ");
        int A = sc.nextInt();
        System.out.print("Ingrese número de columnas (B): ");
        int B = sc.nextInt();

        int[][] matriz = new int[A][B];
        int[][] transpuesta = new int[B][A];

        // Llenar matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Calcular transpuesta
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar matriz original
        System.out.println("\nMatriz original:");
        for (int i = 0; i < A; i++) {
            for (int j = 0; j < B; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Mostrar transpuesta
        System.out.println("\nMatriz transpuesta:");
        for (int i = 0; i < B; i++) {
            for (int j = 0; j < A; j++) {
                System.out.print(transpuesta[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
