public class CadastrarConta {
    private Conta[] c = new Conta[3];
    int cont = 0;
    public void adicionarConta(Conta com){
        if(cont<c.length){
            c[cont] =  com;
            cont++;
        }else{
            System.out.println("Array Cheio!");
        }
    }
        
    public void listarConta(){
        System.out.println("Listando todas as contas: ");
        for (Conta conta : c) {
            System.out.println("Nome do titular: " + conta.getNome());
            System.out.println("Saldo na conta: " + conta.getValor());
            System.out.println();
        }
    }

    public void procurarConta(String procura){
       String respN = "";
       Double respV = 0.0;
        for (int i = 0; i<c.length; i++) {
           if(c[i].getNome().equalsIgnoreCase(procura)){
            respN = c[i].getNome();
            respV = c[i].getValor();

            System.out.println("Imprimindo dados da conta:");
            System.out.println(respN);
            System.out.println(respV);
           }else{
            System.out.println("A conta nao foi encontrada");
           }                     
        }
        
        
    }
    
}
