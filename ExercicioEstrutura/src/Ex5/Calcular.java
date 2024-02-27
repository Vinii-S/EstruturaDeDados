package Ex5;

public class Calcular {
    private int numP;
    private int numI;
    public int imparOuPar(int n){
        if(n%2==0){
            numP=n;
            System.out.println(numP + " é um número par");
        }else{
            numI=n;
            System.out.println(numI + " é um número impar");
        }
        return n;
    }

    public boolean ehPrimo(int n){
        if(n<=1){
            System.out.println(n + " não é um número primo");
        }
        if(n==2){
            System.out.println(n + " é um número primo");
        }
        if(n==3){
            System.out.println(n + " é um número primo");
        }
        
        for(int i=2;i<=n/2;i++){
            if(n % i == 0) {
                System.out.println(n + " é um número composto");
                break;
        }else{
            System.out.println(n + " é um número primo");
            break;
        }
    }
        return false;
    
}
}