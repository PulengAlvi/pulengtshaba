package com.enviro.assessment.grad001.pulengtshaba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTS")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Product_ID;
    @ManyToOne
    @JoinColumn(name = "Investor_ID", nullable = false)
    private Investors Investor;
    private String Product_Type, Product_Name;
    private double Product_Balance;
    public long getProduct_ID() {
        return Product_ID;
    }
    public void setProduct_ID(long ProductID) {
        this.Product_ID = ProductID;
    }
    public long getInvestor_ID() {
        return Investor.getInvestor_ID();
    }
    public void setInvestor_ID(long Investor_ID) {
        this.Investor.setInvestor_ID(Investor_ID);
    }
    public String getProduct_Type() {
        return Product_Type;
    }
    public void setProduct_Type(String ProductType) {
        this.Product_Type = ProductType;
    }
    public String getProduct_Name() {
        return Product_Name;
    }
    public void setProduct_Name(String ProductName) {
        this.Product_Name = ProductName;
    }
    public double getProduct_Balance() {
        return Product_Balance;
    }
    public void setProduct_Balance(double ProductBalance) {
        this.Product_Balance = ProductBalance;
    }
}
