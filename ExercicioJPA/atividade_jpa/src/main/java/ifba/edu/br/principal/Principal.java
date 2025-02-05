package ifba.edu.br.principal;

import ifba.edu.br.basica.Endereco;
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
         
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }
}
