package com.br.h2.srv;

import org.springframework.stereotype.Service;

import com.br.h2mdl.Voluntario;

@Service
public class VoluntarioService {
	public Voluntario addVoluntario(Voluntario voluntario) {
		return new Voluntario();
	}
}
