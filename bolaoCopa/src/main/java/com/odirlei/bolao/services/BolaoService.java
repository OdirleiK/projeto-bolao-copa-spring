package com.odirlei.bolao.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.odirlei.bolao.dto.BolaoDTO;
import com.odirlei.bolao.entities.Bolao;
import com.odirlei.bolao.repositories.BolaoRepository;
import com.odirlei.bolao.services.exceptions.DatabaseException;
import com.odirlei.bolao.services.exceptions.ResourceNotFoundException;

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
		Bolao entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new BolaoDTO(entity);
	}

	@Transactional(readOnly = true)
	public BolaoDTO insert(BolaoDTO dto) {
		Bolao entity = new Bolao();
		entity.setNome(dto.getNome());
		entity.setDescricao(dto.getDescricao());
		entity.setAtivo(dto.getAtivo());
		entity = repository.save(entity);
		return new BolaoDTO(entity);
	}
	
	@Transactional
	public BolaoDTO update(Long id, BolaoDTO dto) {
		try {
			Bolao entity = repository.getOne(id);
			entity.setNome(dto.getNome());
			entity.setDescricao(dto.getDescricao());
			entity.setAtivo(dto.getAtivo());
			entity = repository.save(entity);
			return new BolaoDTO(entity);
		} 
		catch(EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found" + id);
		}
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Id not found" + id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity violation");
		}
	}	
}
