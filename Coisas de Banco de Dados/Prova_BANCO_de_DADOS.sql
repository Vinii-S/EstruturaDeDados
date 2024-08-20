Create table Empresa(
idEmpresa int not null auto_increment primary key,
nomeEmpresa varchar(120) not null,
tipo varchar(45) not null,
INDEX(idEmpresa)
);

Create Table Endereco(
idEndereco int not null auto_increment primary key,
ruaEndereco varchar(100) not null,
numeroEndereco varchar(10) not null,
bairroEndereco varchar(50) not null,
cidadeEndereco varchar(50) not null,
EstadoEndereco varchar(50) not null,
INDEX(idEndereco)
);

Create Table Cliente(
idCliente int not null auto_increment primary key,
nomeCliente varchar(120) not null,
cpfCliente varchar(20) not null,
telefoneCliente varchar(15) not null,
idEndereco int not null,
constraint fk_idEndereco_Cliente foreign key (idEndereco) references Endereco(idEndereco),
INDEX(idCliente)
);

create table Servico (
idServico int not null auto_increment primary key,
nomeServico varchar(45) not null,
recursoServico varchar(200) not null,
INDEX(idServico)
);

create table Departamento(
idDepartamento int not null auto_increment primary key,
nomeDepartamento varchar(45) not null,
descricaoDepartamento varchar(150) not null,
idEmpresa int not null,
constraint fk_idEmpresa_Funcionario foreign key (idEmpresa) references Empresa(idEmpresa),
INDEX(idDepartamento)
);

create table Funcionario(
idFuncionario int not null auto_increment primary key,
nomeFuncionario varchar(120) not null,
cpfFuncionario varchar(15) not null,
telefoneFuncionario varchar(15) not null,
idEndereco int not null,
idDepartamento int not null,
constraint fk_idEndereco_Funcionario foreign key (idEndereco) references Endereco(idEndereco),
constraint fk_idDepartamento_Funcionario foreign key (idDepartamento) references Departamento(idDepartamento),
INDEX(idFuncionario)
);

create table OS (
idOS int not null auto_increment primary key,
dataSolicitacaoOS varchar(20) not null,
dataPrevisaoOS varchar(20) not null,
respostaOS varchar(50) not null,
idFuncionario int not null,
idDepartamento int not null,
idCliente int not null,
constraint fk_idFuncionario_OS foreign key (idFuncionario) references Funcionario(idFuncionario),
constraint fk_idDepartamento_OS foreign key (idDepartamento) references Departamento(idDepartamento),
constraint fk_idCliente_OS foreign key (idCliente) references Cliente(idCliente),
INDEX(idOS)
);

create table ItensOS (
idServico int not null,
idOS int not null,
constraint fk_idServico_ItensOS foreign key (idServico) references Servico(idServico),
constraint fk_idOS_IntensOS foreign key (idOS) references OS(idOS),
Primary Key(idServico, idOS),
INDEX(idServico,idOS)
);

alter table Cliente add RgCliente varchar(11);
alter table funcionario add RgFuncionario varchar(11);
ALTER TABLE `empresa` CHANGE COLUMN `tipoEMpresa` `tipoEmpresa` VARCHAR(45) NOT NULL;

 insert into Empresa(nomeEmpresa, tipoEmpresa) values ("JK Technologys", "Matriz");
 insert into Empresa(nomeEmpresa, tipoEmpresa) values ("JK Technologys", "Filial");
 insert into Empresa(nomeEmpresa, tipoEmpresa) values ("AmazingT", "Matriz");
 insert into Empresa(nomeEmpresa, tipoEmpresa) values ("BigB", "Filial");
 
 insert into Endereco(ruaEndereco,numeroEndereco,bairroEndereco,cidadeEndereco,estadoEndereco) values ("Rua da Alegria", "20", "Centro", "Barreiras", "Bahia");
 insert into Endereco(ruaEndereco,numeroEndereco,bairroEndereco,cidadeEndereco,estadoEndereco) values ("Rua da Facada", "55", "Redondel", "Barreiras", "Bahia");
 insert into Endereco(ruaEndereco,numeroEndereco,bairroEndereco,cidadeEndereco,estadoEndereco) values ("Rua Margarida", "330", "Bulbo", "Barreiras", "Bahia");
 insert into Endereco(ruaEndereco,numeroEndereco,bairroEndereco,cidadeEndereco,estadoEndereco) values ("Rua da Pizza", "200", "Centro", "Barreiras", "Bahia");
 insert into Endereco(ruaEndereco,numeroEndereco,bairroEndereco,cidadeEndereco,estadoEndereco) values ("Avenida Beira Rio", "400", "Centro", "Rio de Janeiro", "Rio de Janeiro");
 insert into Endereco(ruaEndereco,numeroEndereco,bairroEndereco,cidadeEndereco,estadoEndereco) values ("Rua da Luz", "10", "General Brito", "Mossoró", "Sao Paulo");
 insert into Endereco(ruaEndereco,numeroEndereco,bairroEndereco,cidadeEndereco,estadoEndereco) values ("Rua da Criacao", "350", "Centro", "Fortaleza", "Ceara");
 
 
