SELECT * FROM luvis.cliente;

-- Dado um funcionário, trazer todos os pedidos dele
SELECT f.nome_Funcionario as NOME_FUNCIONARIO , P.id_pedido as ID_PEDIDO
from Pedido P,Funcionario f 
where f.id_funcionario = P.id_funcionario and
f.id_funcionario = 4;

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
WHERE C.id_Cliente = 1;

-- Listar as mesas que foram reservadas para grupos com mais de X pessoas. SUBQUERY COMO FILTRO:
SELECT C.nome_Cliente as NOME, M.id_mesa as ID_MESA, M.numero_mesa as NUMERO_MESA  FROM Cliente C
WHERE id_Cliente IN (SELECT R.id_Cliente
	FROM Reserva R WHERE R.id_Mesa IN (SELECT M.id_Mesa FROM Mesa M
    WHERE id_Mesa IN (SELECT M.id_Mesa FROM Reserva
WHERE quantidadePessoas_Reserva = 10 )
	)
);