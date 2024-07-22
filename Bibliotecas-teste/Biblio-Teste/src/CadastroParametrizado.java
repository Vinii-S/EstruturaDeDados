import java.util.ArrayList;
import java.util.List;

public class CadastroParametrizado {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao","(75)98811-9876","joao@gmail.com");
        Cadastro<Pessoa> C1 = new Cadastro<Pessoa>();
        C1.adicionar(p1);
        C1.listar();
    }
}
