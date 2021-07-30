package com.stacklevelup.backend.repositories;

import com.stacklevelup.backend.entities.Fiscal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiscalRepository extends JpaRepository<Fiscal, Long>{

    
    
}
