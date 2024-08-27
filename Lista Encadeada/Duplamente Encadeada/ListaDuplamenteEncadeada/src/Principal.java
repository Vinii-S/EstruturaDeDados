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
        System.out.println("Digite a posição  e o que deseja inserir: ");
        primeira.adicionarPosicao(input.nextInt(), input.nextLine());
        primeira.imprimir();


       
        primeira.removerFinal();
        primeira.imprimir();

        primeira.removerInicio();
        primeira.imprimir();

        System.out.println("Digite a posição para remover:");
        primeira.removerPosicao(input.nextInt());
        primeira.imprimir();        
        
    }
}