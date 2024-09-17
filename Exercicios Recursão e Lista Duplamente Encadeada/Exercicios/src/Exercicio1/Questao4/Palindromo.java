package Questao4;

import java.util.Stack;

public class Palindromo {
    String nome;
    String invertido;
    Stack<Character> Pilha = new Stack<>();

    public Palindromo(String nome) {
        this.nome = nome;
        this.invertido="";
        this.iniciarPalindromo();
    }
    public void iniciarPalindromo(){
        for(int j =0; j<nome.length(); j++){
            Pilha.push(nome.charAt(j));
        }
    }

    public void isPalindromo(){
        while(!Pilha.isEmpty()){
            invertido += Pilha.pop();
        }
        if(this.nome.equalsIgnoreCase(invertido)){
            System.out.println("O nome é um palindromo");
        }else{
            System.out.println("O nome não é um palindromo");
        }
    }
    public static void main(String[] args) {
        Palindromo palindromo = new Palindromo("carro");
        palindromo.isPalindromo();
        
    }
}
