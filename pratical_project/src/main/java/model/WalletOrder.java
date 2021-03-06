package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "wallet_order")
public class WalletOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wallet_order_id")
    private int id;

    @Column(name = "wallet_amount")
    private double walletAmount;

    @Column(name = "wallet_order_total")
    private double walletOrderTotal;

    @Column(name = "date_register")
    private Date dateRegister;

    public WalletOrder() {
    }

    public WalletOrder(int id, double walletAmount, double walletOrderTotal, Date dateRegister) {
        this.id = id;
        this.walletAmount = walletAmount;
        this.walletOrderTotal = walletOrderTotal;
        this.dateRegister = dateRegister;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getWalletAmount() {
        return walletAmount;
    }

    public void setWalletAmount(double walletAmount) {
        this.walletAmount = walletAmount;
    }

    public double getWalletOrderTotal() {
        return walletOrderTotal;
    }

    public void setWalletOrderTotal(double walletOrderTotal) {
        this.walletOrderTotal = walletOrderTotal;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    @Override
    public String toString() {
        return "WalletOrder{" +
                "id=" + id +
                ", walletAmount=" + walletAmount +
                ", walletOrderTotal=" + walletOrderTotal +
                ", dateRegister=" + dateRegister +
                '}';
    }
}
