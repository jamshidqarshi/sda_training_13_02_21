package persistence;

import model.CurrencyDailyPrice;
import util.DBUtil;

import javax.persistence.EntityManager;

public class CurrencyRepository {
    private EntityManager entityManager;


    public CurrencyRepository() {
        entityManager = DBUtil.getEntityManager();
    }

    public void save(CurrencyRepository currencyRepository) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(currencyRepository);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

    public void save(CurrencyDailyPrice currencyDailyPrice) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(currencyDailyPrice);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
        }
    }

}
