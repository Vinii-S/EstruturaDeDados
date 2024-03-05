package exercicio2;

public class SomaNum {
    
    public int numeros(int num[]){
        int soma = 0;
        for(int i =0; i<num.length;i++){
            soma += num[i];
    }
    System.out.println("Soma dos numeros informados: "+ soma);
        return soma;
}
}
