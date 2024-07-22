import br.edu.ifba.cadastros.Cadastros;

public class main {
    public static void main(String[] args) {
        Album a1 = new Album("IGOR","TYLER, THE CREATOR", 2019);
        Album a2 = new Album("Call me if you get lost", "TYLER, THE CREATOR", 2021);
        Album a3 = new Album("To Pimp a Butterfly", "Kendrick Lamar", 2015);

        Cadastros<Album> registro = new Cadastros<Album>();
        registro.adicionar(a1);
        registro.adicionar(a2);
        registro.adicionar(a3);
        registro.listar();
    }
}
