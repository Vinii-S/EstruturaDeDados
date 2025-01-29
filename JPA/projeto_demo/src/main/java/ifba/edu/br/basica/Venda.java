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
import jakarta.persistence.ManyToOne;

@Entity
public class Venda implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int venda_id;
    private String descricao;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "venda_produto", joinColumns = @JoinColumn(name = "venda_id"), inverseJoinColumns = @JoinColumn(name = "produto_id"))
    private List<Produto> produto = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name="cliente_id", nullable = false)
    private Cliente cliente;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getId() {
        return venda_id;
    }

    public void setId(int id) {
        this.venda_id = id;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Venda() {
    }

    public Venda(int id, String descricao, List<Produto> produto, Cliente cliente) {
        this.venda_id = id;
        this.descricao = descricao;
        this.produto = produto;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venda [id=" + venda_id + ", descricao=" + descricao + ", produto=" + produto + ", cliente=" + cliente + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + venda_id;
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((produto == null) ? 0 : produto.hashCode());
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Venda other = (Venda) obj;
        if (venda_id != other.venda_id)
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (produto == null) {
            if (other.produto != null)
                return false;
        } else if (!produto.equals(other.produto))
            return false;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        return true;
    }

    

}
