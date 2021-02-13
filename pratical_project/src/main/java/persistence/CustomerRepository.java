package persistence;

import model.Transaction;
import util.DBUtil;

import javax.persistence.EntityManager;

public class CustomerRepository {

    private EntityManager entityManager;

    public CustomerRepository() {entityManager = DBUtil.getEntityManager();}

    public void saveCustomer(Transaction t){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(t);
            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }

    public void updateCustomer(Transaction t){
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(t);
            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }

    public void deleteCustomer(Transaction t){
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.merge(t));
            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }
}
