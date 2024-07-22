public class Album {
    private String Nome;
    private String Artista;
    private int Lancamento;

    public Album() {
    }
    public Album(String nome, String artista, int lancamento) {
        Nome = nome;
        Artista = artista;
        Lancamento = lancamento;
    }

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getArtista() {
        return Artista;
    }
    public void setArtista(String artista) {
        Artista = artista;
    }
    public int getLancamento() {
        return Lancamento;
    }
    public void setLancamento(int lancamento) {
        Lancamento = lancamento;
    }
    @Override
    public String toString() {
        return "Album: " + Nome + ". Artista: " + Artista + ". Lancamento: " + Lancamento;
    }
}
