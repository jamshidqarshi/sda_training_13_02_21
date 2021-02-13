package model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "wallet")
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wallet_id")
    private int walletId;
    @Column(name = "date_register")
    private Date dateRegister;
    @Column(name = "status")
    private String status;

    public Wallet() {
    }

    public Wallet(int walletId, Date dateRegister, String status) {
        this.walletId = walletId;
        this.dateRegister = dateRegister;
        this.status = status;
    }

    public int getWalletId() {
        return walletId;
    }

    public void setWalletId(int walletId) {
        this.walletId = walletId;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "walletId=" + walletId +
                ", dateRegister=" + dateRegister +
                ", status='" + status + '\'' +
                '}';
    }
}
