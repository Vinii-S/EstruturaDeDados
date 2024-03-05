package exercicio3;

public class cadastros {
    public static void main(String[] args) {
        Empresa emp1 = new Empresa("06.887.213/0001-87", "Borda e Lenha", "(11)3221-2342");
        Empresa emp2 = new Empresa("12.321.332/0001-92", "Asfalto´s", "(11)3322-1212");
        Empresa emp3 = new Empresa("12.332.445/0001-76", "Red Bull", "(11)3882-1919");

        RegraNegocioEmpresa rne = new RegraNegocioEmpresa();
        rne.cadastrarEmpresa(emp1);
        rne.cadastrarEmpresa(emp2);
        rne.cadastrarEmpresa(emp3);

        Funcionario f1 = new Funcionario("097.554.332-10","Joao Ribeiro" , "1321321" , "(11)9885-3242", emp1);
        Funcionario f2 = new Funcionario("123.123.432-09","Matheus Nunes" , "9875435" , "(11)9845-9985", emp2);
        Funcionario f3 = new Funcionario("342.423.115-05","Max Verstappen" , "5464566" , "(11)6576-9956", emp3);

        RegraNegocioFuncionario rnf = new RegraNegocioFuncionario();
        rnf.cadastrarFuncionario(f1);
        rnf.cadastrarFuncionario(f2);
        rnf.cadastrarFuncionario(f3);
       
        System.out.println("Imprimindo dados dos funcionarios e empresas");
        for (Funcionario f :rnf.listarFuncionario() ) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("CPF: " + f.getCpf());
            System.out.println("RG: " + f.getRg());
            System.out.println("Telefone: " + f.getTelefone());
            System.out.println("Nome da empresa: " + f.getEmpresa().getNome());
            System.out.println("CNPJ: " + f.getEmpresa().getCnpj());
            System.out.println("Telefone: " + f.getEmpresa().getTelefone());
            System.out.println();

        }
        
    }
}
