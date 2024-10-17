Sistema de Gestão de Voluntários

Criar um sistema integrado para gestão de Voluntariado no Brasil, que permita o cadastro de membros, controle de tarefas e financeiro.

CRUD -> Create, Read, Update e Delete
Definir classe generica para Pessoa

Classes filhas:
Voluntario
Colaborador
Doador

Requisitos:
- CRUD Voluntários
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
	-Métodos:
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
		
		
		
- Execução de tarefas pelos voluntários
- Controle de pontuação de tarefas
- Create Area de atuação
	Enum Area Atuacao
		Assistência social;
		Educação; 
		Saúde;
		Meio ambiente;
		Direitos humanos;
		Ajuda humanitária em situações de emergência.

Stakeholders
ENUMS
1) Voluntário
2) Beneficiário
3) Doadores
4) Colaboradores/Funcionários da ONG
5) Parceiros e Patrocinadores
6) Governo e Reguladores
7) Mídia e Influenciadores

Ex:
Eu Everton Rodrigues gostaria de me candidatar a fazer um voluntáriado na área de educação mas preciso de ajuda de custo .

 
