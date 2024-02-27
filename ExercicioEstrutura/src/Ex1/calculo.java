package Ex1;
import java.util.Scanner;
public class calculo {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in) ;
        System.out.println("Informe um numero: ");
        int numero = number.nextInt();
        System.out.println();
       Tabu t1 = new Tabu();
       t1.Tabuada(numero);
       number.close();
    }
}
