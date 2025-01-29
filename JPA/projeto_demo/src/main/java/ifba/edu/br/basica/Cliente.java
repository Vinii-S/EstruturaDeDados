package ifba.edu.br.basica;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cliente_id;

    private String nome;
    private String cpf;
    private String rg;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, String rg, Endereco endereco, Categoria categoria) {
        this.cliente_id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.categoria = categoria;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getId() {
        return cliente_id;
    }

    public void setId(int id) {
        this.cliente_id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + cliente_id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", categoria="
                + categoria.getDescricao()
                + "]";
    }

}
