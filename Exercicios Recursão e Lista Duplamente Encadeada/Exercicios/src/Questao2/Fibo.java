package Questao2;

public class Fibo {

    public static int seqFibo(int valor){
        if(valor<2){
            return 1;
        }else{
            return  seqFibo(valor -1) + seqFibo(valor-2);
        }
    }

    public static void main(String[] args) {
        Fibo fibonacci = new Fibo();
        for(int i = 0; i<12 ; i++){
            System.out.print(fibonacci.seqFibo(i) + " ");
        }
        

    }
}
