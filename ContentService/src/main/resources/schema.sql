DROP TABLE IF EXISTS genre;
DROP TABLE IF EXISTS content;

CREATE TABLE genre (
  id INT PRIMARY KEY NOT NULL,
  name  VARCHAR(100) NOT NULL );
  
  
CREATE TABLE content (
  id INT PRIMARY KEY NOT NULL,
  name  VARCHAR(100) NOT NULL, 
  genre  INT NOT NULL,
  views  INT NOT NULL );
  

INSERT INTO genre (id,  name)
VALUES (1, "Aventura");
INSERT INTO genre (id,  name)
VALUES (2, "Romance");
INSERT INTO genre (id,  name)
VALUES (3, "Fantasia");

INSERT INTO content (id,  name, genre, views)
VALUES (1, "Narnia", 1, 33);