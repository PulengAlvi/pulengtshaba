package com.enviro.assessment.grad001.pulengtshaba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enviro.assessment.grad001.pulengtshaba.model.Investors;
import com.enviro.assessment.grad001.pulengtshaba.repository.InvestorRepo;
import com.enviro.assessment.grad001.pulengtshaba.repository.ProductRepo;


@RestController
public class InvestorController {
    @Autowired
    InvestorRepo Irepo;
    @Autowired
    ProductRepo Prepo;
    @Autowired
    Investors Investor;

    /*@GetMapping(path="/withdrawals/{InvestorName,InvestorPassword}")
	public List<Products> getInvestorInfo(@PathVariable("Investor_Name") String InvestorName,@PathVariable("Investor_Password") String InvestorPassword)
	{
        Investor = Irepo.findByInvestorNameAndInvestorPassword(InvestorName, InvestorPassword);
		return Prepo.findByInvestorID(investors.getInvestorID());
			
	}*/

    @RequestMapping("/investor/{Investor_Name}/{Investor_Password}")
	public Investors getInvestor(@PathVariable("Investor_Name") String Investor_Name,@PathVariable("Investor_Password") String Investor_Password)
	{
		return Irepo.findByInvestor_NameAndInvestor_Password(Investor_Name,Investor_Password);
	}

    

    
}
