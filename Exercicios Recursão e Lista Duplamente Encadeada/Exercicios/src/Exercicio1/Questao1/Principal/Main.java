package Questao1.Principal;

import java.util.Scanner;

import Questao1.Básica.Contato;
import Questao1.Lista.Lista;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Contato c1 = new Contato("Jorge Santos", "Rua das Flores 192", "(75)99988-1212");
        Contato c2 = new Contato("Tiao grandao", "Rua das Dores 111", "(75)99233-1214");
        Contato c3 = new Contato("Salvador Dela", "Rua da Harmonia 99", "(75)99888-6868");
        Contato c4 = new Contato("Tiana Dantas", "Rua da Pedra 222", "(75)9911-5656");
        Contato c5 = new Contato("Joao Fortao", "Rua da Água 344", "(75)99555-8787");
        Contato c6 = new Contato("Sabrina Jogadora", "Rua do Fogo 999", "(75)99666-6665");

        lista.adicionarFim(c1);
        lista.adicionarFim(c2);
        lista.adicionarFim(c3);
        lista.imprimir();


        lista.adicionarInicio(c4);
        lista.adicionarInicio(c5);
        lista.adicionarInicio(c6);
        lista.imprimir();

        lista.removerFinal();
        lista.removerInicio();
        lista.imprimir();

        lista.adicionarPosicao();
        lista.imprimir();

        lista.removerPosicao();
        lista.imprimir();
        
        lista.pesquisarNome();
    }

    
}
