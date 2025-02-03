package ifba.edu.br.dao;


import java.util.List;
import ifba.edu.br.basica.Produto;
import jakarta.persistence.EntityManager;

public class ProdutoDao {
      EntityManager em = GetEntityManager.getConnectionJpa();

       public void adicionarProduto(Produto p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
       }

        public Produto buscarProduto(int id){
        return em.find(Produto.class, id);
    }
     public void atualizarProduto(Produto p){
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }
    public void removerProduto(Produto p){
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }
     @SuppressWarnings("unchecked")
    public List<Produto> listaProdutos(){
        return em.createQuery("SELECT p FROM Produto p").getResultList();
    }
  
    }

