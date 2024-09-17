package Exercicio2.Decimal;

import java.util.Stack;

public class ConverterDecimal {
   public static String converterDec(int numero){
    Stack<Integer> pilha = new Stack<Integer>();
    if(numero == 0){
        return "";
    }
    int resto = numero %2;
    pilha.push(resto);
    return converterDec(numero/2) + pilha.pop();
   }

    public static void main(String[] args) {
       System.out.println(converterDec(10));
       
    }
}
