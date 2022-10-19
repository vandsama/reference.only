-- 2. The names and birthdays of actors in "The Fifth Element"
-- Order the results alphabetically (A-Z) by name.
-- (15 rows)

SELECT person_name, birthday
FROM movie
    JOIN movie_actor ON movie_actor.movie_id = movie.movie_id
	JOIN person ON person.person_id = movie_actor.actor_id
WHERE title = 'The Fifth Element'
ORDER BY person_name ASC;