import java.util.ArrayList;
import java.util.List;

public class RegraNegocioFuncionario {
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }


    public void listarFuncionario(){
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("RG: " + f.getRg());
            System.out.println("CPF: " + f.getCpf());
            System.out.println("Telefone: " + f.getTelefone());
            System.out.println("Empresa: " + f.getEmpresa().getNome());
            System.out.println("CNPJ da empresa: " + f.getEmpresa().getCnpj());
            System.out.println("Telefone da empresa: " + f.getEmpresa().getTelefone());
            System.out.println();
        }
    }
}
