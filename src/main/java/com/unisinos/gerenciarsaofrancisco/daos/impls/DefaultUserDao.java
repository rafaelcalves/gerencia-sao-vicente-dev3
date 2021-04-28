package com.unisinos.gerenciarsaofrancisco.daos.impls;

import com.unisinos.gerenciarsaofrancisco.daos.UserDao;
import com.unisinos.gerenciarsaofrancisco.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class DefaultUserDao implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void saveOrUpdate(User user) {
        entityManager.getTransaction().begin();

        entityManager.persist(user);

        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public User findByEmail(String email) {
        entityManager.getTransaction().begin();

        List<User> result = entityManager.createQuery( "SELECT user FROM User WHERE email = :email", User.class )
                .setParameter("email", email)
                .getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        return result.get(0);
    }

    @Override
    public User findById(int id) {
        entityManager.getTransaction().begin();

        User result = entityManager.find(User.class, id);

        entityManager.getTransaction().commit();
        entityManager.close();

        return result;
    }

}
