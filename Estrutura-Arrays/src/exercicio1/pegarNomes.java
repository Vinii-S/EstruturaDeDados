package exercicio1;

import java.util.Scanner;

public class pegarNomes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomes[] = new String[10];
        
        for(int i =0; i<nomes.length;i++){
            System.out.println("Digite um nome: ");
            nomes[i] = input.nextLine();
    }
    guardaNomes n = new guardaNomes();
    n.Nomes(nomes);//
    System.out.println();
    input.close();
}
}
