-- 12. Create a "Bill Murray Collection" in the collection table. For the movies that have Bill Murray in them, set their collection ID to the "Bill Murray Collection". (1 row, 6 rows)

INSERT INTO collection (collection_name)
VALUES ('Bill Murray Collection');

UPDATE movie
SET collection_id = (SELECT collection_id FROM collection WHERE collection_name = 'Bill Murray Collection')
WHERE MOVIE_ID IN (
	SELECT movie.MOVIE_ID FROM movie
		JOIN movie_actor ON movie_actor.movie_id = movie.movie_id
		JOIN person ON person.person_id = movie_actor.actor_id
	WHERE person_name = 'Bill Murray');
