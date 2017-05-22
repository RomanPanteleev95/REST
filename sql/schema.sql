CREATE TABLE Greeting(
 id int PRIMARY KEY,
 content VARCHAR
);

CREATE TABLE USER (
  id int PRIMARY KEY,
  greeting_id int REFERENCES Greeting(id),
  name varchar(200)
);
INSERT into Greeting VALUES (1, "Solo");