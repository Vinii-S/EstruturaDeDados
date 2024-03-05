package exercicio1;

import java.util.Arrays;

public class guardaNomes {
    
    public String[] Nomes(String nomes[]) { 
        Arrays.sort(nomes); // Ordenando os nomes em ordem alfabética
        System.out.println("Imprimindo Vetor em ordem alfabética: ");
        for (String s :  nomes) {
            System.out.print(s + " | ");
        }
        return nomes;
}
}
