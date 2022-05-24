package EC.Esrepetitivas.subprogramas;
//import subprogramas.*;
public class clasegeneral {

    public static void main(String[] args) {
        aritmetica a=new aritmetica();
        int resultado=a.sumar(5, 3);
        System.out.println(resultado);
        aritmetica obj=new aritmetica(5,5);
        resultado=obj.multiplicar();
        System.out.println("multiplicacion:"+resultado);
    }
}
