package ifba.edu.br.basica;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int funcionario_id;

    private String nome_funcionario;
    private String cpf_funcionario;
    private String funcao_funcionario;
    
    public Funcionario() {
    }
    public Funcionario(int funcionario_id, String nome_funcionario, String cpf_funcionario, String funcao_funcionario) {
        this.funcionario_id = funcionario_id;
        this.nome_funcionario = nome_funcionario;
        this.cpf_funcionario = cpf_funcionario;
        this.funcao_funcionario = funcao_funcionario;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public int getFuncionario_id() {
        return funcionario_id;
    }
    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }
    public String getNome_funcionario() {
        return nome_funcionario;
    }
    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }
    public String getCpf_funcionario() {
        return cpf_funcionario;
    }
    public void setCpf_funcionario(String cpf_funcionario) {
        this.cpf_funcionario = cpf_funcionario;
    }
    public String getFuncao_funcionario() {
        return funcao_funcionario;
    }
    public void setFuncao_funcionario(String funcao_funcionario) {
        this.funcao_funcionario = funcao_funcionario;
    }
    @Override
    public String toString() {
        return "Funcionario [funcionario_id=" + funcionario_id + ", nome_funcionario=" + nome_funcionario
                + ", cpf_funcionario=" + cpf_funcionario + ", funcao_funcionario=" + funcao_funcionario + "]";
    }
}
