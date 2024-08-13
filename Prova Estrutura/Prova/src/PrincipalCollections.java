import java.util.Scanner;

public class PrincipalCollections {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Paciente paciente1 = new Paciente("Roberto", "121212", 19);
        Paciente paciente2 = new Paciente("Maria", "131313", 20);
        Paciente paciente3 = new Paciente("Jonas", "331432", 33);
        
        ColecaoPaciente Cole = new ColecaoPaciente();
        Cole.cadastrarPaciente(paciente1);
        Cole.cadastrarPaciente(paciente2);
        Cole.cadastrarPaciente(paciente3);
        Cole.listarPaciente();


        System.out.println("Informe a posição que deseja verificar");
        int posicao = input.nextInt();
        Cole.procurarPaciente(posicao);
        System.out.println();
        Cole.listarPaciente();


        System.out.println("Informe a posição que deseja inserir o novo paciente");
        posicao = input.nextInt();
        System.out.println("Informe o Nome do paciente: ");
        String nome = input.next();
        System.out.println("Informe o RG do paciente: ");
        String rg = input.next();
        System.out.println("Informe a idade do paciente: ");
        int idade = input.nextInt();
        Paciente paciente4 = new Paciente(nome,rg,idade);
        Cole.cadastrarPacientePorPosicao(posicao, paciente4);
        Cole.listarPaciente();

        System.out.println("Informe a posição do paciente que deseja remover");
        posicao = input.nextInt();
        Cole.excluirPacientePorPosicao(posicao);
        Cole.listarPaciente();
    }
        
}
