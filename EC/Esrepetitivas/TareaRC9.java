import java.util.Scanner;

/**
 * TareaRC9
 */
public class TareaRC9 {

    public static void main(String[] args) {
        int n=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        //Triangulo
        for (int i = 0; i < n; i++) {//Filas
            for (int j = 0; j < i; j++) {//columnas
                System.out.print("*");
         }
         System.out.println("");
    }
}
}