public class lista {
    private celula cabeca;
    private celula cauda;
    private int total=0;

    public void adicionarcomeco(String nome){
        celula nova = new celula(this.cabeca,nome);
        this.cabeca = nova;

        if(this.total==0){
            this.cauda = nova;
        }
        this.total++;
    }

    public void adicionarfim(String nome){
        celula nova = new celula(nome);
        if(this.total==0){
            this.cabeca = nova;
            this.cauda = nova;
        }else{
            this.cauda.setProxima(nova);
            this.cauda=nova;
        }
        this.total++;
    }

    public void adicionarPosicao(int posicao, String nome) {
        if (posicao < 0 || posicao > total) {
           System.out.println("Posição inválida");
        }
    
        if (posicao == 0) {
            adicionarcomeco(nome);
        } else if (posicao == total) {
            adicionarfim(nome);
        } else {
            celula nova = new celula(nome);
            celula aux = cabeca;
            for (int i = 0; i < posicao - 1; i++) {
                aux = aux.proxima;
            }
            nova.setProxima(aux.proxima);
            aux.setProxima(nova);
            total++;
        }
    }

    public void removerPosicao(int posicao) {
        if (posicao < 0 || posicao >= total) {
            System.out.println("Posição inválida");
        }
    
        if (posicao == 0) {
            cabeca = cabeca.proxima;
            if (total == 1) {
                cauda = null;
            }
        } else if (posicao == total - 1) {
            celula aux = cabeca;
            for (int i = 0; i < posicao - 1; i++) {
                aux = aux.proxima;
            }
            aux.setProxima(null);
            cauda = aux;
        } else {
            celula aux = cabeca;
            for (int i = 0; i < posicao - 1; i++) {
                aux = aux.proxima;
            }
            aux.setProxima(aux.proxima.proxima);
        }
        total--;
    }
    
    public void imprimir(){
        celula aux = this.cabeca;
        for(int i =0; i<total;i++){
            System.out.println();
            System.out.println(aux.getElemento());
            aux = aux.proxima;
        }
    }

}
