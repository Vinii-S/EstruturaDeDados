public class Lista {
    private Celula cabeca;
    private Celula cauda;
    private int total=0;


    public void  adicionarInicio(String nome){
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

    public void adicionarFim(String nome){
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

public void adicionarPosicao(int posicao, String nome) {
    if (posicao < 0 || posicao > total) {
       System.out.println("Posição inválida");
       return;
    }

    if (posicao == 0) {
        adicionarInicio(nome);
    } else if (posicao == total) {
        adicionarFim(nome);
    } else {
        Celula nova = new Celula(nome);
        Celula aux = cabeca;
        for (int i = 0; i < posicao - 1; i++) {
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

public void removerPosicao(int posicao) {
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

public void imprimir(){
    if (total==0) {
        System.out.println("SEM ELEMENTOS");
        return;
    }

    Celula aux = this.cabeca;
    System.out.println("----------");
    
     for(int i =0; i<total;i++){
        System.out.println(aux.getElemento());
        if (aux.getProxima()!=null) {
            aux = aux.getProxima();
        }else{
            break;
        }
        
    }
    
}
}
