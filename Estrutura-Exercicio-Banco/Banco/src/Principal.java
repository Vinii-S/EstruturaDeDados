import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Renato", 23841.45);
        Conta conta2 = new Conta("Julio Balestrin", 2213123.32);
        Conta conta3 = new Conta("Leo Estronda", 12312.12);

        Scanner input = new Scanner(System.in);
        String busca="";
        
        CadastrarConta cad = new CadastrarConta();
        cad.adicionarConta(conta1);
        cad.adicionarConta(conta2);
        cad.adicionarConta(conta3);

        System.out.println("Informe o nome da conta que deseja saber: ");
        busca=input.nextLine();
        cad.procurarConta(busca);
       // cad.listarConta();
    }
}
