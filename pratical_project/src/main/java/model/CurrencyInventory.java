package model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CurrencyInventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int currency_inventory_id;
    private int daily_price;
    private double old_price;
    private double new_price;
    private boolean isActive;
    private int staff_id;
    private Date updated_in;

    @ManyToOne
    private CurrencyDailyPrice currencyDailyPrice;

    public int getCurrency_inventory_id() {
        return currency_inventory_id;
    }

    public void setCurrency_inventory_id(int currency_inventory_id) {
        this.currency_inventory_id = currency_inventory_id;
    }

    public int getDaily_price() {
        return daily_price;
    }

    public void setDaily_price(int daily_price) {
        this.daily_price = daily_price;
    }

    public double getOld_price() {
        return old_price;
    }

    public void setOld_price(double old_price) {
        this.old_price = old_price;
    }

    public double getNew_price() {
        return new_price;
    }

    public void setNew_price(double new_price) {
        this.new_price = new_price;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(int staff_id) {
        this.staff_id = staff_id;
    }

    public Date getUpdated_in() {
        return updated_in;
    }

    public void setUpdated_in(Date updated_in) {
        this.updated_in = updated_in;
    }
}
