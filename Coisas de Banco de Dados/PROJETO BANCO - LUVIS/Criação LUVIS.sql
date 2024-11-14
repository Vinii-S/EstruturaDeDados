CREATE SCHEMA `luvis` ;

create table Cliente (
	id_Cliente int not null primary key auto_increment,
    nome_Cliente varchar(50) not null,
    telefone_Cliente varchar(45) not null,
    email_Cliente varchar(50) not null
);

create table Mesa(
	id_Mesa int not null primary key auto_increment,
    numero_Mesa int not null,
    capacidade_Mesa int not null
);

create table Item(
	id_Item int not null primary key auto_increment,
    nome_Item varchar(100) not null,
    descricao_Item varchar(150),
    preco_Item float not null,
    categoria_Item varchar(50)
);

create table Funcionario(
	id_Funcionario int not null primary key auto_increment,
    nome_Funcionario varchar(50) not null,
    cargo_Funcionario varchar(50) not null,
    telefone_Funcionario varchar(50) not null,
    email_Funcionario varchar(50) not null,
    cpf_funcionario varchar(50) not null
);

create table Reserva(
	id_Reserva int not null primary key auto_increment,
    data_Reserva date not null,
    hora_Reserva time not null,
    quantidadePessoas_Reserva int not null,
    id_Cliente int not null,
    id_Mesa int not null,
    constraint fk_id_Cliente_Reserva 
    foreign key (id_Cliente) references Cliente(id_Cliente),
    constraint fk_id_Mesa_Reserva 
    foreign key (id_Mesa) references Mesa(id_Mesa)
);

create table Pedido(
	id_Pedido int not null primary key auto_increment,
    dataHora_Pedido datetime not null,
    total_Pedido float not null,
    id_Cliente int not null,
    id_Mesa int not null,
    id_Funcionario int not null,
    constraint fk_id_Cliente_Pedido 
    foreign key (id_Cliente) references Cliente(id_Cliente),
    constraint fk_id_Mesa_Pedido 
    foreign key (id_Mesa) references Mesa(id_Mesa),
    constraint fk_id_Funcionario_Pedido
    foreign key (id_Funcionario) references funcionario(id_Funcionario)
);

create table Item_Pedido(
	id_Item int not null,
    id_Pedido int not null,
    quantidade_Item_Pedido int not null,
    constraint fk_id_Item_Item_Pedido 
    foreign key (id_Item) references Item(id_Item),
    constraint fk_id_Pedido_Item_Pedido 
    foreign key (id_Pedido) references Pedido(id_Pedido),
    Primary key (id_Item, id_Pedido)
);

INSERT INTO cliente (nome_Cliente,telefone_Cliente,email_Cliente)
VALUES
  ("Christian Figueiredo","(45)66179-4251","ipsum.suspendisse@yahoo.net"),
  ("Raya Matias","(78)48806-4954","ipsum.curabitur@google.org"),
  ("Hyatt Faria","(78)68631-1752","quis.tristique.ac@icloud.net"),
  ("Stephen Marinho","(98)33867-6587","orci.luctus@icloud.com"),
  ("Amir Firmino","(04)41504-0464","luctus.curabitur@hotmail.ca"),
  ("Eve Xavier","(24)35265-0068","mauris@yahoo.edu"),
  ("Amy de Sousa","(22)82350-9274","inceptos.hymenaeos.mauris@icloud.net");
  INSERT INTO Funcionario (nome_Funcionario,cargo_Funcionario,telefone_Funcionario,email_Funcionario,cpf_Funcionario)
VALUES
  ("Christian Figueiredo","Chef","(45)66179-4251","ipsum.suspendisse@yahoo.net","612.238.785-07"),
  ("Raya Matias","Caixa","(78)48806-4954","ipsum.curabitur@google.org","552.567.366-26"),
  ("Hyatt Faria","Chef","(78)68631-1752","quis.tristique.ac@icloud.net","442.614.389-84"),
  ("Stephen Marinho","Garçom","(98)33867-6587","orci.luctus@icloud.com","920.157.727-34"),
  ("Amir Firmino","Chef","(04)41504-0464","luctus.curabitur@hotmail.ca","552.795.194-11"),
  ("Eve Xavier","Chef","(24)35265-0068","mauris@yahoo.edu","770.287.426-50"),
  ("Amy de Sousa","Garçom","(22)82350-9274","inceptos.hymenaeos.mauris@icloud.net","432.471.811-87");
  
INSERT INTO item (nome_Item,descricao_Item,preco_Item, categoria_Item)
VALUES 
("Pão & Manteiga","SUGERIMOS PARA ACOMPANHAR OS PRATOS ",22.00,"Entrada"),
("Canapé de carpaccio","TORRADA FINÍSSIMA, FATIAS DE CARPACCIO, MOLHO CIPRIANI",16.00,"Entrada"),
("Peixe fresco AllAcquapazza ","SUCULENTO E PERFUMADO, COM AZEITONAS TAGGIASCA, ALCAPARRINHAS, TOMATES, ERVA DOCE & ATOL",149.00,"Principal"),
("Peixe fresco grelhado","MOLHO HOLLANDAISE, ALHO PORÓ CONFIT & PALMITO ",158.00,"Principal"),
("Mousse de chocolate amargo","MOUSSE DE CHOCOLATE AMARGO, GRAND MARNIER & LARANJINHA CONFIT  ",12.00,"Sobremesa"),
("Crème caramel","COM CHANTILLY & AMARENA ",29.00,"Sobremesa"),
("Soda Italiana"," MORANGO, LIMÃO, MAÇA VERDE OU LARANJA",15.00,"Bebida"),
("Refrigerante lata -350 mL","COCA-COLA, GUARANÁ, PEPSI, SODA,FANTA",5.00,"Bebida"),
("Refrigerante 2L","COCA-COLA, GUARANÁ, PEPSI, SODA, FANTA",13.00,"Bebida"),
("Água mineral -500mL","ÁGUA MINERAL",4.00,"Bebida"),
("Cerveja -600mL","AMSTEL,SPATEN,HEINEKEN,BRAHMA,BUDWEISER",16.00,"Bebida");

INSERT INTO mesa (numero_mesa,capacidade_mesa)
VALUES 
(1,6),
(2,6),
(3,2),
(4,3),
(5,6),
(6,10);

INSERT INTO reserva (data_reserva,hora_Reserva,quantidadePessoas_reserva,id_cliente,id_mesa)
VALUES
 ("2024-09-11","13:00:00",3,1,4),
("2024-09-14","14:30:00",2,3,1),
("2024-11-09","15:00:00",1,4,2);


INSERT INTO pedido (dataHora_pedido,total_pedido,id_cliente,id_mesa,id_funcionario)
VALUES
("2024-10-15 13:00:00",240.00, 3, 4, 3),
("2024-10-15 14:20:00",150.00, 2, 3, 2),
("2024-10-15 19:15:00",512.00, 4, 1, 4),
("2024-10-15 20:30:00",350.00, 1, 2, 1);

INSERT INTO pedido (dataHora_pedido,total_pedido,id_cliente,id_mesa,id_funcionario)
VALUES ("2024-10-15 12:30:00",100.00, 7, 6, 4);


INSERT INTO item_pedido (id_item,id_pedido,quantidade_item_pedido)
VALUES
(12,2,2),
(22,1,2),
(32,3,4),
(19,4,5);
