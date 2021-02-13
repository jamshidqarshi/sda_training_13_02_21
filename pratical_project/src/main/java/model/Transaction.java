package model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="transaction_id")
    private int transactionId;
    
    @Column(name ="wallet_id")
    private int walletId;

    @Column(name ="wallet_sum")
    private int walletSum;

    @Column(name ="transaction_status")
    private char transactionStatus;

    @Column(name ="staff_id")
    private int staffId;

    @Column(name ="wallet_order_total")
    private double TransactionWalletOrderTotal;

    @Column(name ="date_register")
    private Date date_register;

    @Column(name ="payment_type_id")
    private int payment_type_id;

    public Transaction() {
    }

    public Transaction(int transactionId, int walletId, int walletSum, char transactionStatus, int staffId, double transactionWalletOrderTotal, Date date_register, int payment_type_id) {
        this.transactionId = transactionId;
        this.walletId = walletId;
        this.walletSum = walletSum;
        this.transactionStatus = transactionStatus;
        this.staffId = staffId;
        TransactionWalletOrderTotal = transactionWalletOrderTotal;
        this.date_register = date_register;
        this.payment_type_id = payment_type_id;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Transaction setTransactionId(int transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    public int getWalletId() {
        return walletId;
    }

    public Transaction setWalletId(int walletId) {
        this.walletId = walletId;
        return this;
    }

    public int getWalletSum() {
        return walletSum;
    }

    public Transaction setWalletSum(int walletSum) {
        this.walletSum = walletSum;
        return this;
    }

    public char getTransactionStatus() {
        return transactionStatus;
    }

    public Transaction setTransactionStatus(char transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }

    public int getStaffId() {
        return staffId;
    }

    public Transaction setStaffId(int staffId) {
        this.staffId = staffId;
        return this;
    }

    public double getTransactionWalletOrderTotal() {
        return TransactionWalletOrderTotal;
    }

    public Transaction setTransactionWalletOrderTotal(double transactionWalletOrderTotal) {
        TransactionWalletOrderTotal = transactionWalletOrderTotal;
        return this;
    }

    public Date getDate_register() {
        return date_register;
    }

    public Transaction setDate_register(Date date_register) {
        this.date_register = date_register;
        return this;
    }

    public int getPayment_type_id() {
        return payment_type_id;
    }

    public Transaction setPayment_type_id(int payment_type_id) {
        this.payment_type_id = payment_type_id;
        return this;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", walletId=" + walletId +
                ", walletSum=" + walletSum +
                ", transactionStatus=" + transactionStatus +
                ", staffId=" + staffId +
                ", TransactionWalletOrderTotal=" + TransactionWalletOrderTotal +
                ", date_register=" + date_register +
                ", payment_type_id=" + payment_type_id +
                '}';
    }
}
