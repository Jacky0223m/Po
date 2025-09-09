package src;
import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.print("Ingrese el tamaño de la matriz cuadrada (P): ");
          int P = sc.nextInt();

          int[][] matriz = new int[P][P];

          // Llenar la matriz
          System.out.println("Ingrese los elementos de la matriz:");
          for (int i = 0; i < P; i++) {
              for (int j = 0; j < P; j++) {
                  System.out.print("Elemento [" + i + "][" + j + "]: ");
                  matriz[i][j] = sc.nextInt();
              }
          }

          // Diagonal principal
          System.out.print("\nDiagonal principal: ");
          for (int i = 0; i < P; i++) {
              System.out.print(matriz[i][i] + " ");
          }

          // Diagonal secundaria
          System.out.print("\nDiagonal secundaria: ");
          for (int i = 0; i < P; i++) {
              System.out.print(matriz[i][P - 1 - i] + " ");
          }

          // Triangular superior
          System.out.print("\nMatriz triangular superior: ");
          for (int i = 0; i < P; i++) {
              for (int j = i + 1; j < P; j++) {
                  System.out.print(matriz[i][j] + " ");
              }
          }

          // Triangular inferior
          System.out.print("\nMatriz triangular inferior: ");
          for (int i = 1; i < P; i++) {
              for (int j = 0; j < i; j++) {
                  System.out.print(matriz[i][j] + " ");
              }
          }

          sc.close();
        }
    }
}
