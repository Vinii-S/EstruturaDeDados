package ifba.edu.br.basica;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int cliente_id;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

   @OneToMany(mappedBy = "veiculo", cascade = CascadeType.ALL)
    private List<Veiculo> veiculo;

    private String nome_cliente;
    private String email_cliente;
    private String cpf_cliente;
    public Cliente() {
    }
   
    public Cliente(int cliente_id, Endereco endereco, String nome_cliente, String email_cliente, String cpf_cliente) {
        this.cliente_id = cliente_id;
        this.endereco = endereco;
        this.nome_cliente = nome_cliente;
        this.email_cliente = email_cliente;
        this.cpf_cliente = cpf_cliente;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getCliente_id() {
        return cliente_id;
    }
    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    public String getNome_cliente() {
        return nome_cliente;
    }
    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    public String getEmail_cliente() {
        return email_cliente;
    }
    public void setEmail_cliente(String email_cliente) {
        this.email_cliente = email_cliente;
    }
    public String getCpf_cliente() {
        return cpf_cliente;
    }
    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }
}