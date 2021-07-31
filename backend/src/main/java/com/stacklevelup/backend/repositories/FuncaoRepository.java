package com.stacklevelup.backend.repositories;

import com.stacklevelup.backend.entities.Funcao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncaoRepository extends JpaRepository<Funcao, Long> {
    
}
