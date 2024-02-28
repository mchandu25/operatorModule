package com.company.onlinecustomerservicecenter;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OperatorRepository extends JpaRepository<Operator,Integer> {
    Optional<Operator>findByEmail(String Email);
}
