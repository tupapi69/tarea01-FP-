package EC.Esrepetitivas.subprogramas;

/**
 * aritmetica
 */
public class aritmetica {
    int va, vb;
    aritmetica(){
    }
    aritmetica(int va, int vb) { 
        this.va=va;
        this.vb=vb;
         }

        public int sumar(int a, int b) {
            return a+b;
            
        }
        public int multiplicar(){
            return (va*vb);
        }

}