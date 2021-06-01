package com.unisinos.gerenciarsaofrancisco.daos.impls;

import com.unisinos.gerenciarsaofrancisco.daos.MedicalPrescriptionDao;
import com.unisinos.gerenciarsaofrancisco.models.MedicalPrescription;
import com.unisinos.gerenciarsaofrancisco.models.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

@Transactional
@Component
public class MedicalPrescriptionDaoImpl  implements MedicalPrescriptionDao {
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void save(MedicalPrescription medicalPrescription) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(medicalPrescription);

        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public MedicalPrescription findById(Integer id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        MedicalPrescription result = entityManager.find(MedicalPrescription.class, id);

        entityManager.getTransaction().commit();
        entityManager.close();

        return result;
    }
}
