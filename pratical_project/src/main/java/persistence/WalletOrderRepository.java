package persistence;

import model.CurrencyDailyPrice;
import util.DBUtil;

import javax.persistence.EntityManager;

public class WalletOrderRepository {
    private EntityManager entityManager;

    public WalletOrderRepository() {
        entityManager = DBUtil.getEntityManager();
    }

    public void save(WalletOrderRepository walletOrderRepository){
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(walletOrderRepository);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }

    public void update(WalletOrderRepository walletOrderRepository){
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(walletOrderRepository);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }

    public void delete(WalletOrderRepository walletOrderRepository){
        try{
            entityManager.getTransaction().begin();
            entityManager.remove(entityManager.merge(walletOrderRepository));
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
        }
    }
}
