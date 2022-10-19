-- 10. The names of directors who have directed a movie over 3 hours [180 minutes], sorted alphabetically.
-- (15 rows)

SELECT DISTINCT person_name
FROM movie
    JOIN movie_actor ON movie_actor.movie_id = movie.movie_id
	JOIN person ON person.person_id = movie.director_id
WHERE length_minutes > 180 and director_id=person_id
ORDER BY person_name ASC