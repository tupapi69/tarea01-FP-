import java.util.Scanner;

public class ejercicio2
  {
    public static void main(String[] args)
    {
      Scanner deentrada = new Scanner(System.in);

      int horas;
      double precio;
      double sueldo;

      System.out.println("cuantas horas laboro durante el mes");
      horas=deentrada.nextInt();
      System.out.println("cual es el precio por hora trabajada ");
      precio=deentrada.nextDouble();
if (horas>40) {
  sueldo=40*precio+2*((horas-40))*precio; }
     else { sueldo=horas*precio; }

      System.out.println("El sueldo del trabajador es:"+" "+sueldo);
     }
     }