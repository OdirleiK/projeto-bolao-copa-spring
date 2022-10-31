package com.odirlei.bolao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odirlei.bolao.dto.BolaoDTO;
import com.odirlei.bolao.services.BolaoService;

@RestController
@RequestMapping(value = "/boloes")
public class BolaoResource {

	@Autowired
	private BolaoService service;
	
	@GetMapping
	public ResponseEntity<List<BolaoDTO>> findAll() {
		List<BolaoDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<BolaoDTO> findById(@PathVariable Long id) {
		BolaoDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
