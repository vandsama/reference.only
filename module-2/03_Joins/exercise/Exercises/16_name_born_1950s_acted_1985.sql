-- 16. The names and birthdays of actors born in the 1950s who acted in movies that were released in 1985.
-- Order the results by actor from oldest to youngest.
-- (20 rows)

SELECT DISTINCT person_name, birthday
FROM movie
	JOIN movie_actor ON movie_actor.movie_id = movie.movie_id
	JOIN person ON person.person_id = movie_actor.actor_id
WHERE birthday BETWEEN '19500101' AND '19591231' and release_date BETWEEN '19850101' AND '19851231'
ORDER BY birthday ASC