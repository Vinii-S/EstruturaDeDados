package ifba.edu.br.basica;
import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
public class Veiculo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int veiculo_id;

    private String modelo_veiculo;
    private String montadora_veiculo;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    public Veiculo() {
    }
   
    public Veiculo(int veiculo_id, String modelo_veiculo, String montadora_veiculo, Cliente cliente) {
        this.veiculo_id = veiculo_id;
        this.modelo_veiculo = modelo_veiculo;
        this.montadora_veiculo = montadora_veiculo;
        this.cliente = cliente;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public int getVeiculo_id() {
        return veiculo_id;
    }
    public void setVeiculo_id(int veiculo_id) {
        this.veiculo_id = veiculo_id;
    }
    public String getModelo_veiculo() {
        return modelo_veiculo;
    }
    public void setModelo_veiculo(String modelo_veiculo) {
        this.modelo_veiculo = modelo_veiculo;
    }
    public String getMontadora_veiculo() {
        return montadora_veiculo;
    }
    public void setMontadora_veiculo(String montadora_veiculo) {
        this.montadora_veiculo = montadora_veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

