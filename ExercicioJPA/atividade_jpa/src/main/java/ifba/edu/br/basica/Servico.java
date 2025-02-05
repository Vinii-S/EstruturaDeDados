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
public class Servico implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int servico_id;

    private String descricao_servico;
    private Double valor;
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "HistoricoServico", joinColumns = @JoinColumn(name = "servico_id"), inverseJoinColumns = @JoinColumn(name = "veiculo_id"))
    private List<Veiculo> veiculo = new ArrayList<>();



}
