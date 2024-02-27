package Ex8;
import java.util.Scanner;
public class Produto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o preço de custo do produto: ");
        double custos = input.nextDouble();
        
        System.out.println("Informe o preço de venda do produto: ");
        double vendas = input.nextDouble();

        CalculaLucro Ca = new CalculaLucro();

        Ca.teveLucro(custos, vendas);
        input.close();
    }
}