insert into Cliente(nomeCliente,cpfCliente,TelefoneCliente,idEndereco,RgCliente) values ("Josinaldo Borges", "112.345.786-76", "(77)98761-1212",1,"12131-44");
insert into Cliente(nomeCliente,cpfCliente,TelefoneCliente,idEndereco,RgCliente) values ("Reginaldo Silva", "134.676.995-77", "(77)96678-8612",2,"6665-98");
insert into Cliente(nomeCliente,cpfCliente,TelefoneCliente,idEndereco,RgCliente) values ("Tiao Pinto", "596-887-775-09", "(75)98881-2424",3,"12345-77");

insert into Departamento(NomeDepartamento, descricaoDepartamento,idEmpresa) values ("TI", "Departamento de TI da JK Technologys Matriz",1 );
insert into Departamento(NomeDepartamento, descricaoDepartamento,idEmpresa) values ("Financeiro", "Departamento Financeiro da JK Technologys Matriz",1 );
insert into Departamento(NomeDepartamento, descricaoDepartamento,idEmpresa) values ("TI", "Departamento de TI da JK Technologys Filial",2 );
insert into Departamento(NomeDepartamento, descricaoDepartamento,idEmpresa) values ("Marketing", "Departamento de Marketing da BigB Filial",4 );

insert into Funcionario(nomeFuncionario,cpfFuncionario,telefoneFuncionario,idEndereco,idDepartamento,rgFuncionario) values ("Matheus Barros","123.456.775-09", "(77)98845-9987", 4,1,"5453-09");
insert into Funcionario(nomeFuncionario,cpfFuncionario,telefoneFuncionario,idEndereco,idDepartamento,rgFuncionario) values ("Joao Nunes","546.665.885-98", "(75)95584-9998", 6,2,"4448-99");
insert into Funcionario(nomeFuncionario,cpfFuncionario,telefoneFuncionario,idEndereco,idDepartamento,rgFuncionario) values ("Wesley Nascimento","844.665.668-99", "(77)94445-9987", 5,3,"5446-99");

insert into Servico(nomeServico,recursoServico) values ("Suporte Tecnico", "Ajudar com manutencao de coisas");
insert into Servico(nomeServico,recursoServico) values ("Marketing", "Divulgar noivdades da empresa");

insert into OS(dataSolicitacaoOS,dataPrevisaoOS,respostaOS,idFuncionario,idDepartamento,idCliente) values ("20/12/2020","22/01/2021","Dificil de Fazer",1,1,1);
insert into OS(dataSolicitacaoOS,dataPrevisaoOS,respostaOS,idFuncionario,idDepartamento,idCliente) values ("20/07/2024","22/09/2024","Criar a Divulgacao do Banner",2,4,2);

insert into ItensOS(idServico,idOS) values (1,1);
insert into ItensOS(idServico,idOS) values (2,2);

update Empresa set nomeEmpresa = 'Big Boy' where idEmpresa=4;

delete from Cliente where idCliente=3;

SELECT * FROM sistema_os.cliente;
SELECT * FROM sistema_os.empresa;