package src;

import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int PAGO_NORMAL = 2350;
        final int PAGO_EXTRA = 3500;

        // Leer número de empleados
        System.out.print("Ingrese el número de empleados: ");
        int N = sc.nextInt();

        int[] codigos = new int[N];
        int[] horasNormales = new int[N];
        int[] horasExtras = new int[N];

        // Leer datos de empleados
        for (int i = 0; i < N; i++) {
            System.out.println("\nEmpleado " + (i + 1) + ":");
            do {
                System.out.print("  Código (1-100): ");
                codigos[i] = sc.nextInt();
            } while (codigos[i] < 1 || codigos[i] > 100);

            System.out.print("  Horas normales: ");
            horasNormales[i] = sc.nextInt();

            System.out.print("  Horas extra: ");
            horasExtras[i] = sc.nextInt();
        }

        // Mostrar reporte
        System.out.println("\n--- INFORME DE EMPLEADOS ---");
        for (int i = 0; i < N; i++) {
            int pagoNormales = horasNormales[i] * PAGO_NORMAL;
            int pagoExtras = horasExtras[i] * PAGO_EXTRA;
            int total = pagoNormales + pagoExtras;

            System.out.println("\nEmpleado código: " + codigos[i]);
            System.out.println("  Horas normales: " + horasNormales[i] + " → $" + pagoNormales);
            System.out.println("  Horas extra: " + horasExtras[i] + "  $" + pagoExtras);
            System.out.println("  Total a pagar: $" + total);
        }

        sc.close();
    }
}
