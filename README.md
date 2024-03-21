# SENAI Fullstack [Education]

## Resolução dos exercícios da Semana 10

### M1S10 | Ex 1 - Setup: Projeto de tutoria

Criar uma plataforma que conecte alunos que precisam de ajuda extra em determinadas disciplinas com tutores qualificados.

A plataforma deve incluir:

- Agendamento de sessões de tutoria.
- Compartilhamento de materiais de estudo.

Criar entidades:

- **Aluno**
    - Nome
- **Tutor**
    - Nome
    - Especialidade
- **Agenda**
    - Aluno
    - Tutor
    - Data
    - Status (ex: agendado, cancelado, concluído)
    - Tema
    - Descrição breve
- **Material**
    - Agenda
    - Descrição
    - Caminho do arquivo (armazenar URLs ou caminhos de pastas)

### M1S10 | Ex 2 - CRUD Alunos

Criar CRUD para a entidade **Aluno.**

Utilize adequadamente os padrões **REST** e **MVC**.

Não se esqueça do tratamento de exceções, status de resposta e seus métodos HTTP.

### M1S10 | Ex 3 - CRUD Tutores

Criar **CRUD** para a entidade Tutor.

Utilize adequadamente os padrões **REST** e **MVC**.

Não se esqueça do tratamento de exceções, status de resposta e seus métodos HTTP.

### M1S10 | Ex 4 - CRUD Agendamento

Criar **CRUD** para a entidade Agenda.

Utilize adequadamente os padrões **REST** e **MVC**.

Não se esqueça do tratamento de exceções, status de resposta e seus métodos HTTP.

### M1S10 | Ex 5 - CRUD Materiais

Criar **CRUD** para a entidade Material.

Utilize adequadamente os padrões **REST** e **MVC.**

Não se esqueça do tratamento de exceções, status de resposta e seus métodos HTTP.

### M1S10 | Ex 6 - Consultar agendamentos

1. Criar endpoints para consultar **TODOS** os agendamentos pertencentes para alunos e tutores.

_Endpoints:_

- **GET** /agendamentos/aluno-id/{alunoId}
- **GET** /agendamentos/tutor-id/{tutorId}

1. Retornar os registros em ordem crescente de data
2. Utilize adequadamente os padrões REST e MVC.


Não se esqueça do tratamento de exceções, status de resposta e seus métodos HTTP.

### M1S10 | Ex 7 - Consultar próximos agendamentos

1. Criar endpoints para consultar **OS PRÓXIMOS** agendamentos pertencentes para alunos e tutores.
2. Criar endpoints distintos para alunos e tutores, assim como o exercício anterior.
3. Retornar os registros em ordem crescente de data
4. Utilize adequadamente os padrões REST e MVC.

Não se esqueça do tratamento de exceções, status de resposta e seus métodos HTTP.