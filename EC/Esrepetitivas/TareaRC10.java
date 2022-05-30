import java.util.Scanner;

/**
 * TareaRC10
 */
public class TareaRC10 {

    public static void main(String[] args) {
        int n=0;
        Scanner in=new Scanner(System.in);
        n = in.nextInt();
        //Triangulo rectangulos
        for (int i = 0; i < n; i++) {//Filas
            for (int j = 0; j <=i; j++) {//columnas
                System.out.print("* ");
         }
         System.out.println("");
          }
          System.out.println("-----------------------");
          for (int i = 0; i < n; i++) {//Filas
            for (int j = n-1-i; j >=0; j--) {//columnas
                System.out.print("* ");
                }
                System.out.println("");
                }
            }
        }