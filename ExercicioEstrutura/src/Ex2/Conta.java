package Ex2;
import java.util.Scanner;
public class Conta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe dois numeros: ");
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        input.nextLine();
        
        System.out.println("Informe qual operação deseja: + - * ou /");
        String Opera =  input.nextLine();

        Operacao  op = new Operacao();
        op.contaOperacao(numero1,numero2,Opera);
        
        input.close();
    }
}
