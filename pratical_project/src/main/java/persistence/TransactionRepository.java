package persistence;

import model.Transaction;
import util.DBUtil;

import javax.persistence.EntityManager;

public class TransactionRepository {

    private EntityManager entityManager;

    public TransactionRepository(){
        entityManager = DBUtil.getEntityManager();
    }

    public void saveTransaction(Transaction t){
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(t);
            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }

    public void updateTransaction(Transaction t){
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(t);
            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }

    public void deleteTransaction(Transaction t){
        try {
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.merge(t));
            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }
}
