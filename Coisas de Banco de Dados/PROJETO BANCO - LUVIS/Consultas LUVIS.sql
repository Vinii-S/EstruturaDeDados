-- Dado um funcionário, trazer todos os pedidos dele.
SELECT f.nome_Funcionario as NOME_FUNCIONARIO , P.id_pedido as ID_PEDIDO
from Pedido P,Funcionario f 
where f.id_funcionario = P.id_funcionario and
f.id_funcionario = 1;

-- Listar os pedidos com o número de itens em cada pedido. SUBQUERY COMO COLUNA:
SELECT p.id_Pedido, p.total_Pedido,
	(SELECT SUM(quantidade_Item_Pedido) FROM Item_Pedido
     WHERE Item_Pedido.id_Pedido = p.id_Pedido) AS total_itens
FROM Pedido p;

-- Dado um cliente, trazer os itens que ele pediu. SUBQUERY COMO FONTE DE DADOS:
SELECT I.nome_Item as ITEM, C.nome_Cliente as CLIENTE, C.id_cliente FROM Item I
JOIN Item_Pedido ON I.id_Item = Item_Pedido.id_Item
JOIN Pedido P ON Item_Pedido.id_Pedido = P.id_Pedido
JOIN Cliente C ON P.id_Cliente = C.id_Cliente
WHERE C.id_Cliente = 7;

-- Mesas Ocupadas em um Horário Específico até 2 horas depois. SUBQUERY COMO FILTRO:
SELECT C.nome_Cliente FROM Cliente C
WHERE C.id_Cliente IN (SELECT R.id_Cliente FROM Reserva R
	WHERE data_Reserva = '2024-11-09');
                     
-- Procedure com Parâmetros. Listar Pedidos e Total de Cada um.
DELIMITER $$
CREATE PROCEDURE ListarPedidosTotais()
BEGIN
    SELECT id_Pedido, total_Pedido 
    FROM Pedido;
END $$
DELIMITER ;

-- Procedure com Parâmetros. Reservas com número mínimo de pessoas.
DELIMITER $$
CREATE PROCEDURE ReservasPorNumeroPessoas(IN minimo_pessoas INT)
BEGIN
    SELECT * 
    FROM Reserva 
    WHERE quantidadePessoas_Reserva = minimo_pessoas;
END $$
DELIMITER ;
set @pessoas = 2;
call ReservasPorNumeroPessoas(@pessoas)