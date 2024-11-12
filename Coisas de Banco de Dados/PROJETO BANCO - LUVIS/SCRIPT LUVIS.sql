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
    descricao_Item varchar(50),
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
    dataHora_Reserva datetime not null,
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