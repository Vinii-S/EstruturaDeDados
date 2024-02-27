package Ex5;
import java.util.Scanner;

public class Resultado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = input.nextInt();

        Calcular C = new Calcular();
        C.imparOuPar(num);
        C.ehPrimo(num);
        input.close();
    }
}
