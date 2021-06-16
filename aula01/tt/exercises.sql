SELECT * 
FROM cliente as c
WHERE c.id > 5;

SELECT * 
FROM cliente as c
WHERE c.id > 5
ORDER BY created_at DESC;

SELECT * 
FROM cliente as c
WHERE c.id > 5 AND c.type = 'PJ' 
ORDER BY created_at DESC;

SELECT * 
FROM cliente as c
WHERE c.id > 5 AND c.type = 'CPF';

SELECT * 
FROM pedido as p
WHERE p.date BETWEEN '20200101'AND '20200131';

SELECT * 
FROM pedido LIMIT 10;

SELECT DISTINCT(categoria) 
FROM produto;

SELECT SUM(p.valor) 
FROM pedido as p
WHERE p.type = 'renda' 
AND p.id_cliente_fk = 48;

SELECT COUNT(*) 
FROM pedido as p
WHERE p.status = 'cancelado';