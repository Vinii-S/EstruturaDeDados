create database Cemiterio;

create table Cemiterio(
id_Cemiterio int NOT NULL auto_increment primary key,
INDEX(id_Cemiterio)
);

create table Proprietario(
id_Proprietario int NOT NULL auto_increment primary key,
nome_Proprietario varchar(45) NOT NULL,
cpf_Proprietario varchar(50) NOT NULL,
INDEX(id_Proprietario)
);

create table Quadra(
id_Quadra int NOT NULL auto_increment primary key,
tamanho_quadra double,
id_Cemiterio int not null,
constraint fk_idCemiterio_Quadra foreign key (id_Cemiterio) references Cemiterio(id_Cemiterio),
INDEX(id_Quadra)
);

create table Lote(
id_Lote int NOT NULL auto_increment primary key,
tamanho_Lote double,
id_Quadra int not null,
constraint fk_idQuadra_Lote foreign key (id_Quadra) references Quadra(id_Quadra),
INDEX(id_Lote)
);

create table Defunto(
id_Defunto int not null auto_increment primary key,
nome_Defunto varchar(45),
dataObito_Defunto date,
dataNascimento date,
id_Proprietario int not null,
constraint fk_idProprietario_Defunto foreign key (id_Proprietario) references Proprietario(id_Proprietario),
INDEX(id_Defunto)
);

create table Jazigo(
id_Jazigo int not null auto_increment primary key,
id_Lote int not null,
id_Defunto int not null,
constraint fk_idLote_Jazigo foreign key (id_Lote) references Lote(id_Lote),
constraint fk_idDefunto_Jazigo foreign key (id_Defunto) references Defunto(id_Defunto),
INDEX(id_Jazigo)
);

insert into Proprietario(nome_Proprietario,cpf_Proprietario) values ("Josinaldo Dalí", "009.443.221-10");
insert into Proprietario(nome_Proprietario,cpf_Proprietario) values ("Rosivaldo nunes", "112.554.332-98");

ALTER TABLE `cemiterio`.`defunto` 
CHANGE COLUMN `nome_Defunto` `nome_Defunto` VARCHAR(45) NOT NULL ,
CHANGE COLUMN `dataObito_Defunto` `dataObito_Defunto` DATE NOT NULL ,
CHANGE COLUMN `dataNascimento` `dataNascimento_Defunto` DATE NOT NULL ;

insert into Defunto(nome_Defunto,dataObito_Defunto,dataNascimento_Defunto,id_Proprietario) values ("Ronaldo", "2024-01-02", "1990-01-01", 1);

alter table cemiterio add nome_cemiterio varchar(100);

insert into cemiterio(nome_cemiterio) values ("Cemitério Descanse em paz");

ALTER TABLE `cemiterio`.`cemiterio` 
CHANGE COLUMN `nome_cemiterio` `nome_cemiterio` VARCHAR(100) NOT NULL ;

insert into Quadra(tamanho_quadra,id_cemiterio) values (100,1);

insert into Lote(tamanho_lote, id_quadra, id_proprietario) values (5,1,1);

alter table lote add id_proprietario int;
ALTER TABLE lote ADD CONSTRAINT fk_idProprietario_lote FOREIGN KEY (id_proprietario) REFERENCES proprietario(id_proprietario);

insert into Jazigo(id_Lote,id_Defunto) values (1,4);

update proprietario set nome_proprietario = 'Jefferson Siqueira' where id_proprietario=1;

DELETE FROM proprietario where id_Proprietario =2;

