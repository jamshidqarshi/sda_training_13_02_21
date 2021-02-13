package model;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "currency")
public class Currency {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "currency_id")
    private int currencyId;
    @Column(name = "name")
    private String currencyName;
    @Column(name = "code")
    private String currencyCode;
    @Column(name = "country")
    private String currencyCountry;
    @Column(name = "isActive")
    private boolean currencyIsActive;

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCountry() {
        return currencyCountry;
    }

    public void setCurrencyCountry(String currencyCountry) {
        this.currencyCountry = currencyCountry;
    }

    public boolean isCurrencyIsActive() {
        return currencyIsActive;
    }

    public void setCurrencyIsActive(boolean currencyIsActive) {
        this.currencyIsActive = currencyIsActive;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "currencyId=" + currencyId +
                ", currencyName='" + currencyName + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", currencyCountry='" + currencyCountry + '\'' +
                ", currencyIsActive=" + currencyIsActive +
                '}';
    }
}
