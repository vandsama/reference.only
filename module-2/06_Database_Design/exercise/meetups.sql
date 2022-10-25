
DROP TABLE IF EXISTS event_member;
DROP TABLE IF EXISTS interest_group_member;
DROP TABLE IF EXISTS event;
DROP TABLE IF EXISTS interest_group;
DROP TABLE IF EXISTS member;


CREATE TABLE member(
    member_number serial NOT NULL,
    last_name varchar(100) NOT NULL,
    first_name varchar(100) NOT NULL,
    email varchar(100) NOT NULL,
    phone_number varchar(100) NOT NULL,
    date_of_birth date NOT NULL,
    reminder boolean NOT NULL,
    CONSTRAINT PK_member PRIMARY KEY (member_number)
);

CREATE TABLE interest_group(
    group_number serial NOT NULL unique,
    name varchar(100) NOT NULL,
    CONSTRAINT PK_interest_group PRIMARY KEY (group_number)
);

CREATE TABLE event(
    event_number serial NOT NULL,
    name varchar(100) NOT NULL,
    description varchar(100) NOT NULL,
    start_date_and_time timestamp NOT NULL,
    duration int NOT NULL,
    group_running int NOT NULL,
    CONSTRAINT PK_event PRIMARY KEY (event_number),
    CONSTRAINT FK_event FOREIGN KEY (group_running) REFERENCES interest_group (group_number)
);

CREATE TABLE interest_group_member(
    member_number serial NOT NULL,
    group_number serial NOT NULL,
    CONSTRAINT PK_interest_group_member PRIMARY KEY (group_number,member_number),
    CONSTRAINT FK_interest_group_member_member FOREIGN KEY (member_number) REFERENCES member (member_number),
    CONSTRAINT FK_interest_group_member_group FOREIGN KEY (group_number) REFERENCES interest_group (group_number)
);

CREATE TABLE event_member(
    member_number serial NOT NULL,
    event_number serial NOT NULL,
    CONSTRAINT PK_event_member PRIMARY KEY (member_number,event_number),
    CONSTRAINT FK_event_member_member FOREIGN KEY (member_number) REFERENCES member (member_number),
    CONSTRAINT FK_event_member_event FOREIGN KEY (event_number) REFERENCES event (event_number)
);

-- ALTER TABLE interest_group
--     ADD CONSTRAINT UQ_name UNIQUE (name IN interest_group);

ALTER TABLE event
    ADD CONSTRAINT CHK_duration CHECK (duration >= 30);


INSERT INTO interest_group (name) VALUES
    ('Pokemon'),
    ('LegendOfZelda'),
    ('RubberDucks'),
    ('JewishStudentUnion');

INSERT INTO member (last_name,first_name, email,phone_number,date_of_birth,reminder) VALUES
    ('Smith','John','john.smith@email.com','3334445556','10-10-1990',true),
    ('Smithy','Betty','betty.smith@email.com','3334445557','10-10-1980',true),
    ('Schwartz','Johnny','john.schwartz@email.com','3334445558','10-10-1950',true),
    ('Holloway','Tim','tim.holloway@email.com','3334445559','10-10-1966',true),
    ('Weezer','Marilyn','marilyn.weezer@email.com','3334445577','10-10-1986',true),
    ('Name','Silly','silly.name@email.com','3334445566','10-10-1977',true),
    ('Jetts','Benny','benny.jetts@email.com','3334445588','10-10-1999',true),
    ('Fitzgerald','Zelda','zelda.fitzgerald@email.com','3334445599','10-10-1990',true);

INSERT INTO event (name,description,start_date_and_time,duration,group_running) VALUES
    ('SundayEvent','Describe Sunday here','10-31-2022 09:09:09',60,(Select group_number from interest_group where name = 'Pokemon')),
    ('MondayEvent','Describe Monday here','10-31-2022 10:09:09',60,(Select group_number from interest_group where name = 'LegendOfZelda')),
    ('TuesdayEvent','Describe Tuesday here','10-31-2022 11:09:09',60,(Select group_number from interest_group where name = 'RubberDucks')),
    ('WednesdayEvent','Describe Wednesday here','10-31-2022 12:09:09',60,(Select group_number from interest_group where name = 'JewishStudentUnion'));

INSERT INTO event_member (member_number,event_number) VALUES
    ((Select member_number from member where first_name = 'John'),(Select event_number from event where name = 'SundayEvent')),
    ((Select member_number from member where first_name = 'Betty'),(Select event_number from event where name = 'MondayEvent')),
    ((Select member_number from member where first_name = 'Johnny'),(Select event_number from event where name = 'TuesdayEvent')),
    ((Select member_number from member where first_name = 'Tim'),(Select event_number from event where name = 'WednesdayEvent'));

INSERT INTO interest_group_member (member_number,group_number) VALUES
    ((Select member_number from member where first_name = 'John'),(Select group_number from interest_group where name = 'Pokemon')),
    ((Select member_number from member where first_name = 'Marilyn'),(Select group_number from interest_group where name = 'Pokemon')),
    ((Select member_number from member where first_name = 'Betty'),(Select group_number from interest_group where name = 'LegendOfZelda')),
    ((Select member_number from member where first_name = 'Zelda'),(Select group_number from interest_group where name = 'LegendOfZelda')),
    ((Select member_number from member where first_name = 'Johnny'),(Select group_number from interest_group where name = 'RubberDucks')),
    ((Select member_number from member where first_name = 'Benny'),(Select group_number from interest_group where name = 'RubberDucks')),
    ((Select member_number from member where first_name = 'Tim'),(Select group_number from interest_group where name = 'JewishStudentUnion')),
    ((Select member_number from member where first_name = 'Silly'),(Select group_number from interest_group where name = 'JewishStudentUnion'));



