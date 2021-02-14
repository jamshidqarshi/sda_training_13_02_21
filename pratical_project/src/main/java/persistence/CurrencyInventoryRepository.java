package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class CurrencyInventoryRepository {

    private EntityManager entityManager;

    public CurrencyInventoryRepository() {
        entityManager = DBUtil.getEntityManager();
    }

    public void save(CurrencyInventoryRepository currencyInventoryRepository){
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(currencyInventoryRepository);
            entityManager.getTransaction().commit();
        } catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }
}
