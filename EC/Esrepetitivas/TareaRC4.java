import java.util.Scanner;

/**
 * TareaRC4
 */
public class TareaRC4 {
    public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int numFilas = teclado.nextInt();
        int numBlancos = 0;
        teclado.close();
        System.out.println();
         
        for(int i=numFilas; i>0; i--){
             
            // Asteriscos
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             
            // Blancos
            for (int j=1; j<=numBlancos; j++) {
                System.out.print(" ");
            }
 
            // Asteriscos
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
             
            System.out.println();
            numBlancos += 2;
        }
         
    }
     
}