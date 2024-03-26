public class CadastrarConta {
    int capacidade = 3;
    private Conta[] c = new Conta[capacidade];
    int cont = 0;

    public void adicionarConta(Conta com){
        aumentaVetor();
        if(cont<c.length){
            c[cont] =  com;
           // cont++;
        }
        if(cont==c.length){
           
            c[cont] = com;
            //cont++;
        }
        cont++;
    }
        
    public void listarConta(){
        System.out.println("Listando todas as contas: ");
        
        for (int i = 0; i < c.length; i++) {
            if(c[i] != null){
            System.out.println("Nome do titular: " + c[i].getNome());
            System.out.println("Saldo na conta: " + c[i].getValor());
            System.out.println();
        }
    }
}
    

    public void procurarConta(String procura){
       String respN = "";
       Double respV = 0.0;
       boolean achou = false;
        for (int i = 0; i<c.length; i++) {
           if(c[i].getNome().equalsIgnoreCase(procura)){
            respN = c[i].getNome();
            respV = c[i].getValor();
            achou = true;
            System.out.println("Imprimindo dados da conta:");
            System.out.println(respN);
            System.out.println("Saldo: R$" + respV);
           }                   
        }
        if (achou==false) {
            System.out.println("A conta nao foi encontrada");
           } 
        
    }
    public void inserirPosicao(int posi, Conta contaNova){
        aumentaVetor();
        if(posi<0 || posi>capacidade){
            System.out.println("Posição invalida");
            return;
        }
        Conta[] novaC = new Conta[capacidade+1];
        for(int j =0; j<posi; j++){
            novaC[j] = c[j];
        }   
        novaC[posi] = contaNova;
        
        for(int i=posi;i<capacidade;i++){
            novaC[i+1] = c[i];
        }
        
        c = novaC;
        capacidade++;
        
        
    }

    public void removerPosicao(int posi){

        for(int i = posi;i<capacidade-1;i++){
        c[i] = c[i+1];
        }
        c[capacidade -1] = null;
        capacidade--;
        
    }

    public void aumentaVetor(){
        capacidade *= 2;
        
        Conta [] novVetor = new Conta[capacidade];
        System.arraycopy(c, 0, novVetor, 0, c.length);
        c = novVetor;
        
    }
    private boolean verPosi(int posi){
        return posi>=0 && posi <= this.capacidade;
    }
}
