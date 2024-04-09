import java.util.Scanner;
public class selection {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tam = 4;
        int[] vet =  new int [tam];

        for(int l = 0; l<tam; l++){
            System.out.println("Digite os valores: ");
            vet[l] = input.nextInt();
        }
        System.out.println("Valores Digitados: ");
        for(int k = 0; k<vet.length ; k++){  
            System.out.print(vet[k] + " ");
        }
        
        ordenaVetor(vet);
        
        //IMPRIMINDO ORDENADO
        System.out.println("\nValores em Ordem Crescente: " );
        for(int m = 0; m<tam   ; m++){
            System.out.print(vet[m] + " ");
        }

        input.close();
}

    //ORDENAR VETOR
    public static int[] ordenaVetor(int [] v){
        int aux;
        for(int contA = 0; contA<v.length  ; contA++){
            for(int contB = contA + 1; contB<v.length  ; contB++){
                if(v[contA]>v[contB]){
                    aux = v[contB];
                    v[contB] = v[contA];
                    v[contA] = aux;
            }
        }
    }
        return v;
        
    }
}