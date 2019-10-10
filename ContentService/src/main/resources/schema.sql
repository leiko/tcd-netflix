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
VALUES (3, "O Senhor dos Anéis", 1, 20);

INSERT INTO content (id,  name, genre, views)
VALUES (4, "Harry Potter", 1, 44);

INSERT INTO content (id,  name, genre, views)
VALUES (5, "O Mágico de Oz", 1, 22);

INSERT INTO content (id,  name, genre, views)
VALUES (6, "The Good Place", 1, 6);

INSERT INTO content (id,  name, genre, views)
VALUES (7, "Vikings", 1, 25);

INSERT INTO content (id,  name, genre, views)
VALUES (8, "The 100", 1, 39);

INSERT INTO content (id,  name, genre, views)
VALUES (9, "Sherlock", 1, 70);

INSERT INTO content (id,  name, genre, views)
VALUES (10, "Lost", 1, 50);

INSERT INTO content (id,  name, genre, views)
VALUES (11, "Me Before You", 2, 10);

INSERT INTO content (id,  name, genre, views)
VALUES (12, "Orgulho e Preconceito", 2, 70);

INSERT INTO content (id,  name, genre, views)
VALUES (13, "Podres de Ricos", 2, 50);

INSERT INTO content (id,  name, genre, views)
VALUES (14, "Diário de uma Paixão", 2, 90);

INSERT INTO content (id,  name, genre, views)
VALUES (15, "Titanic", 2, 99);

INSERT INTO content (id,  name, genre, views)
VALUES (16, "Um amor para recordar", 2, 83);

INSERT INTO content (id,  name, genre, views)
VALUES (17, "A culpa é das estrelas", 2, 80);

INSERT INTO content (id,  name, genre, views)
VALUES (18, "Moulin Rouge", 2, 77);

INSERT INTO content (id,  name, genre, views)
VALUES (19, "Amor e Inocência", 2, 71);

INSERT INTO content (id,  name, genre, views)
VALUES (20, "Cartas para Julieta", 2, 66);

INSERT INTO content (id,  name, genre, views)
VALUES (21, "Divertidamente", 3, 52);

INSERT INTO content (id,  name, genre, views)
VALUES (22, "Pets", 3, 30);

INSERT INTO content (id,  name, genre, views)
VALUES (23, "Detona Ralph", 3, 55);

INSERT INTO content (id,  name, genre, views)
VALUES (24, "Wall-E", 3, 33);

INSERT INTO content (id,  name, genre, views)
VALUES (25, "Megamente", 3, 37);

INSERT INTO content (id,  name, genre, views)
VALUES (26, "Hora de Aventura", 3, 35);

INSERT INTO content (id,  name, genre, views)
VALUES (27, "Gravity Falls", 3, 10);

INSERT INTO content (id,  name, genre, views)
VALUES (28, "Os Simpsons", 3, 41);

INSERT INTO content (id,  name, genre, views)
VALUES (29, "Pokémon", 3, 46);

INSERT INTO content (id,  name, genre, views)
VALUES (30, "Aggretsuko", 3, 18);

INSERT INTO content (id,  name, genre, views)
VALUES (31, "As Branquelas", 4, 40);

INSERT INTO content (id,  name, genre, views)
VALUES (32, "Todo Poderoso", 4, 42);

INSERT INTO content (id,  name, genre, views)
VALUES (33, "Agente 86", 4, 36);

INSERT INTO content (id,  name, genre, views)
VALUES (34, "O Auto da Compadecida", 4, 77);

INSERT INTO content (id,  name, genre, views)
VALUES (35, "Gente Grande", 4, 13);

INSERT INTO content (id,  name, genre, views)
VALUES (36, "Brooklyn Nine Nine", 4, 31);

INSERT INTO content (id,  name, genre, views)
VALUES (37, "Friends", 4, 72);

INSERT INTO content (id,  name, genre, views)
VALUES (38, "The Big Bang Theory", 4, 60);

INSERT INTO content (id,  name, genre, views)
VALUES (39, "How I Met Your Mother", 4, 53);

INSERT INTO content (id,  name, genre, views)
VALUES (40, "Um Maluco no Pedaço", 4, 58);

INSERT INTO content (id,  name, genre, views)
VALUES (41, "Halloween", 5, 26);

INSERT INTO content (id,  name, genre, views)
VALUES (42, "Psicose", 5, 55);

INSERT INTO content (id,  name, genre, views)
VALUES (43, "Corra", 5, 59);

INSERT INTO content (id,  name, genre, views)
VALUES (44, "Garota Exemplar", 5, 17);

INSERT INTO content (id,  name, genre, views)
VALUES (45, "Bird Box", 5, 21);

INSERT INTO content (id,  name, genre, views)
VALUES (46, "Stranger Things", 5, 58);

INSERT INTO content (id,  name, genre, views)
VALUES (47, "Dark", 5, 54);

INSERT INTO content (id,  name, genre, views)
VALUES (48, "Bates Motel", 5, 79);

INSERT INTO content (id,  name, genre, views)
VALUES (49, "Hannibal", 5, 38);

INSERT INTO content (id,  name, genre, views)
VALUES (50, "Dexter", 5, 24);

INSERT INTO content (id,  name, genre, views)
VALUES (51, "IT", 6, 27);

INSERT INTO content (id,  name, genre, views)
VALUES (52, "Annabelle", 6, 20);

INSERT INTO content (id,  name, genre, views)
VALUES (53, "O Iluminado", 6, 33);

INSERT INTO content (id,  name, genre, views)
VALUES (54, "Invocação do Mal", 6, 49);

INSERT INTO content (id,  name, genre, views)
VALUES (55, "Atividade Paranormal", 6, 56);

INSERT INTO content (id,  name, genre, views)
VALUES (56, "Supernatural", 6, 34);

INSERT INTO content (id,  name, genre, views)
VALUES (57, "Marianne", 6, 7);

INSERT INTO content (id,  name, genre, views)
VALUES (58, "A Maldição da Residência Hill", 6, 36);

INSERT INTO content (id,  name, genre, views)
VALUES (59, "American Horro Story", 6, 88);

INSERT INTO content (id,  name, genre, views)
VALUES (60, "Penny Dreadful", 6, 40);
