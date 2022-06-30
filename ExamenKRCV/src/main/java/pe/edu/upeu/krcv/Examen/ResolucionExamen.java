package pe.edu.upeu.krcv.Examen;

import java.util.Scanner;

/**
 * ResolucionExamen
 */
public class ResolucionExamen {
    static Scanner leer = new Scanner(System.in);

    public void ExamenKRC02() {
        int i, n = 3;
        double cate1, cate2, cate3, clave, costo;
        double impuesto, impuestopagar;
        cate1 = 0;
        cate2 = 0;
        cate3 = 0;
        impuestopagar = 0;
        System.out.print("Ingresa el numero de autos: ");
        n = leer.nextInt();
        leer.nextLine();
        for (i = 1; i <= n; i++) {
            System.out.print("PROCESO " + i);

            System.out.print("   Ingresa la categoria 1-2-3 : ");

        }
    }

 public void ExamenKRC03() {
    int papu;
    System.out.print("insertar altura X:");
    papu = leer.nextInt();
    for (int i = 1; i <= papu; i++) {
        for (int j = 1; j <= papu; j++) {
            if (i == j || i + j == papu; + 1)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();

    }
}

    public void ExamenKRC04() {
        int i, j, cantidad, sec = 0;
        System.out.println("cuantos numeros perfectos desea imprimir: ");
        int impri = leer.nextInt();
        System.out.println("estos son: ");
        for (i = 1; i > 0; i++) {

            cantidad = 0;
            for (j = 1; j < i; j++) {
                if (i % j == 0) {
                    cantidad = cantidad + j;
                }
            }
            if (i == cantidad) {

                sec++;
                if (sec <= impri) {
                    System.out.println(i);
                } else {
                    break;
                }
            }
        }
    }

    public void ExamenKRC05() {
        int k;
        do {
            System.out.print("ingrese un numero: ");
            k = leer.nextInt();
        } while (k < 0);
        System.out.println();
        System.out.print(" a binario: ");
        convertir(k);
        System.out.println();
    }

    public static void convertir(int k) {
        if (k < 2) {
            System.out.print(k);
            return;
        } else {
            convertir(k / 2);
            System.out.print(k % 2);
            return;
        }
    }
}
