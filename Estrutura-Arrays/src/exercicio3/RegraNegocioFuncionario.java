package exercicio3;

public class RegraNegocioFuncionario {
    private Funcionario[] f = new Funcionario[3];

    public void cadastrarFuncionario(Funcionario func){
        for(int i =0;i<f.length;i++){
            if(f[i] == null) {
        f[i] = func;
        break;
    }
    }
}

    public Funcionario[] listarFuncionario(){
       return f;
}
}