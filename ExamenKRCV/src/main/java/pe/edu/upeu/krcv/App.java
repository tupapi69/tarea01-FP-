package pe.edu.upeu.krcv;

import java.util.Scanner;

import pe.edu.upeu.krcv.Examen.ResolucionExamen;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args ){
        Scanner leer=new Scanner(System.in);
        int z;
        System.out.println("Ingrese el numero de ejercicio(2-5):");
        z=leer.nextInt();
        switch (z) {
            case 2: new ResolucionExamen().ExamenKRC02(); break;
            case 3: new ResolucionExamen().ExamenKRC03(); break;
            case 4: new ResolucionExamen().ExamenKRC04(); break;
            case 5: new ResolucionExamen().ExamenKRC05(); break;
            default: System.err.println("ejercicio no valido"); break;
        }
    }
}
