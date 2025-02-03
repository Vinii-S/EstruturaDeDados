package ifba.edu.br.dao;

import java.util.List;

import ifba.edu.br.basica.Categoria;
import jakarta.persistence.EntityManager;

public class CategoriaDao {
        EntityManager em = GetEntityManager.getConnectionJpa();

        public void adicionarCategoria(Categoria c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
    }
    public Categoria buscarCategoria(int id){
        return em.find(Categoria.class, id);
    }
    public void atualizarCategoria(Categoria c){
        em.getTransaction().begin();
        em.merge(c);
        em.getTransaction().commit();
    }
    public void removerCategoria(Categoria c){
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
    }
    @SuppressWarnings("unchecked")
    public List<Categoria> listarCategorias(){
        return em.createQuery("SELECT c FROM Categoria c").getResultList();
    }
}
