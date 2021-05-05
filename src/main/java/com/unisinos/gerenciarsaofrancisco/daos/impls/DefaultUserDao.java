package com.unisinos.gerenciarsaofrancisco.daos.impls;

import com.unisinos.gerenciarsaofrancisco.daos.UserDao;
import com.unisinos.gerenciarsaofrancisco.models.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public class DefaultUserDao implements UserDao {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void saveOrUpdate(User user) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public User findByEmail(String email) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        List<User> result = entityManager.createQuery( "FROM User WHERE email = :email")
                .setParameter("email", email)
                .getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        if(result.isEmpty()) return null;
        return result.get(0);
    }

    @Override
    public User findById(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        User result = entityManager.find(User.class, id);

        entityManager.getTransaction().commit();
        entityManager.close();

        return result;
    }

}
