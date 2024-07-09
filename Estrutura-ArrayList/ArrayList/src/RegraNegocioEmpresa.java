import java.util.ArrayList;
import java.util.List;

public class RegraNegocioEmpresa {
    private List<Empresa> empresas = new ArrayList<Empresa>();

    public List<Empresa> listarEmpresa(){
        for (Empresa e : empresas) {
            System.out.println("Nome: " + e.getNome());
            System.out.println("CNPJ: " + e.getCnpj());
            System.out.println("Telefone: " + e.getTelefone());
            System.out.println();
        }
        return empresas;
        
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }
}
