package ifba.edu.br.basica;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Venda implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String descricao;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "venda_produto",
        joinColumns = @JoinColumn(name = "venda_id"),
        inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> produto = new ArrayList<>();

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Produto> getProdutos() {
        return produto;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produto = produtos;
    }

    public Venda() {
    }

    public Venda(int id, String descricao, List<Produto> produtos) {
        this.id = id;
        this.descricao = descricao;
        this.produto = produtos;
    }

    @Override
    public String toString() {
        return "Venda [id=" + id + ", descricao=" + descricao + ", produtos=" + produto + "]";
    }

}
