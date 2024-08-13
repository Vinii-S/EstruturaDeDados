import java.util.Scanner;

public class PrincipalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Paciente paciente1 = new Paciente("Roberto", "121212", 19);
        Paciente paciente2 = new Paciente("Maria", "131313", 20);
        Paciente paciente3 = new Paciente("Jonas", "331432", 33);
        

        ColecaoPacienteArray CPA = new ColecaoPacienteArray();

        CPA.cadastrarPaciente(paciente1);
        CPA.cadastrarPaciente(paciente2);
        CPA.cadastrarPaciente(paciente3);
        CPA.listarPaciente();

        System.out.println("Informe a posição que deseja verificar");
        int posicao = input.nextInt();
        CPA.procurarPaciente(posicao);
       
        System.out.println();

        CPA.listarPaciente();
        System.out.println("Informe a posição que deseja inserir o novo paciente");
        posicao = input.nextInt();
        System.out.println("Informe o Nome do paciente: ");
        String nome = input.next();
        System.out.println("Informe o RG do paciente: ");
        String rg = input.next();
        System.out.println("Informe a idade do paciente: ");
        int idade = input.nextInt();
        Paciente paciente4 = new Paciente(nome,rg,idade);
        CPA.cadastrarPacientePorPosicao(posicao, paciente4);
        CPA.listarPaciente();

        System.out.println("Informe a posição do paciente que deseja remover");
        posicao = input.nextInt();
        CPA.excluirPacientePorPosicao(posicao);
        CPA.listarPaciente();
        

        
    }
}
