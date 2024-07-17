	create table Campus(
	id_Campus int NOT NULL auto_increment primary key,
    nome_Campus varchar(50) NOT NULL,
    tipo_Campus varchar(50) NOT NULL
 );
 create table Curso(
	id_Curso int NOT NULL auto_increment primary key,
    nome_Curso varchar(50) NOT NULL,
    descricao_Curso varchar(50) NOT NULL,
    tipo_Curso varchar(50),
    id_Campus int NOT NULL,
    constraint fk_id_Campus_Curso foreign key (id_Campus) references Campus(id_Campus)
 );
 create table Endereco(
	id_Endereco int not null auto_increment primary key,
    rua_Endereco varchar(50) not null,
    bairro_Endereco varchar(50) not null,
    cidade_Endereco varchar(50) not null,
    estado_Endereco varchar(50) not null,
    numero_Endereco varchar(10)
 );
 create table Disciplina(
	id_Disciplina int NOT NULL auto_increment primary key,
    nome_Disciplina varchar(50) NOT NULL,
    descricao_Disciplina varchar(50) NOT NULL,
    id_Professor int NOT NULL,
    constraint fk_id_Professor_Disciplina foreign key (id_Professor) references Professor(id_Professor)
 );
 create table Professor(
	id_Professor int NOT NULL auto_increment primary key,
    nome_Professor varchar(50) NOT NULL,
    cpf_Professor varchar(11) NOT NULL,
    id_Endereco int NOT null,
    constraint fk_id_Endereco_Professor foreign key (id_Endereco) references Endereco(id_Endereco)
 );
 create table CursoDisciplina(
	id_Curso int not null,
    id_Disciplina int not null,
    constraint fk_id_Curso_CursoDisciplina foreign key (id_Curso) references Curso(id_Curso),
    constraint fk_id_Disciplina_CursoDisciplina foreign key (id_Disciplina) references Disciplina(id_Disciplina),
    Primary Key(id_Curso, id_Disciplina)
 );
 create table TelefoneProfessor(
	id_TelefoneProfessor int not null auto_increment primary key,
    numero_TelefoneProfessor int not null,
    descricao_TelefoneProfessor varchar(50) not null,
    id_Professor int NOT NULL,
    constraint fk_id_Professor_TelefoneProfessor foreign key (id_Professor) references Professor(id_Professor)
 );
 
 create table Aluno(
	id_Aluno int not null auto_increment primary key,
    nome_Aluno varchar(50) not null,
    rg_Aluno varchar(11) not null,
    cpf_Aluno varchar(11) not null,
    matricula_Aluno varchar(50) not null,
    id_Endereco int not null,
    constraint fk_id_Endereco_Aluno foreign key (id_Endereco) references Endereco(id_Endereco)
 );
 create table Notas(
	id_Notas int not null auto_increment primary key,
	Nota double not null,
	id_Aluno int not null,
    id_Disciplina int not null,
    constraint fk_id_Aluno_Notas foreign key (id_Aluno) references Aluno(id_Aluno),
    constraint fk_id_Disciplina_Notas foreign key (id_Disciplina) references Disciplina(id_Disciplina)
 );
 create table TelefoneAluno(
	id_Telefone_Aluno int not null auto_increment primary key,
    numero_Telefone_Aluno int not null,
    descricao_Telefone_Aluno varchar(50),
    id_Aluno int not null,
    constraint fk_id_Aluno_Telefone_Aluno foreign key (id_Aluno) references Aluno(id_Aluno)
 );
 INSERT INTO curso (nome_curso, descricao_curso, tipo_curso, id_campus) values ("Informática", "Curso Técnico de Informática", "Integrado", 1);
