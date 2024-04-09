public class merge {
    public static void main(String[] args) {
        int[] vet = {11,2,1,9,8};
        
        for(int n : vet){
            System.out.print(n + " ");
        }
        System.out.println();

        mergeSort(vet);

        for(int m : vet){
            System.out.print(m + " ");
        }
    }

    public static void mergeSort(int [] v){
        int tam = v.length;
        if(tam <= 1){
            return;
        }
        int meio = tam / 2;
        int [] vetEsquerdo = new int[meio];
        int [] vetDireito = new int[tam - meio];

        int j=0;
        for(int i = 0; i<tam; i++){
            if(i<meio){
                vetEsquerdo[i] = v[i];
            }else{
                vetDireito[j] = v[i];
                j++;
            }
        }
        mergeSort(vetEsquerdo);
        mergeSort(vetDireito);
        merge(vetEsquerdo, vetDireito, v);
    }

    public static void merge(int [] vetEsquerda, int [] vetDireito, int [] v){
        int tamEsquerdo = v.length / 2;
        int tamDireito = v.length - tamEsquerdo;
        int i = 0;
        int e = 0;
        int d = 0;

        while(e<tamEsquerdo && d<tamDireito) {
            if(vetEsquerda[e] < vetDireito[d]){
                v[i] = vetEsquerda[e];
                i++;
                e++;
            } else{
                v[i] = vetDireito[d];
                i++;
                d++;
            }
    }
        while(e < tamEsquerdo){
            v[i] = vetEsquerda[e];
            i++;
            e++;
        }
        while(d < tamDireito){
            v[i] = vetDireito[d];
            i++;
            d++;
        }
}
}