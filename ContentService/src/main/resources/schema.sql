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
VALUES (3, "Animação");
INSERT INTO genre (id,  name)
VALUES (4, "Comédia");
INSERT INTO genre (id,  name)
VALUES (5, "Suspense");
INSERT INTO genre (id,  name)
VALUES (6, "Terror");

INSERT INTO content (id,  name, genre, views)
VALUES (1, "Narnia", 1, 33);

INSERT INTO content (id,  name, genre, views)
VALUES (2, "O Regresso", 1, 62);

INSERT INTO content (id,  name, genre, views)
VALUES (3, "The Good Place", 1, 6);

INSERT INTO content (id,  name, genre, views)
VALUES (4, "Vikings", 1, 25);

INSERT INTO content (id,  name, genre, views)
VALUES (5, "Me Before You", 2, 10);

INSERT INTO content (id,  name, genre, views)
VALUES (6, "Orgulho e Preconceito", 2, 16);

INSERT INTO content (id,  name, genre, views)
VALUES (7, "Divertidamente", 3, 52);

INSERT INTO content (id,  name, genre, views)
VALUES (8, "Pets", 3, 30);

INSERT INTO content (id,  name, genre, views)
VALUES (9, "Hora de Aventura", 3, 35);

INSERT INTO content (id,  name, genre, views)
VALUES (10, "Gravity Falls", 3, 8);

INSERT INTO content (id,  name, genre, views)
VALUES (11, "As Branquelas", 4, 40);

INSERT INTO content (id,  name, genre, views)
VALUES (12, "Todo Poderoso", 4, 42);

INSERT INTO content (id,  name, genre, views)
VALUES (13, "Brooklyn Nine Nine", 4, 31);

INSERT INTO content (id,  name, genre, views)
VALUES (14, "Friends", 4, 72);

INSERT INTO content (id,  name, genre, views)
VALUES (15, "Halloween", 5, 26);

INSERT INTO content (id,  name, genre, views)
VALUES (16, "Psicose", 5, 55);

INSERT INTO content (id,  name, genre, views)
VALUES (17, "Stranger Things", 5, 58);

INSERT INTO content (id,  name, genre, views)
VALUES (18, "Dark", 5, 54);

INSERT INTO content (id,  name, genre, views)
VALUES (19, "IT", 6, 27);

INSERT INTO content (id,  name, genre, views)
VALUES (20, "Annabelle", 6, 20);

INSERT INTO content (id,  name, genre, views)
VALUES (21, "Supernatural", 6, 34);

INSERT INTO content (id,  name, genre, views)
VALUES (22, "Marianne", 6, 7);
