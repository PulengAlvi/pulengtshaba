package com.enviro.assessment.grad001.pulengtshaba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.enviro.assessment.grad001.pulengtshaba.model.Investors;



public interface InvestorRepo extends JpaRepository<Investors, Long>{
    @Query("SELECT i FROM Investors i WHERE i.Investor_Name = :Investor_Name AND i.Investor_Password = :Investor_Password")
    Investors findByInvestor_NameAndInvestor_Password(@Param("Investor_Name") String Investor_Name,@Param("Investor_Password")  String Investor_Password);
}
