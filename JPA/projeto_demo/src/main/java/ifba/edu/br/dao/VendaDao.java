package ifba.edu.br.dao;

import java.util.List;

import ifba.edu.br.basica.Venda;
import jakarta.persistence.EntityManager;

public class VendaDao {
    EntityManager em = GetEntityManager.getConnectionJpa();
    
     public void adicionarVenda(Venda v) {
        em.getTransaction().begin();
        em.persist(v);
        em.getTransaction().commit();
    }
    public Venda buscarVenda(int id){
        return em.find(Venda.class, id);
    }
    public void atualizarVenda(Venda v){
        em.getTransaction().begin();
        em.merge(v);
        em.getTransaction().commit();
    }
    public void removerVenda(Venda v){
        em.getTransaction().begin();
        em.remove(v);
        em.getTransaction().commit();
    }
    @SuppressWarnings("unchecked")
    public List<Venda> listarVendas(){
        return em.createQuery("SELECT v FROM Venda v").getResultList();
    }
}
