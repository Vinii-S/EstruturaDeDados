import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    lista primeira = new lista();

    Scanner input = new Scanner(System.in);
    
        primeira.adicionarfim(input.nextLine());
        primeira.adicionarfim(input.nextLine());
        primeira.adicionarfim(input.nextLine());
       
        /* 
        primeira.adicionarcomeco(input.nextLine());
        primeira.adicionarcomeco(input.nextLine());
        primeira.adicionarcomeco(input.nextLine());
        */


        primeira.imprimir();

        System.out.println("Digite a posição que deseja adicionar: ");
        primeira.adicionarPosicao(input.nextInt(), input.nextLine());
        primeira.imprimir();

        /* 
        System.out.println("Digite a posição que deseja remover: ");
        primeira.removerPosicao(input.nextInt());
        primeira.imprimir();
        */

        //primeira.removerInicio();
        primeira.removerFinal();
        primeira.imprimir();
            
    }
}
