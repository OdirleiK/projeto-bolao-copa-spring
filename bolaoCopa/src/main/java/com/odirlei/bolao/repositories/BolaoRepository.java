package com.odirlei.bolao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odirlei.bolao.entities.Bolao;

@Repository
public interface BolaoRepository extends JpaRepository<Bolao, Long>{

	
}
