package Questao1.Lista;

import java.util.Scanner;

import Questao1.Básica.Contato;

public class Lista {
    private Celula cabeca;
    private Celula cauda;
    private int total=0;


    public void  adicionarInicio(Contato nome){
        if(this.total==0){
            Celula nova = new Celula(nome);
            this.cabeca = nova;
            this.cauda = nova;
        }else{
            Celula nova = new Celula(this.cabeca,nome);
            this.cabeca.setAnterior(nova);
            this.cabeca = nova;
        }
        total++;
    }

    public void adicionarFim(Contato nome){
        if(this.total==0){
            adicionarInicio(nome);
    }else{
        Celula nova = new Celula(nome);
        this.cauda.setProxima(nova);
        nova.setAnterior(this.cauda);
        this.cauda = nova;
    }
    total++;
}

    public void adicionarPosicao() {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o nome desse novo contato");
        String novoNome = input.nextLine();
        System.out.println("Informe o endereço desse novo contato");
        String novoEndereco = input.nextLine();
        System.out.println("Informe o telefone desse novo contato");
        String novoTelefone = input.nextLine();
        Contato novoCont = new Contato(novoNome,novoEndereco,novoTelefone);
        System.out.println("Digite a posição que deseja adicionar: ");
        int pos = input.nextInt();
    if (pos < 0 || pos > total) {
       System.out.println("Posição inválida");
       return;
    }

    if (pos == 0) {
        adicionarInicio(novoCont);
    } else if (pos == total) {
        adicionarFim(novoCont);
    } else {
        Celula nova = new Celula(novoCont);
        Celula aux = cabeca;
        for (int i = 0; i < pos - 1; i++) {
            aux = aux.getProxima();
        }
        nova.setProxima(aux.getProxima());
        nova.setAnterior(aux);
        aux.getProxima().setAnterior(nova);
        aux.setProxima(nova);
        total++;
    }
}

    public void removerInicio(){
    if(total == 0){
        System.out.println("Sem elmentos para remover");
        return;
    }
    if(total == 1){
        cauda=null;
    }

    cabeca = cabeca.getProxima();
    cabeca.setAnterior(null);
    total--;


}

    public void removerFinal(){
    if(total == 0){
        System.out.println("Sem elementos para remover");
        return;
    }
    cauda = cauda.getAnterior();
    cauda.setProxima(null);

    total--;
}

    public void removerPosicao() {
    Scanner input = new Scanner(System.in);
    System.out.println("Informe a posição que deseja remover");
    int posicao = input.nextInt();
    if (posicao < 0 || posicao >= total) {
        System.out.println("Posição inválida");
    }
    if (posicao == 0) {
        cabeca = cabeca.getProxima();
        cabeca.setAnterior(null);
        if (total == 1) {
            cauda = null;
        }
    }

    else if (posicao == total) {
        removerFinal();
    } else {
        Celula aux = cabeca;
        for (int i = 0; i < posicao - 1; i++) {
            aux = aux.getProxima();
        }
        aux.setProxima(aux.getProxima().getProxima());
        aux.getProxima().setAnterior(aux);
    }
    total--;
}

    public void pesquisarNome(){
    Scanner input = new Scanner(System.in);
    System.out.println("Digite o nome que deseja procurar: ");
    String nome = input.nextLine();
    Celula aux = this.cabeca;
    Boolean achou = false;
    for(int j=0; j<=total;j++){
        if(aux!= null && nome.equalsIgnoreCase(aux.getElemento().getNome())){
            System.out.println("Nome encontrado");
            System.out.println(aux.getElemento().toString());
            achou = true;
            break;
        }else if(aux != null){
            aux = aux.getProxima();
        }
    }
    if(!achou){
        System.out.println("Nome não encontrado");
    }
    
}
    public void imprimir(){
    if (total==0) {
        System.out.println("SEM ELEMENTOS");
        return;
    }

    Celula aux = this.cabeca;
    System.out.println("----------");
    
     for(int i =0; i<total;i++){
        
        System.out.println(aux.getElemento().toString());
        if (aux.getProxima()!=null) {
            aux = aux.getProxima();
        }else{
            break;
        }
        
    }
    
}
}
