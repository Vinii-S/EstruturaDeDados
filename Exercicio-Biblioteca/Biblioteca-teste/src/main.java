import br.edu.ifba.cadastros.Cadastros;

public class main {
    public static void main(String[] args) {
        Album a1 = new Album("IGOR","TYLER, THE CREATOR", 2019);
        Album a2 = new Album("Call me if you get lost", "TYLER, THE CREATOR", 2021);
        Album a3 = new Album("To Pimp a Butterfly", "Kendrick Lamar", 2015);
        Album a4 = new Album("recess", "bbno$", 2019);

        Cadastros<Album> catalogo = new Cadastros<Album>();
        catalogo.adicionar(a1);
        catalogo.adicionar(a2);
        catalogo.adicionar(a3);
        catalogo.adicionarPorPosicao(a4,1);
        catalogo.remover(2);
        catalogo.listar();
    }
}
