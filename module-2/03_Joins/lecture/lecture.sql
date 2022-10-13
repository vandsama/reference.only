
-- 1. The city name, state abbreviation, and population of all cities in the states that border Ohio.
-- The states are: Pennsylvania (PA), West Virginia (WV), Kentucky (KY), Indiana (IN), and Michigan (MI).
-- The city name and state abbreviation should be returned as a single column called 'name_and_state' and should contain values such as "Detroit, MI".
-- Order the results alphabetically by state abbreviation and then by city name.
-- (20 rows)


SELECT (city_name || ', ' || state_abbreviation) as name_and_state, population
FROM city
WHERE state_abbreviation in ('PA', 'WV', 'KY', 'IN', 'MI')
ORDER BY state_abbreviation ASC, city_name ASC;

















-- INNER JOIN

-- Write a query to retrieve the name and state abbreviation for the 2 cities named "Columbus" in the database


-- Modify the previous query to retrieve the names of the states (rather than their abbreviations).
SELECT title, p.person_name
FROM movie AS m
	JOIN person AS p ON m.director_id = p.person_id
	union all 
SELECT count(movie_actor.actor_id)
	FROM movie_actor
		JOIN person ON person.person_id = movie_actor.actor_id
	WHERE deathday IS NULL;

-- Write a query to retrieve the names of all the national parks with their state abbreviations.
-- (Some parks will appear more than once in the results, because they cross state boundaries.)


-- The park_state table is an associative table that can be used to connect the park and state tables.
-- Modify the previous query to retrieve the names of the states rather than their abbreviations.


-- Modify the previous query to include the name of the state's capital city.


-- Modify the previous query to include the area of each park.


-- Write a query to retrieve the names and populations of all the cities in the Midwest census region.


-- Write a query to retrieve the number of cities in the city table for each state in the Midwest census region.


-- Modify the previous query to sort the results by the number of cities in descending order.



-- LEFT JOIN

-- Write a query to retrieve the state name and the earliest date a park was established in that state (or territory) for every record in the state table that has park records associated with it.


-- Modify the previous query so the results include entries for all the records in the state table, even if they have no park records associated with them.



-- UNION

-- Write a query to retrieve all the place names in the city and state tables that begin with "W" sorted alphabetically. (Washington is the name of a city and a state--how many times does it appear in the results?)


-- Modify the previous query to include a column that indicates whether the place is a city or state.























































































































-- MovieDB

-- FULL OUTER JOIN
-- all rows from all tables will be included in the result set. NULL will
-- appear in columns that do not join across
SELECT title, person_name AS person
FROM movie
	FULL OUTER JOIN person ON movie.director_id = person.person_id;
	
-- **movies with the director's name and number of living actors
-- title + director
SELECT m.title, d.person_name AS director, count(a.person_id) AS number_of_living_actors
FROM movie AS m
	JOIN person AS d ON m.director_id = d.person_id
	JOIN movie_actor AS ma ON ma.movie_id = m.movie_id
	JOIN person as a ON ma.actor+id = a.person_id
WHERE a.deathday IS NULL
GROUP BY m.title, d.person_name
	
-- movie + count of living actors
SELECT title, COUNT(actor_id) AS number-of_living_actors
FROM movie_actor
	JOIN person ON person.person_id = movie_actor.actor_id
	JOIN movie ON movie.movie_id = movie_actor.movie_id
WHERE person.deathday IS NULL;
GROUP BY title;

SELECT *
FROM person
WHERE deathday IS null


-- After creating the MovieDB database and running the setup script, make sure it is selected in pgAdmin and confirm it is working correctly by writing queries to retrieve...

-- The names of all the movie genres


-- The titles of all the Comedy movies

