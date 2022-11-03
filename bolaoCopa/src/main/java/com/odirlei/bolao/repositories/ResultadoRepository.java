package com.odirlei.bolao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.odirlei.bolao.entities.Resultado;

@Repository
public interface ResultadoRepository extends JpaRepository<Resultado, Long> {

}
