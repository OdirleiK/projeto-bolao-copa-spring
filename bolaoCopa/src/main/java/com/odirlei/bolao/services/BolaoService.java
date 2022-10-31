package com.odirlei.bolao.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.odirlei.bolao.dto.BolaoDTO;
import com.odirlei.bolao.entities.Bolao;
import com.odirlei.bolao.repositories.BolaoRepository;
import com.odirlei.bolao.services.exceptions.EntityNotFoundException;

@Service
public class BolaoService {
	
	@Autowired
	private BolaoRepository repository;
	
	@Transactional(readOnly = true)
	public List<BolaoDTO> findAll() {
		List<Bolao> list =  repository.findAll();
		return list.stream().map(x -> new BolaoDTO(x)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public BolaoDTO findById(Long id) {
		Optional<Bolao> obj = repository.findById(id);
		Bolao entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
		return new BolaoDTO(entity);
	}
}
