package com.odirlei.bolao.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odirlei.bolao.dto.ResultadoDTO;
import com.odirlei.bolao.services.ResultadoService;

@RestController
@RequestMapping(value = "/resultado")
public class ResultadoResource {
	
	@Autowired
	private ResultadoService service;
	
	@GetMapping
	public ResponseEntity<List<ResultadoDTO>> findAll() {
		List<ResultadoDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	

}
