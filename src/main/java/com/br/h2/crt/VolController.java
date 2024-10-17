package com.br.h2.crt;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.h2mdl.Voluntario;

import jakarta.persistence.Table;

@RestController
@RequestMapping("/voluntario")
@Table(name="Voluntario")
public class VolController {

	private static Logger logger = LoggerFactory.getLogger(VolController.class);
	
	@GetMapping("/teste")
	public String home() {
		logger.info("Acessando controller dentro da classe VolController");
		return "Testando url";
	}
	
	
	@GetMapping("/getAll")
	public List<Voluntario> getAll(){
		return null;
	}
	
	@GetMapping("/{id}")
	public Voluntario getById(Long id) {
		return null;
	}
	
	
	@PostMapping("/")
	public ResponseEntity<Voluntario> addVoluntario(@RequestBody Voluntario voluntario){	
		Voluntario tempVol = new Voluntario();//Persistencia do objeto no banco
		return new ResponseEntity<>(tempVol, HttpStatus.CREATED);
		
		
		
	}
}
