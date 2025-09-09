package src;

import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer número de sucursales
        System.out.print("Ingrese el número de sucursales (N): ");
        int N = sc.nextInt();

        int[][] ventas = new int[N][12];

        // Llenar matriz de ventas
        System.out.println("\nIngrese las ventas de cada sucursal por mes:");
        for (int i = 0; i < N; i++) {
            System.out.println("Sucursal " + (i + 1) + ":");
            for (int j = 0; j < 12; j++) {
                System.out.print(" Mes " + (j + 1) + ": ");
                ventas[i][j] = sc.nextInt();
            }
        }

        // a) Total de ventas de la compañía
        int totalVentas = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 12; j++) {
                totalVentas += ventas[i][j];
            }
        }
        System.out.println("\nTotal de ventas de la compañía: " + totalVentas);

        // b) Total de ventas por sucursal
        int[] totalSucursal = new int[N];
        for (int i = 0; i < N; i++) {
            int sumaSucursal = 0;
            for (int j = 0; j < 12; j++) {
                sumaSucursal += ventas[i][j];
            }
            totalSucursal[i] = sumaSucursal;
            System.out.println("Total de ventas sucursal " + (i + 1) + ": " + sumaSucursal);
        }

        // c) Sucursal que más vendió
        int maxSucursal = 0;
        int sucursalMax = 0;
        for (int i = 0; i < N; i++) {
            if (totalSucursal[i] > maxSucursal) {
                maxSucursal = totalSucursal[i];
                sucursalMax = i;
            }
        }
        System.out.println("\nLa sucursal que más vendió fue la " + (sucursalMax + 1) + " con " + maxSucursal);

        // d) Mes que menos vendió la compañía
        int[] totalMes = new int[12];
        for (int j = 0; j < 12; j++) {
            int sumaMes = 0;
            for (int i = 0; i < N; i++) {
                sumaMes += ventas[i][j];
            }
            totalMes[j] = sumaMes;
        }

        int minMes = totalMes[0];
        int mesMin = 0;
        for (int j = 1; j < 12; j++) {
            if (totalMes[j] < minMes) {
                minMes = totalMes[j];
                mesMin = j;
            }
        }
        System.out.println("El mes que menos vendió la compañía fue el mes " + (mesMin + 1) + " con " + minMes);

        sc.close();
    }
}
