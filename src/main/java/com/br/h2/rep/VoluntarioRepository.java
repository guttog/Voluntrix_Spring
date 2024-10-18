package com.br.h2.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.h2.mdl.Voluntario;


@Repository
public interface VoluntarioRepository extends JpaRepository<Voluntario, Long> {
}
