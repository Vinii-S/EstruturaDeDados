
public class Cadastros {
    public static void main(String[] args) {
        Empresa e1 = new Empresa("12321312312/0001-98","Marks Pizza", "(75)3281-9908");
        Empresa e2 = new Empresa("123123123/0001-44","Hamburgeria Carne Boa", "(71)3222-9191");

        Funcionario f1 = new Funcionario("Vinicius","121.221.334-56","12123-23","(75)99988-1212",e1);
        Funcionario f2 = new Funcionario("João","154.775.555-09","5554-98","(75)94445-9988",e1);
        Funcionario f3 = new Funcionario("Luiza","123.123.123-12","1212155-98","(81)98874-0012",e2);
        
        RegraNegocioEmpresa rne = new RegraNegocioEmpresa ();
        rne.adicionarEmpresa(e1);
        rne.adicionarEmpresa(e2);
        
        RegraNegocioFuncionario rnf = new RegraNegocioFuncionario();
        rnf.adicionarFuncionario(f1);
        rnf.adicionarFuncionario(f2);
        rnf.adicionarFuncionario(f3);


        System.out.println("Dados das empresas: \n");
        rne.listarEmpresa();
        System.out.println( "\n\nDados dos funcionários: \n");
        rnf.listarFuncionario();

        

        
    }
}
