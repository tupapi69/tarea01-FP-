package pe.edu.upeu.krcv.Examen;

public class ResolucionExamen05 {
    int x;
    Scanner sistemadecimal = new Scanner(System.in);
    

    {
        System.out.print("Introduzca un numero: ");
        n = leer.nextInt();
    } while (n < 0);
    System.out.println();
    System.out.print(" a binario: ");
    decBin(n);
    System.out.println();
} public static void decBin(int n) {
    if (n < 2) {
        System.out.print(n);
        return;
    } else {
        decBin(n / 2);
        System.out.print(n % 2);
        return;
    }
}
