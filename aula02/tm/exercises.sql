SELECT s.title, g.name
FROM series as s
INNER JOIN genres as g ON s.genre_id = g.id;

SELECT CONCAT(a.first_name, ' ', a.last_name), e.title
FROM actors as a
INNER JOIN actor_episode as ac ON a.id = ac.actor_id
INNER JOIN episodes as e ON e.id = ac.episode_id
ORDER BY e.title;

SELECT ser.title, COUNT(sea.title)
FROM series as ser
INNER JOIN seasons as sea ON ser.id = sea.serie_id
GROUP BY ser.title;

SELECT g.name, COUNT(m.title) as countTitle
FROM movies as m
INNER JOIN genres as g ON m.genre_id = g.id
GROUP BY g.name
HAVING countTitle >= 3;

SELECT CONCAT(a.first_name, ' ', a.last_name)
FROM actors as a
INNER JOIN actor_movie as am ON a.id = am.actor_id
INNER JOIN movies as m ON m.id = am.movie_id
WHERE m.title LIKE '%Star%';