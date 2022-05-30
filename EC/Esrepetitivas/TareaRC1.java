import java.util.Scanner;

/**
 * TareaRC1
 */
public class TareaRC1 {

    public static void main(String[] args) {
		int numero;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un número:");

		try {
			numero = entrada.nextInt();
			while ((numero % 10) != 0) {
				numero++;
			}
			System.out.println("La decena superior es: " + numero);
		} catch (Exception e) {
			System.out.println("Número no válido");
		}
	}
}
