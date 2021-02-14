package persistence;

import model.Customer;
import model.Transaction;
import util.DBUtil;

import javax.persistence.EntityManager;

public class CustomerRepository {

    private EntityManager entityManager;

    public CustomerRepository() {entityManager = DBUtil.getEntityManager();}

    public void saveCustomer(Customer t){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(t);
            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }

    public void updateCustomer(Customer t){
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(t);
            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }

    public void deleteCustomer(Customer t){
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.merge(t));
            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }
}
