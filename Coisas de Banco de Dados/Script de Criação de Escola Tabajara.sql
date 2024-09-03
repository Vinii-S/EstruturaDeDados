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

INSERT INTO campus (nome_Campus, tipo_Campus) values ("Paulo Afonso", "Principal");
INSERT INTO campus (nome_Campus, tipo_Campus) values ("Petrolina", "Principal");
INSERT INTO campus (nome_Campus, tipo_Campus) values ("Paulo Afonso", "Ramificação BTN");
INSERT INTO curso (nome_curso, descricao_curso, tipo_curso, id_campus) values ("Informática", "Curso Técnico de Informática", "Integrado", 1);
INSERT INTO curso (nome_curso,descricao_curso,tipo_curso,id_campus)
VALUES
  ("Eletromecânica","pede. Nunc sed","Integrado",3),
  ("Eletromecânica","Integer tincidunt aliquam","Subsequente",2),
  ("Biocombustíveis","massa non ante","Superior",2),
  ("Análise e desenvolvimento de Sistemas","tristique pharetra. Quisque","Integrado",3),
  ("Eletromecânica","volutpat. Nulla facilisis.","Integrado",3),
  ("Biocombustíveis","sed dui. Fusce","Integrado",3),
  ("Análise e desenvolvimento de Sistemas","eu, placerat eget,","Integrado",2),
  ("Eletromecânica","elit, a feugiat","Superior",2),
  ("Biologia","Vestibulum ante ipsum","Superior",3),
  ("Química","purus sapien, gravida","Subsequente",1);
INSERT INTO endereco (rua_endereco, bairro_endereco, cidade_endereco, estado_endereco, numero_endereco) values
	("Rua da Paz", "Centro", "Paulo Afonso", "Bahia", "110"),
    ("Rua da Felicidade", "Centro", "Paulo Afonso", "Bahia", "444"),
    ("Travessa da harmonia", "Rodoviario", "Petrolina", "Pernambuco", "45"),
    ("Rua são João", "BTN1", "Paulo Afonso", "Bahia", "55A"),
    ("Rua da Origem", "Juarez", "Petrolina", "Pernambuco", "99B"),
    ("Rua Nascer", "Centro", "Petrolina", "Pernambuco", "445");
INSERT INTO aluno (nome_aluno,rg_Aluno,cpf_Aluno,matricula_Aluno,id_endereco)
VALUES
  ("Nasim Neves","05482-04","01413657839","04112",1),
  ("Damon Monteiro","82432-45","86886047563","41847",5),
  ("Hakeem Faria","87055-20","75206711327","57129",5),
  ("Reece Sántos","36987-20","05330846251","68963",5),
  ("Zoe de Barros","63816-85","81728391522","36678",1),
  ("Fitzgerald Chagas","33434-44","72784243231","84362",4);
INSERT INTO professor (nome_Professor,cpf_professor,id_endereco)
VALUES
  ("Uriah Mendes","14592365742",2),
  ("Quinlan Maciel","73462728589",2),
  ("Drew Freire","52462461278",3),
  ("Price Ribeiro","08825759890",3),
  ("Carlos Freitas","18892096132",6),
  ("Haviva Das Neves","23374168423",6);
  INSERT INTO telefonealuno (numero_Telefone_aluno,descricao_telefone_aluno,id_Aluno)
VALUES
  ("(66)99741-5438","ornare, libero at auctor",6),
  ("(57)96295-5453","sed orci lobortis augue",4),
  ("(67)93601-2793","dis parturient",3),
  ("(14)91287-7462","erat. Vivamus nisi.",2),
  ("(43)92452-0174","dolor. Donec",1),
  ("(94)99167-3843","sem ut",5);
  INSERT INTO telefoneprofessor (numero_TelefoneProfessor,descricao_telefoneProfessor,id_Professor)
VALUES
  ("(57)98261-5524","Nunc laoreet lectus",4),
  ("(76)91365-7613","eu, eleifend nec,",3),
  ("(29)91458-3899","posuere cubilia",2),
  ("(67)97473-6785","Nam",5),
  ("(83)93993-5861","mattis. Integer",1),
  ("(81)96645-1187","egestas rhoncus. Proin nisl",6);
  INSERT INTO disciplina (nome_Disciplina,descricao_Disciplina,id_Professor)
VALUES
  ("Meio Ambiente","vulputate velit",2),
  ("Física 2","eu, accumsan sed, facilisis",3),
  ("Matemática","semper cursus. Integer",4),
  ("Matemática","natoque penatibus et",3),
  ("Física 1","varius orci, in",4),
  ("Cálculo 2","massa. Vestibulum",5);
INSERT INTO cursodisciplina (id_Curso,id_Disciplina)
VALUES
  (2,4),
  (14,1),
  (17,5),
  (20,2),
  (16,1),
  (13,3);
INSERT INTO notas (Nota,id_Aluno,id_Disciplina) VALUES
  (9.9,1,4),
  (3,4,1),
  (0,3,5),
  (6.7,6,2),
  (4.4,4,1),
  (7.7,5,3);