package ifba.edu.br.principal;

import ifba.edu.br.basica.Cliente;
import ifba.edu.br.basica.Endereco;
import ifba.edu.br.basica.Funcionario;
import ifba.edu.br.basica.HistoricoServico;
import ifba.edu.br.basica.Servico;
import ifba.edu.br.basica.Veiculo;
import ifba.edu.br.dao.GetEntityManager;
import jakarta.persistence.EntityManager;

public class Principal {
    public static void main(String[] args) {
        EntityManager em = GetEntityManager.getConnectionJpa();
        Endereco e = new Endereco();
        e.setBairro("Centro");
        e.setCep("48999-000");
        e.setCidade("Paulo Afonso");
        e.setNumero("222");
        e.setRua("Rua da Alegria");

        // em.getTransaction().begin();
        // em.persist(e);
        // em.getTransaction().commit();
        Cliente c = new Cliente();
        c.setNome_cliente("Joseph");
        c.setCpf_cliente("12345678911");
        c.setEmail_cliente("joseph@gmail.com");
        c.setEndereco(em.find(Endereco.class, 1));

        // em.getTransaction().begin();
        // em.persist(c);
        // em.getTransaction().commit();

        Veiculo v = new Veiculo();
        v.setModelo_veiculo("HB20 2025");
        v.setMontadora_veiculo("Hyundai");
        v.setCliente(em.find(Cliente.class, 1));

        // em.getTransaction().begin();
        // em.persist(v);
        // em.getTransaction().commit();

        Funcionario f = new Funcionario();
        f.setNome_funcionario("Ronaldo");
        f.setCpf_funcionario("34567898711");
        f.setFuncao_funcionario("Vendedor");
        // em.getTransaction().begin();
        // em.persist(f);
        // em.getTransaction().commit();

        Servico s = new Servico();
        s.setDescricao_servico("Venda do Hyundai HB20 2025");
        s.setValor(90000.00);
       // em.getTransaction().begin();
       // em.persist(s);
       // em.getTransaction().commit();
       HistoricoServico h =new HistoricoServico();
       h.setServico(em.find(Servico.class, 1));
       h.setVeiculo(em.find(Veiculo.class, 1));
       h.setFuncionario(em.find(Funcionario.class, 1));
       em.getTransaction().begin();
       em.persist(h);
       em.getTransaction().commit();
    }
}
