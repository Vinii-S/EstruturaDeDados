package Ex3;

public class Fibo {
    private int n1=0;
    private int n2=1;

    public void  Fibonacci(){
        int n=n1;
        int resultado=0;
       
        while(n<=100){
            System.out.println(n);
            resultado = n + (n=n2);
            n2=resultado;
        }
        System.out.println(n);
}
}