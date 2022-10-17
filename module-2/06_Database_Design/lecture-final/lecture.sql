DROP TABLE IF EXISTS purchases;
DROP TABLE IF EXISTS customers;
DROP TABLE IF EXISTS art;
DROP TABLE IF EXISTS artists;

CREATE TABLE customers 
(
	customer_id	SERIAL NOT NULL PRIMARY KEY
	, name		VARCHAR(50) NOT NULL
	, address	VARCHAR(50) NOT NULL
	, phone		VARCHAR(20) NOT NULL
	
	-- CONSTRAINT pk_customers PRIMARY KEY (customer_id)
);

CREATE TABLE artists
(
	artist_id	SERIAL NOT NULL PRIMARY KEY
	, firstname	VARCHAR(50) NOT NULL
	, lastname	VARCHAR(50) NOT NULL
);

CREATE TABLE art 
(
	art_id		SERIAL NOT NULL PRIMARY KEY
	, title		VARCHAR(50) NOT NULL
	, artist_id INT NOT NULL
	
	, CONSTRAINT fk_art_artist FOREIGN KEY (artist_id) REFERENCES artists (artist_id)
);

CREATE TABLE purchases 
(
	customer_id		INT NOT NULL
	, art_id 		INT NOT NULL
	, purchase_date	TIMESTAMP NOT NULL
	, price			MONEY NOT NULL 
	
	-- table-level constraints
	, CONSTRAINT pk_purchase PRIMARY KEY (customer_id, art_id, purchase_date) -- composite PK
	, CONSTRAINT fk_purchases_customers FOREIGN KEY (customer_id) REFERENCES customers (customer_id)
	, CONSTRAINT fk_purchases_art FOREIGN KEY (art_id) REFERENCES art (art_id)
)

ALTER TABLE purchases
	ADD COLUMN solddate TIMESTAMP NULL;

ALTER TABLE purchases
	ADD CONSTRAINT ck_solddate CHECK (solddate IS NULL OR solddate > purchase_date);
	
SELECT nextval('art_art_id_seq')