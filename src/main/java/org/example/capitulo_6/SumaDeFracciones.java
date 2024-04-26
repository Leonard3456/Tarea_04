package org.example.capitulo_6;

import java.util.Scanner;

public class SumaDeFracciones {

    public void sumafracciones() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese cantidad de fracciones a sumar: ");
        int nro = scanner.nextInt();

        int nr = 0; // Numerador total
        int dr = 1; // Denominador total

        for (int i = 1; i <= nro; i++) {
            System.out.println("** Fracción número " + i);
            System.out.print("Numerador  : ");
            int n = scanner.nextInt();
            System.out.print("Denominador: ");
            int d = scanner.nextInt();

            if (i == 1) {
                nr = n;
                dr = d;
            } else {
                nr = d * nr + n * dr;
                dr = d * dr;
            }
        }

        // Simplifica la fracción nr/dr
        int i = 2;
        while (i <= nr && i <= dr) {
            if (nr % i == 0 && dr % i == 0) {
                nr = nr / i;
                dr = dr / i;
            }
            i++;
        }

        System.out.println("La suma de las fracciones es: " + nr + "/" + dr);

        scanner.close();
    }
}
