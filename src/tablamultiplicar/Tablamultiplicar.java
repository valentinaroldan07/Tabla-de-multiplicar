
package tablamultiplicar;

public class Tablamultiplicar {

    public static void main(String[] args) {
        int numero = 10;
        int total = 0;
        for (int i = 1; i <= 10; i++) {
             total = numero * i;
             System.out.println(numero + "*" + i + "=" + total);
        }
        
    }
    
}
