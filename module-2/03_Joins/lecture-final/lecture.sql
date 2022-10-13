
-- one row / one value
SELECT (SELECT AVG(area) FROM park) AS avg_area; -- subquery used as an expression

-- many rows / one value
SELECT state_name
FROM state
WHERE state_abbreviation IN (SELECT state_abbreviation FROM park_state);

-- one row / one value / correlated
SELECT state_name, (SELECT COUNT(*) FROM city WHERE city.state_abbreviation = state.state_abbreviation) AS city_count
FROM state

-- subquery as a table
SELECT name_of_city, area
FROM (
	SELECT city_name AS name_of_city, area
	FROM city
	ORDER BY area DESC
	LIMIT 10) AS top_10_cities
ORDER BY name_of_city;

-- INNER JOIN

-- Write a query to retrieve the name and state abbreviation for the 2 cities named "Columbus" in the database
SELECT city_name, state_abbreviation, --       FK                            PK
	(SELECT state_name FROM state WHERE city.state_abbreviation = state.state_abbreviation) AS state_name
FROM city
WHERE city_name = 'Columbus';

-- Modify the previous query to retrieve the names of the states (rather than their abbreviations).
SELECT city_name, state_abbreviation
FROM city
WHERE city_name = 'Columbus';

SELECT city_name, state.state_abbreviation, state_name
FROM city
	INNER JOIN state ON state.state_abbreviation = city.state_abbreviation
WHERE city_name = 'Columbus';

-- the keyword "INNER" is optional
SELECT city_name, state.state_abbreviation, state_name
FROM city
	JOIN state ON state.state_abbreviation = city.state_abbreviation
WHERE city_name = 'Columbus';

-- table alias with 'AS'
SELECT city_name, s.state_abbreviation, state_name
FROM city AS c
	INNER JOIN state AS s ON s.state_abbreviation = c.state_abbreviation
WHERE city_name = 'Columbus';

-- table alias
SELECT city_name, s.state_abbreviation, state_name
FROM city c
	INNER JOIN state s ON s.state_abbreviation = c.state_abbreviation
WHERE city_name = 'Columbus';


-- Write a query to retrieve the names of all the national parks with their state abbreviations.
-- (Some parks will appear more than once in the results, because they cross state boundaries.)
SELECT park_name, state_abbreviation
FROM park
	JOIN park_state ON park.park_id = park_state.park_id;
	
-- The park_state table is an associative table that can be used to connect the park and state tables.
-- Modify the previous query to retrieve the names of the states rather than their abbreviations.
SELECT park_name, state.state_abbreviation, state_name
FROM park
	JOIN park_state ON park.park_id = park_state.park_id
	JOIN state ON park_state.state_abbreviation = state.state_abbreviation;

-- Modify the previous query to include the name of the state's capital city.
SELECT  park_name, state.state_abbreviation, state_name, city_name AS capital_name
FROM park
	JOIN park_state ON park.park_id = park_state.park_id
	JOIN state ON park_state.state_abbreviation = state.state_abbreviation
	JOIN city ON capital = city.city_id;

-- Modify the previous query to include the area of each park.
SELECT park_name, state.state_abbreviation, state_name, city_name AS capital_name, park.area as park_area
FROM park
	JOIN park_state ON park.park_id = park_state.park_id
	JOIN state ON park_state.state_abbreviation = state.state_abbreviation
	JOIN city ON capital = city.city_id;


-- Write a query to retrieve the names and populations of all the cities in the Midwest census region.
SELECT city_name, city.population
FROM state
	JOIN city ON city.state_abbreviation = state.state_abbreviation
WHERE census_region = 'Midwest';

-- Write a query to retrieve the number of cities in the city table for each state in the Midwest census region.
SELECT state_name, COUNT(city_name) AS number_of_cities
FROM state
	JOIN city ON city.state_abbreviation = state.state_abbreviation
WHERE census_region = 'Midwest'
GROUP BY state_name;

-- Modify the previous query to sort the results by the number of cities in descending order.
SELECT state_name, COUNT(city_name) AS number_of_cities
FROM state
	INNER JOIN city ON city.state_abbreviation = state.state_abbreviation
WHERE census_region = 'Midwest'
GROUP BY state_name
ORDER BY number_of_cities DESC;




-- LEFT JOIN

-- Write a query to retrieve the state name and the earliest date a park was established 
-- in that state (or territory) for every record in the state table that has park records associated with it.
SELECT COUNT(*) FROM state; -- 56 states

SELECT state_name, MIN(date_established) AS earliest_date
FROM state
	JOIN park_state ON state.state_abbreviation = park_state.state_abbreviation
	JOIN park ON park_state.park_id = park.park_id
GROUP BY state_name;


-- Modify the previous query so the results include entries for all the records in the state table, even if they have no park records associated with them.
SELECT state_name, MIN(date_established) AS earliest_date
FROM state
	LEFT JOIN park_state ON state.state_abbreviation = park_state.state_abbreviation
	LEFT OUTER JOIN park ON park_state.park_id = park.park_id
GROUP BY state_name;

SELECT * FROM park_state WHERE state_abbreviation = 'KS';

SELECT state_name, park_id
FROM park_state
	RIGHT JOIN state ON state.state_abbreviation = park_state.state_abbreviation;

-- UNION

-- Write a query to retrieve all the place names in the city and state tables that begin with "W" sorted alphabetically. 
-- (Washington is the name of a city and a state--how many times does it appear in the results?)

SELECT city_name AS place_name
FROM city
WHERE city_name LIKE 'W%'
UNION
SELECT state_name
FROM state
WHERE state_name LIKE 'W%'
ORDER BY place_name;

-- Modify the previous query to include a column that indicates whether the place is a city or state.
SELECT city_name AS place_name, 'city' AS source
FROM city
WHERE city_name LIKE 'W%'
UNION
SELECT state_name, 'state'
FROM state
WHERE state_name LIKE 'W%'
ORDER BY place_name;

-- keep duplicates
SELECT city_name AS place_name
FROM city
WHERE city_name LIKE 'W%'
UNION ALL
SELECT state_name
FROM state
WHERE state_name LIKE 'W%'
ORDER BY place_name;


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
	JOIN person as a ON ma.actor_id = a.person_id
WHERE a.deathday IS NULL
GROUP BY m.title, d.person_name

-- movie + count of living actors
SELECT title, COUNT(actor_id) AS number_of_living_actors
FROM movie_actor 
	JOIN person ON person.person_id = movie_actor.actor_id
	JOIN movie ON movie.movie_id = movie_actor.movie_id
WHERE person.deathday IS NULL
GROUP BY title;

SELECT * 
FROM person
WHERE deathday IS NULL;


	


