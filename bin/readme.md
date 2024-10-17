Sistema de Gest�o de Volunt�rios

Criar um sistema integrado para gest�o de Voluntariado no Brasil, que permita o cadastro de membros, controle de tarefas e financeiro.

CRUD -> Create, Read, Update e Delete
Definir classe generica para Pessoa

Classes filhas:
Voluntario
Colaborador
Doador

Requisitos:
- CRUD Volunt�rios
	-List Voluntarios
	-Atributos:
		nome
		idade
		genero
		experiencia
		habilidades
		horasDisponiveis
		motivacao
		ENUM areaAtuacao
		pontuacaoTotal
	-M�todos:
		inscrever()
		executarTarefa()
		
- CRUD de tarefas
	-List Tarefas
	-Atributos:
		descricao
		ENUM areaAtuacao
		local
		horario
		responsavel
		ajudaDeCusto
		boolean status
		normas
		int qtdVoluntarios
		pontuacao
		tempoTotal
		final static fatorPontuacao
	-Metodos
		atualizarPontosVoluntario()
		atualizarStatus()
		getAllVoluntarios()
		calcularPontuacao()
		
		
		
- Execu��o de tarefas pelos volunt�rios
- Controle de pontua��o de tarefas
- Create Area de atua��o
	Enum Area Atuacao
		Assist�ncia social;
		Educa��o; 
		Sa�de;
		Meio ambiente;
		Direitos humanos;
		Ajuda humanit�ria em situa��es de emerg�ncia.

Stakeholders
ENUMS
1) Volunt�rio
2) Benefici�rio
3) Doadores
4) Colaboradores/Funcion�rios da ONG
5) Parceiros e Patrocinadores
6) Governo e Reguladores
7) M�dia e Influenciadores

Ex:
Eu Everton Rodrigues gostaria de me candidatar a fazer um volunt�riado na �rea de educa��o mas preciso de ajuda de custo .

 
