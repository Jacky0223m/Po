package src;

import java.util.Scanner;

public class Ejercicio10 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer número de estudiantes
        System.out.print("Ingrese el número de estudiantes (M): ");
        int M = sc.nextInt();
        int materias = 6;

        double[][] notas = new double[M][materias];

        // Llenar matriz de notas
        System.out.println("\nIngrese las notas de cada estudiante (6 materias):");
        for (int i = 0; i < M; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < materias; j++) {
                System.out.print("  Nota de materia " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        // a) Nota promedio de cada estudiante
        System.out.println("\nPromedio por estudiante:");
        for (int i = 0; i < M; i++) {
            double suma = 0;
            for (int j = 0; j < materias; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / materias;
            System.out.println("Estudiante " + (i + 1) + ": " + promedio);
        }

        // b) Número de estudiantes que aprobaron cada materia
        System.out.println("\nNúmero de aprobados por materia:");
        for (int j = 0; j < materias; j++) {
            int aprobados = 0;
            for (int i = 0; i < M; i++) {
                if (notas[i][j] >= 3.0) aprobados++;
            }
            System.out.println("Materia " + (j + 1) + ": " + aprobados);
        }

        // c) Número de estudiantes que reprobaron cada materia
        System.out.println("\nNúmero de reprobados por materia:");
        for (int j = 0; j < materias; j++) {
            int reprobados = 0;
            for (int i = 0; i < M; i++) {
                if (notas[i][j] < 3.0) reprobados++;
            }
            System.out.println("Materia " + (j + 1) + ": " + reprobados);
        }

        // d) Nota promedio de cada materia
        System.out.println("\nPromedio por materia:");
        for (int j = 0; j < materias; j++) {
            double suma = 0;
            for (int i = 0; i < M; i++) {
                suma += notas[i][j];
            }
            double promedio = suma / M;
            System.out.println("Materia " + (j + 1) + ": " + promedio);
        }

        sc.close();
    }
}
