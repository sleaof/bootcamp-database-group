# bootcamp-database-group

----------------- 02 TM ------------------------




------------------ 02 TT ------------------------

-- 001 
Normalização é o processo de organização de dados em um banco de dados. Isso inclui a criação de tabelas e o estabelecimento de relações entre essas tabelas de acordo com as regras projetadas para proteger os dados e tornar o banco de dados mais flexível, eliminando a redundância e a dependência inconsistente.



-- 002 
INSERT INTO movies (created_at, updated_at, title, rating, awards, release_date, length, genre_id)
VALUES(
	null,
    null,
    "Guia mochileiro das Galaxias",
    8.9,
    5,
    CURRENT_TIMESTAMP,
    120,
    5
);


-- 003
INSERT INTO genres (created_at, updated_at, name, ranking, active)
VALUES(
	null,
    null,
    "Sci-fi",
    14,
    1
);

-- 004
UPDATE movies
SET genre_id = 13
WHERE id = 22;

-- 005
UPDATE actors
SET favorite_movie_id =  22
WHERE id = 1;


-- 006
CREATE TEMPORARY TABLE temp_movies 
AS SELECT * FROM movies;

-- 007
DELETE FROM temp_movies
WHERE awards < 5;

-- 008
SELECT A.name, count(B.title)
FROM genres AS A 
INNER JOIN temp_movies AS B ON A.id = B.genre_id
GROUP BY A.name;


-- 009
SELECT DISTINCT concat(B.first_name," ", B.last_name), (C.title)
FROM actor_movie AS A
INNER JOIN actors AS B ON A.actor_id = B.id
INNER JOIN movies AS C ON C.id = B.id
WHERE C.awards > 3


-- 10
EXPLAIN SELECT * FROM temp_movies;
'1','SIMPLE','temp_movies',NULL,'ALL',NULL,NULL,NULL,NULL,'22','100.00',NULL


EXPLAIN DELETE FROM temp_movies
WHERE awards < 5;
'1','DELETE','temp_movies',NULL,'ALL',NULL,NULL,NULL,NULL,'22','100.00','Using where'



-- 11
Indicie sao mecanismos de otimizacao de consultas SQL


-- 12
CREATE INDEX index_name_idx
ON movies (title);

'movies','1','index_name_idx','1','title','A','22',NULL,NULL,'','BTREE','','','YES',NULL




