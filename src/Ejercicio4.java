package src;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, M;

        // Validar dimensiones
        do {
            System.out.print("Ingrese número de filas (N > 0): ");
            N = sc.nextInt();
        } while (N <= 0);

        do {
            System.out.print("Ingrese número de columnas (M > 0): ");
            M = sc.nextInt();
        } while (M <= 0);

        int[][] matriz = new int[N][M];

        // Llenar matriz
        System.out.println("\nIngrese los elementos de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // a) Es cuadrada?
        if (N == M) {
            System.out.println("\nLa matriz es cuadrada.");
        } else {
            System.out.println("\nLa matriz no es cuadrada.");
        }

        // b) Promedio total
        int sumaTotal = 0;
        int totalElementos = N * M;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sumaTotal += matriz[i][j];
            }
        }
        double promedioTotal = (double) sumaTotal / totalElementos;
        System.out.println("Promedio total de la matriz: " + promedioTotal);

        // c) Promedio por fila
        System.out.println("\nPromedio por fila:");
        for (int i = 0; i < N; i++) {
            int sumaFila = 0;
            for (int j = 0; j < M; j++) {
                sumaFila += matriz[i][j];
            }
            double promedioFila = (double) sumaFila / M;
            System.out.println("Fila " + i + ": " + promedioFila);
        }

        // d) Promedio por columna
        System.out.println("\nPromedio por columna:");
        for (int j = 0; j < M; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < N; i++) {
                sumaColumna += matriz[i][j];
            }
            double promedioColumna = (double) sumaColumna / N;
            System.out.println("Columna " + j + ": " + promedioColumna);
        }

        sc.close();
    }
}
