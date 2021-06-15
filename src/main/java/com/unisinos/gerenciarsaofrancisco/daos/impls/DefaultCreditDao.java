package com.unisinos.gerenciarsaofrancisco.daos.impls;

import com.unisinos.gerenciarsaofrancisco.daos.CreditDao;
import com.unisinos.gerenciarsaofrancisco.models.Credit;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class DefaultCreditDao implements CreditDao {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void saveOrUpdate(Credit credit) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(credit);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Credit findByCard(String card) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        List<Credit> result = entityManager.createQuery( " FROM credit_cards WHERE owner = :owner")
                .setParameter("cardNumber", card)
                .getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        if(result.isEmpty()) return null;
        return result.get(0);
    }

    @Override
    public Credit findById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        Credit result = entityManager.find(Credit.class, id);

        entityManager.getTransaction().commit();
        entityManager.close();

        return result;
    }

}
