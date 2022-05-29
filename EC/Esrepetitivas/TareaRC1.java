import java.util.Scanner;

/**
 * TareaRC1
 */
public class TareaRC1 {

    public static void main(String[] args) {
        int n=0;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        for (int i = 0; i < n; i++) {//Filas
            for (int j = 0; j < n; j++) {//columnas
                System.out.print("*");
         }
         System.out.println("");
    }
}
}