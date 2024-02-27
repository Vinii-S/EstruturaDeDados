package Ex4;

public class SomaImp {

    private int num=0;
    private int soma=0;
    private int somaIm=0;

public void SomaImpar(){
    while(num<30){
        soma = num + 1;
        if(soma%2==1){
            somaIm=somaIm+soma;
        }
        num++;  
}
System.out.println("A soma de todos os números impares entre 0 e 30 é: " + somaIm);  
}

}

