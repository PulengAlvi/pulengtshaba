package com.enviro.assessment.grad001.pulengtshaba.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component // Add this annotation to make it a Spring bean
@Entity
@Table(name = "INVESTORS")
public class Investors {
    @Id
    private long Investor_ID;
    private String Investor_Name,Investor_Address,Investor_Phone,Investor_Password,Date_Of_Birth;
    @Column(name = "Investor_Password")
    public String getInvestorPassword() {
        return Investor_Password;
    }
    public void setInvestor_Password(String investorPassword) {
        Investor_Password = investorPassword;
    }
    public long getInvestor_ID() {
        return Investor_ID;
    }
    public void setInvestor_ID(long investor_ID2) {
        this.Investor_ID = investor_ID2;
    }
    @Column(name = "Investor_Name")
    public String getInvestor_Name() {
        return Investor_Name;
    }
    public void setInvestor_Name(String InvestorName) {
        this.Investor_Name = InvestorName;
    }
    public String getInvestor_Address() {
        return Investor_Address;
    }
    public void setInvestor_Address(String InvestorAddress) {
        this.Investor_Address = InvestorAddress;
    }
    public String getInvestor_Phone() {
        return Investor_Phone;
    }
    public void setInvestor_Phone(String InvestorPhone) {
        this.Investor_Phone = InvestorPhone;
    }
    public String getDate_Of_Birth() {
        return Date_Of_Birth;
    }
    public void setDate_Of_Birth(String dateOfBirth) {
        this.Date_Of_Birth = dateOfBirth;
    }
    @Override
    public String toString() {
        return "Investors [Investor_ID=" + Investor_ID + ", Investor_Name=" + Investor_Name + ", Investor_Address="
                + Investor_Address + ", Investor_Phone=" + Investor_Phone + ", Investor_Password=" + Investor_Password
                + ", Date_Of_Birth=" + Date_Of_Birth + "]";
    }
    
    
}