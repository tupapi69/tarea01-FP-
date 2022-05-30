/**
 * TareaRC2
 */
public class TareaRC2 {

    public static void main(String[] args) {
		int numero = 345;
		int contador = 0;
		do {
			numero /= 10;
			System.out.println(numero);
			contador++;
		} while (numero != 0);
		System.out.println("El número tiene " + contador + " dígitos");
	}
}