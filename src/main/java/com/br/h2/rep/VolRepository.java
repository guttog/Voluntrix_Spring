package com.br.h2.rep;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.h2mdl.Voluntario;


@Repository
public interface VolRepository extends JpaRepository<Voluntario, Long> {
	public Optional<Voluntario> findById(Long id);
}
