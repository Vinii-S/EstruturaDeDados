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
