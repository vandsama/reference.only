BEGIN TRANSACTION;

DROP TABLE IF EXISTS movie_user;

DROP SEQUENCE IF EXISTS seq_movieuser_id;

-- Sequence to start user_id values at 1001 instead of 1
CREATE SEQUENCE seq_movieuser_id
  INCREMENT BY 1
  START WITH 1001
  NO MAXVALUE;

CREATE TABLE movie_user (
	user_id int NOT NULL DEFAULT nextval('seq_movieuser_id'),
	username varchar(50) NOT NULL,
	password_hash varchar(200) NOT NULL,
	CONSTRAINT PK_tenmo_user PRIMARY KEY (user_id),
	CONSTRAINT UQ_username UNIQUE (username)
);

COMMIT;
