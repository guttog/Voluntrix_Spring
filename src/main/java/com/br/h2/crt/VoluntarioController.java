package com.br.h2.crt;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.h2.mdl.Voluntario;
import com.br.h2.srv.VoluntarioService;


@RequestMapping("/vol/")
@RestController
public class VoluntarioController {
	private static Logger logger = LoggerFactory.getLogger(VoluntarioController.class);

	@Autowired
	private VoluntarioService voluntarioService;
	
	@GetMapping
	public String endpintTest() {
		return "I am at Voluntario Controller";
	}
	
	 @PostMapping("add")
	    public ResponseEntity<Voluntario> add(@RequestBody Voluntario voluntario) {
		 	Voluntario vol= voluntarioService.createVoluntario(voluntario);
		    return new ResponseEntity<>(vol,HttpStatus.CREATED);
	    }
	 
	 @GetMapping("getAll")
	 public ResponseEntity<List<Voluntario>> getAll(){
		 List<Voluntario> voluntarios= voluntarioService.getAll();
		 return new ResponseEntity<>(voluntarios, HttpStatus.OK);
	 }
	 	
	@GetMapping("{id}")
	public ResponseEntity<Voluntario> testGetBtId(@PathVariable Long id){
		logger.info(id.toString());
		Voluntario vol = voluntarioService.getById(id);
		logger.info(vol.toString());
		return new ResponseEntity<>(vol, HttpStatus.FOUND);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id){
		voluntarioService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	 
}