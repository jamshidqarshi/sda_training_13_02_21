package model;

import javax.persistence.*;

@Entity
@Table(name = "payment_type")
public class PaymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_type_id")
    private int paymentTypeId;

    @Column(name = "name")
    private String name;

    public int getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(int paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentType() {
    }

    public PaymentType(int paymentTypeId, String name) {
        this.paymentTypeId = paymentTypeId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PaymentType{" +
                "paymentTypeId=" + paymentTypeId +
                ", name='" + name + '\'' +
                '}';
    }
}
