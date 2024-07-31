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

    public void imprimir(){
        celula aux = this.cabeca;
        for(int i =0; i<total;i++){
            System.out.println();
            System.out.println(aux.getElemento());
            aux = aux.proxima;
        }
    }

}
