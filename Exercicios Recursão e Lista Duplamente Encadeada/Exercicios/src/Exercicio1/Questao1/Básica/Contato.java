package Questao1.Básica;

public class Contato {
    private String nome;
    private String Endereco;
    private String telefone;

    public Contato(String nome, String endereco, String telefone) {
        this.nome = nome;
        Endereco = endereco;
        this.telefone = telefone;
    }
    public Contato() {
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return Endereco;
    }
    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    @Override

    public String toString() {
        return "Contato: " + nome + ", Endereco: " + Endereco + ", telefone: " + telefone;
    }

    
}
