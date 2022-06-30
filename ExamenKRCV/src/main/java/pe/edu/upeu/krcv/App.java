package pe.edu.upeu.krcv;

import java.util.Scanner;

<<<<<<< HEAD
import pe.edu.upeu.krcv.Examen.ResolucionExamen;
=======
import pe.edu.upeu.krcv.Examen.ResolucionExamen3;
>>>>>>> 80aebd0de8885053c97409cfed77df99930cdf89

/**
 * Hello world!
 *
 */
public class App 
{
<<<<<<< HEAD
    
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
=======
    public static void main( String[] args ){
        Scanner lt=new Scanner(System.in);
        int n;
        System.out.println("Ingrese el numero de algoritmo(2-5):");
        n=lt.nextInt();
        switch (n){
            case 2:new ResolucionExamen()
>>>>>>> 80aebd0de8885053c97409cfed77df99930cdf89
        }
    }
}
