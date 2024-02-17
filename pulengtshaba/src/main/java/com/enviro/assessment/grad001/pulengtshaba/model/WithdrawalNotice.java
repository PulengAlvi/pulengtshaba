package com.enviro.assessment.grad001.pulengtshaba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "withdrawalnotice")
public class WithdrawalNotice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Withdrawal_ID;
    @ManyToOne
    @JoinColumn(name = "Product_ID", nullable = false)
    private Products Product_ID;
    private double Withdrawal_Amount, Product_Balance;
    private String Withdrawal_Date;
    public long getWithdrawal_ID() {
        return Withdrawal_ID;
    }
    public void setWithdrawal_ID(int withdrawalID) {
        this.Withdrawal_ID = withdrawalID;
    }
    public long getProduct_ID() {
        return Product_ID.getProduct_ID();
    }
    public void setProduct_ID(int productID) {
        this.Product_ID.setProduct_ID(productID);
    }
    public double getWithdrawal_Amount() {
        return Withdrawal_Amount;
    }
    public void setWithdrawal_Amount(double withdrawalAmount) {
        this.Withdrawal_Amount = withdrawalAmount;
    }
    public double getProduct_Balance() {
        return Product_Balance;
    }
    public void setProduct_Balance(double productBalance) {
        this.Product_Balance = productBalance;
    }
    public String getWithdrawal_Date() {
        return Withdrawal_Date;
    }
    public void setWithdrawal_Date(String withdrawalDate) {
        this.Withdrawal_Date = withdrawalDate;
    }

    
}
