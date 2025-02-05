package ifba.edu.br.basica;
import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class HistoricoServico implements Serializable {
     @EmbeddedId
    private HistoricoServicoId id;

    @ManyToOne
    @MapsId("servico_id")
    @JoinColumn(name = "servico_id", nullable = false)
    private Servico servico;

    @ManyToOne
    @MapsId("veiculo_id")
    @JoinColumn(name = "veiculo_id", nullable = false)
    private Veiculo veiculo;

    @ManyToOne
    @JoinColumn(name = "funcionario_id", nullable = false)
    private Funcionario funcionario;

    public HistoricoServico() {
        this.id = new HistoricoServicoId(); 
    }

    public HistoricoServico(Servico servico, Veiculo veiculo, Funcionario funcionario) {
        this.id = new HistoricoServicoId(servico.getServico_id(), veiculo.getVeiculo_id());
        this.servico = servico;
        this.veiculo = veiculo;
        this.funcionario = funcionario;
    }

    public HistoricoServicoId getId() {
        return id;
    }

    public void setId(HistoricoServicoId id) {
        this.id = id;
        if (id != null) {
            this.servico = new Servico();
            this.servico.setServico_id(id.getServico_id());

            this.veiculo = new Veiculo();
            this.veiculo.setVeiculo_id(id.getVeiculo_id());
        }
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
