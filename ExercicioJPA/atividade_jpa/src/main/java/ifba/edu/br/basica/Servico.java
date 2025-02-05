package ifba.edu.br.basica;
import java.io.Serializable;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Servico implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int servico_id;

    private String descricao_servico;
    private Double valor;
    
    @OneToMany(mappedBy = "servico", cascade = CascadeType.ALL)
    private List<HistoricoServico> historicoServicos;

    public Servico() {
    }

    public Servico(int servico_id, String descricao_servico, Double valor, List<HistoricoServico> historicoServicos) {
        this.servico_id = servico_id;
        this.descricao_servico = descricao_servico;
        this.valor = valor;
        this.historicoServicos = historicoServicos;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getServico_id() {
        return servico_id;
    }

    public void setServico_id(int servico_id) {
        this.servico_id = servico_id;
    }

    public String getDescricao_servico() {
        return descricao_servico;
    }

    public void setDescricao_servico(String descricao_servico) {
        this.descricao_servico = descricao_servico;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<HistoricoServico> getHistoricoServicos() {
        return historicoServicos;
    }

    public void setHistoricoServicos(List<HistoricoServico> historicoServicos) {
        this.historicoServicos = historicoServicos;
    }



}
