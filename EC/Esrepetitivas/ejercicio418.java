package Esrepetitivas;

import java.util.Scanner;

/**
 * ejercicio418
 */
public class ejercicio418 {

    static Scanner it=new Scanner(System.in);
    public static void ImpuestodeVehiculo418() { 
        //Definir variables
        String catev="";
        int cantidad=0;
        double costV=0, impUnit=0, impTotal=0, totalImpV=0;
        //Datos de Entrada y proceso y Salida
        for (int i = 0; i < 3; i++) { 
            System.out.println("Ingrese Cantidad Vehiculos de Categoria "+(i+1)+":");
            cantidad=it.nextInt();
            System.out.println("Ingrese el precio de la categoria"+(i+1)+"i");
            costV=it.nextDouble();
            if(i==1){ 
                impUnit=costV*0.10;
            }else if(i==2){ 
                impUnit=costV*0.07;
            }else{ 
                impUnit=costV*0.05;
            }
                impTotal=impUnit*cantidad;
                System.out.println("Impuesto de Categoria"+(i+1)+"es:"+impUnit);
                System.out.println("Impuesto total de categoria"+(i+1)+"es:"+impTotal);
                totalImpV=totalImpV+impTotal;
        }
        System.out.println("Impuesto Total de los Vehiculos es:"+totalImpV);    
}

public static void main(String[]args) {
    ImpuestodeVehiculo418();
    
}
}