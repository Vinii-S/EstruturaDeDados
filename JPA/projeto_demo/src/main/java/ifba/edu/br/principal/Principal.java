package ifba.edu.br.principal;

import java.util.List;

import ifba.edu.br.basica.Categoria;
import ifba.edu.br.basica.Cliente;
import ifba.edu.br.basica.Endereco;
import ifba.edu.br.basica.Produto;
import ifba.edu.br.basica.Venda;
import ifba.edu.br.dao.GetEntityManager;
import jakarta.persistence.EntityManager;

public class Principal {
  public static void main(String[] args) {

    EntityManager em = GetEntityManager.getConnectionJpa();
    /*
     * Categoria C = new Categoria("Categoria Teste");
     * Categoria C2 = new Categoria("teste 2");
     */

    /*
     * em.getTransaction().begin();
     * em.persist(C);
     * em.persist(C2);
     * em.getTransaction().commit();
     */

    Cliente c = new Cliente();
    /*
     * c.setNome("Jorge");
     * c.setRg("123456");
     * c.setCpf("12345678911");
     * c.setCategoria(em.find(Categoria.class, 1));
     * 
     * 
     * em.getTransaction().begin();
     * em.persist(c);
     * em.getTransaction().commit();
     */

    Endereco e = new Endereco();

    e.setRua("Rua da Paz");
    e.setBairro("Centro");
    e.setCep("48300-000");
    e.setCidade("Itapetinga");
    e.setEstado("Bahia");
    e.setNumero("10");

    /*
     * em.getTransaction().begin();
     * em.persist(e);
     * em.getTransaction().commit();
     */

    c = em.find(Cliente.class, 2);
    c.setEndereco(e);

    Produto p = new Produto();
    p.setDescricao("Coca Cola");
    p.setEstoque(10);
    p.setValor(5.0);

    Venda v = new Venda();
    v.setDescricao("Venda de Coca Cola");
      // Associar os produtos à venda
    v.getProdutos().add(p);
      // Associar a venda aos produtos
    p.getVendas().add(v);


    em.getTransaction().begin();
    em.persist(p);
    em.persist(v);
    em.getTransaction().commit();

  }

}
