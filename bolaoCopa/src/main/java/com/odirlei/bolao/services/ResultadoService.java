package com.odirlei.bolao.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.odirlei.bolao.dto.ResultadoDTO;
import com.odirlei.bolao.entities.Resultado;
import com.odirlei.bolao.repositories.ResultadoRepository;

@Service
public class ResultadoService {

	@Autowired
	private ResultadoRepository repository;
	
	@Transactional(readOnly = true)
	public List<ResultadoDTO> findAll() {
		List<Resultado> list = repository.findAll();
		return list.stream().map(x -> new ResultadoDTO(x)).collect(Collectors.toList());
	}
	
}
