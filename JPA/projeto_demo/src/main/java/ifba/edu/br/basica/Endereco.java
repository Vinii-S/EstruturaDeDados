package ifba.edu.br.basica;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int endereco_id;

    private String rua;
    private String numero;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    @OneToOne(mappedBy = "endereco")
    private Cliente cliente;

    public Endereco() {
    }

    public Endereco(int id, String rua, String numero, String bairro, String cep, String cidade, String estado) {
        this.endereco_id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getId() {
        return endereco_id;
    }

    public void setId(int id) {
        this.endereco_id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Endereco [id=" + endereco_id + ", rua=" + rua + ", numero=" + numero + ", bairro=" + bairro + ", cep=" + cep
                + ", cidade=" + cidade + ", estado=" + estado + "]";
    }
    
    
}
