package com.odirlei.bolao.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odirlei.bolao.entities.Bolao;

@RestController
@RequestMapping(value = "/boloes")
public class BolaoResource {

	@GetMapping
	public ResponseEntity<List<Bolao>> findAll() {
		List<Bolao> list =  new ArrayList<>();
		list.add(new Bolao(1L, "Bolao Wise", "bolao da empresa"));
		list.add(new Bolao(2L, "Bolao Lekao", "bolao da adega"));
		return ResponseEntity.ok().body(list);
	}
}