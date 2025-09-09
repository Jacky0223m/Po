package src;

import java.util.Scanner;

public class Ejercicio5 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer dimensiones
        System.out.print("Ingrese número de filas (N): ");
        int N = sc.nextInt();
        System.out.print("Ingrese número de columnas (M): ");
        int M = sc.nextInt();

        int[][] matriz = new int[N][M];

        // Llenar matriz
        System.out.println("\nIngrese los elementos de la matriz (solo 0 o 1):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean esRala = true;

        // Validar filas
        for (int i = 0; i < N; i++) {
            int contadorUnos = 0;
            for (int j = 0; j < M; j++) {
                if (matriz[i][j] == 1) {
                    contadorUnos++;
                } else if (matriz[i][j] != 0) { 
                    esRala = false; // si hay otro número diferente a 0 o 1
                }
            }
            if (contadorUnos != 1) {
                esRala = false;
                break;
            }
        }

        // Validar columnas
        for (int j = 0; j < M && esRala; j++) {
            int contadorUnos = 0;
            for (int i = 0; i < N; i++) {
                if (matriz[i][j] == 1) {
                    contadorUnos++;
                }
            }
            if (contadorUnos != 1) {
                esRala = false;
                break;
            }
        }

        // Resultado
        if (esRala) {
            System.out.println("\nLa matriz es RALA ");
        } else {
            System.out.println("\nLa matriz NO es rala ");
        }

        sc.close();
    }
}
