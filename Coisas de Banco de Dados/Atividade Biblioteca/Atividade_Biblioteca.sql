create table Autor(
idAutor int NOT NULL auto_increment primary key,
INDEX(idAutor)
);

create table Editora(
idEditora int not null auto_increment primary key,
nomeEditora  varchar(100) not null,
telefoneEditora varchar(45) not null,
cidadeEditora varchar(45) not null,
emailEditora varchar(45) not null,
INDEX(idEditora)
);

create table Funcionario(
idFuncionario int not null auto_increment primary key,
matricusculasuapFuncionario varchar(45) not null,
nomeFuncionario varchar(100) not null,
telefoneFuncionario varchar(45) not null,
emailFuncionario varchar(50) not null,
loginFuncionario varchar(45) not null,
senhaFuncionario varchar(45) not null,
INDEX(idFuncionario)
);

create table Usuario(
idUsuario int not null auto_increment primary key,
matriculaUsuario varchar(45) not null,
rgUsuario varchar(45) not null,
cpfUsuario varchar(45) not null,
telefoneUsuario varchar(45) not null,
emailUsuario varchar(45) not null,
enderecoUsuario varchar(45) not null,
INDEX(idUsuario)
);

create table Reserva(
idReserva int not null auto_increment primary key,
dataReserva date not null,
situacaoReserva varchar(40) not null,
idUsuario int not null,
idFuncionario int not null,
constraint fk_idReserva_Funcionario foreign key (idFuncionario) references Funcionario(idFuncionario),
constraint fk_idReserva_Usuario foreign key (idUsuario) references Usuario(idUsuario),
INDEX(idReserva)
);

create table Exemplar(
idExemplar int not null auto_increment primary key,
tituloExemplar varchar(100) not null,
classificacaoExemplar varchar(100) not null,
categoriaExemplar varchar(45) not null,
anoPublicacaoExemplar date not null,
idUsuario int not null,
idEditora int not null,
idReserva int not null,
constraint fk_idExemplar_Usuario foreign key (idUsuario) references Usuario(idUsuario),
constraint fk_idExemplar_Editora foreign key (idEditora) references Editora(idEditora),
constraint fk_idExemplar_Reserva foreign key (idReserva) references Reserva(idReserva),
INDEX(idExemplar)
);

create table Locacao(
idLocacao int not null auto_increment primary key,
dataLocacao date not null,
observacaoLocacao varchar(45) not null,
idUsuario int not null,
idEditora int not null,
idExemplar int not null,
constraint fk_idLocacao_Usuario foreign key (idUsuario) references Usuario(idUsuario),
constraint fk_idLocacao_Editora foreign key (idEditora) references Editora(idEditora),
constraint fk_idLocacao_Exemplar foreign key (idExemplar) references Exemplar(idExemplar),
INDEX(idLocacao)
);

create table Devolucao(
idDevolucao int not null auto_increment primary key,
dataDevolucao date not null,
observacaoDevolucao varchar(45) not null,
idFuncionario int not null,
idLocacao int not null,
constraint fk_idDevolucao_Funcionario foreign key (idFuncionario) references Funcionario(idFuncionario),
constraint fk_idDevolucao_Locacao foreign key (idLocacao) references Locacao(idLocacao),
INDEX(idDevolucao)
);


ALTER TABLE `biblioteca`.`usuario` ADD COLUMN `nomeUsuario` VARCHAR(50) NOT NULL AFTER `idUsuario`;
ALTER TABLE `biblioteca`.`autor` add column `nomeAutor` varchar(50) not null;
insert into usuario(nomeUsuario,matriculaUsuario,rgUsuario,cpfUsuario,telefoneUsuario,emailUsuario,enderecoUsuario) values ("Josinaldo Gomes","2020102","12345-09","123456789-00","(77)98812-8765","josi2020@gmail.com","Rua da Concordia, nº90,Centro,Parnaúba");

INSERT INTO autor (nomeAutor)
VALUES
  ("Kelly Messias"),
  ("Neville Santos"),
  ("Xander da Silveira"),
  ("Wesley Pinto"),
  ("Sacha Queiroz");

INSERT INTO editora (nomeEditora, telefoneEditora, cidadeEditora, emailEditora) values ("Varginia","(75)99987-0990","Nuves Douradas", "varginia.edit@gmail.com") ;

ALTER TABLE `biblioteca`.`funcionario` CHANGE COLUMN `matricusculasuapFuncionario` `matriculasuapFuncionario` VARCHAR(45) NOT NULL ;

INSERT INTO funcionario(matriculasuapFuncionario,nomeFuncionario,telefoneFuncionario,emailFuncionario,loginFuncionario,senhaFuncionario) values ("197886", "Juarez Rodrigues", "(75)98865-1121", "juajua@ifba.edu.br", "jua@ifba", "juju1010");

ALTER TABLE `biblioteca`.`exemplar` 
DROP FOREIGN KEY `fk_idExemplar_Reserva`;
ALTER TABLE `biblioteca`.`exemplar` 
DROP COLUMN `idReserva`,
DROP INDEX `fk_idExemplar_Reserva` ;
;
ALTER TABLE `biblioteca`.`Reserva` add column `idExemplar`int not null;