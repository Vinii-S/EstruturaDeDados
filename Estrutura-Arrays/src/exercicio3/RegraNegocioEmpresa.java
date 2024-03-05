package exercicio3;

public class RegraNegocioEmpresa {
   private Empresa[] e = new Empresa[2];

    public void cadastrarEmpresa(Empresa emp){
        for(int i = 0; i<e.length;i++){
            if(e[i]== null){
                e[i] = emp;
                break;
            }
            
    }
}

    public Empresa[] listarEmpresa(){
        return e;
}
}
