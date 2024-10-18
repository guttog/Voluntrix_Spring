package com.br.h2.srv;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.h2.mdl.Voluntario;
import com.br.h2.rep.VoluntarioRepository;

@Service
public class VoluntarioService {
	private static Logger logger = LoggerFactory.getLogger(VoluntarioService.class);

	@Autowired
	private VoluntarioRepository voluntarioRepository;
	
	
	public List<Voluntario> getAll(){
		return voluntarioRepository.findAll();
	}
	
	public Voluntario createVoluntario(Voluntario voluntario) {
		Voluntario saved = voluntarioRepository.save(voluntario);
		logger.warn("Saved voluntario: " + saved.toString());
		return voluntarioRepository.save(voluntario);
	}	
	
	public Voluntario getById(Long id) {
		return voluntarioRepository.getById(id);
	}
	
	public void delete(Long id) {
		voluntarioRepository.deleteById(id);
	}

}