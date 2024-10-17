package com.br.h2mdl;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Voluntario {
	
	@Id
	private int id;
	
	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private String contato;
	
	@Getter @Setter
	private String credencial;
	
	@Getter @Setter
	private String endereco;
	
	@Getter @Setter
	private String email;
	
	@Getter
	private int pontuacaoTotal = 0;
	
	@Getter @Setter
	private int idade;
}
