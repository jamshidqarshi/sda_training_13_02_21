package persistence;

import model.CurrencyDailyPrice;
import util.DBUtil;

import javax.persistence.EntityManager;

public class CurrencyDailyPriceRepository {
    private EntityManager entityManager;

    public CurrencyDailyPriceRepository(){
        entityManager = DBUtil.getEntityManager();
    }

    public void save(CurrencyDailyPrice currencyDailyPrice){
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(currencyDailyPrice);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }

    public void update(CurrencyDailyPrice currencyDailyPrice){
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(currencyDailyPrice);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }

    public void delete(CurrencyDailyPrice currencyDailyPrice){
        try{
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.merge(currencyDailyPrice));
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }
}
