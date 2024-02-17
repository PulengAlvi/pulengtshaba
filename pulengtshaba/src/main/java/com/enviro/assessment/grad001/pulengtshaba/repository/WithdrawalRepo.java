package com.enviro.assessment.grad001.pulengtshaba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enviro.assessment.grad001.pulengtshaba.model.WithdrawalNotice;

import java.util.List;


public interface WithdrawalRepo extends JpaRepository<WithdrawalNotice,Long> {
    List<WithdrawalNotice> findByProductID(long productID);
}
