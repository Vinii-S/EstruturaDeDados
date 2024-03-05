package exercicio2;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeros[] = new int[10];
        System.out.println("Informe dez numeros: ");
        for(int i = 0; i<numeros.length;i++){
            numeros[i] = input.nextInt();
        }
        SomaNum s = new SomaNum();
        s.numeros(numeros);
        input.close();
    }
}
