import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Lista primeira = new Lista();

        Scanner input = new Scanner(System.in);

        primeira.adicionarFim(input.nextLine());
        primeira.adicionarFim(input.nextLine());
        primeira.adicionarFim(input.nextLine());
        primeira.imprimir();
        System.out.println("----------");

        primeira.adicionarInicio(input.nextLine());
        primeira.adicionarInicio(input.nextLine());
        primeira.adicionarInicio(input.nextLine());

        primeira.imprimir();
        
    }
}