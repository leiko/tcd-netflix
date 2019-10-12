DROP TABLE IF EXISTS history;
DROP TABLE IF EXISTS user_favorites;
DROP TABLE IF EXISTS user_list;
DROP TABLE IF EXISTS user_history;
DROP TABLE IF EXISTS user;
 
CREATE TABLE user (
  id INT PRIMARY KEY NOT NULL,
  name  VARCHAR(100) NOT NULL);
  
CREATE TABLE user_list (
  user_id INT NOT NULL,
  list  INT NOT NULL);
  
CREATE TABLE user_favorites (
  user_id INT  NOT NULL,
  favorites  INT NOT NULL);
  
CREATE TABLE user_history (
  user_id  INT NOT NULL,
  history  VARCHAR(100) NOT NULL);
  

INSERT INTO user (id,  name)
VALUES (1, "Paulo");

INSERT INTO user (id,  name)
VALUES (2, "Ana");

INSERT INTO user (id,  name)
VALUES (3, "Sérgio");

INSERT INTO user (id,  name)
VALUES (4, "Mariana");

INSERT INTO user (id,  name)
VALUES (5, "Márcio");

INSERT INTO user (id,  name)
VALUES (6, "Maria");

INSERT INTO user (id,  name)
VALUES (7, "Eduardo");

INSERT INTO user (id,  name)
VALUES (8, "Ana");

INSERT INTO user (id,  name)
VALUES (9, "Luiza");

INSERT INTO user (id,  name)
VALUES (10, "José");

INSERT INTO user_list (user_id, list)
VALUES (1, 1);

INSERT INTO user_list (user_id, list)
VALUES (1, 14);

INSERT INTO user_list (user_id, list)
VALUES (1, 22);

INSERT INTO user_list (user_id, list)
VALUES (1, 54);

INSERT INTO user_list (user_id, list)
VALUES (1, 41);

INSERT INTO user_list (user_id, list)
VALUES (1, 39);

INSERT INTO user_list (user_id, list)
VALUES (2, 1);

INSERT INTO user_list (user_id, list)
VALUES (3, 23);

INSERT INTO user_list (user_id, list)
VALUES (3, 38);

INSERT INTO user_list (user_id, list)
VALUES (3, 43);

INSERT INTO user_list (user_id, list)
VALUES (3, 2);

INSERT INTO user_list (user_id, list)
VALUES (4, 10);

INSERT INTO user_list (user_id, list)
VALUES (3, 60);

INSERT INTO user_list (user_id, list)
VALUES (5, 4);

INSERT INTO user_list (user_id, list)
VALUES (5, 44);

INSERT INTO user_list (user_id, list)
VALUES (5, 8);

INSERT INTO user_list (user_id, list)
VALUES (6, 36);

INSERT INTO user_list (user_id, list)
VALUES (6, 33);

INSERT INTO user_list (user_id, list)
VALUES (6, 3);

INSERT INTO user_list (user_id, list)
VALUES (6, 57);

INSERT INTO user_list (user_id, list)
VALUES (6, 51);

INSERT INTO user_list (user_id, list)
VALUES (7, 9);

INSERT INTO user_list (user_id, list)
VALUES (7, 15);

INSERT INTO user_list (user_id, list)
VALUES (7, 18);

INSERT INTO user_list (user_id, list)
VALUES (7, 14);

INSERT INTO user_list (user_id, list)
VALUES (8, 30);

INSERT INTO user_list (user_id, list)
VALUES (9, 10);

INSERT INTO user_list (user_id, list)
VALUES (9, 23);

INSERT INTO user_list (user_id, list)
VALUES (9, 35);

INSERT INTO user_list (user_id, list)
VALUES (9, 46);

INSERT INTO user_list (user_id, list)
VALUES (10, 4);

INSERT INTO user_list (user_id, list)
VALUES (10, 2);

INSERT INTO user_list (user_id, list)
VALUES (10, 3);

INSERT INTO user_list (user_id, list)
VALUES (10, 7);

INSERT INTO user_favorites (user_id, favorites)
VALUES (1, 1);

INSERT INTO user_favorites (user_id, favorites)
VALUES (1, 41);

INSERT INTO user_favorites (user_id, favorites)
VALUES (2, 1);

INSERT INTO user_favorites (user_id, favorites)
VALUES (3, 23);

INSERT INTO user_favorites (user_id, favorites)
VALUES (3, 38);

INSERT INTO user_favorites (user_id, favorites)
VALUES (3, 43);

INSERT INTO user_favorites (user_id, favorites)
VALUES (3, 2);

INSERT INTO user_favorites (user_id, favorites)
VALUES (3, 60);

INSERT INTO user_favorites (user_id, favorites)
VALUES (5, 4);

INSERT INTO user_favorites (user_id, favorites)
VALUES (5, 44);

INSERT INTO user_favorites (user_id, favorites)
VALUES (5, 8);

INSERT INTO user_favorites (user_id, favorites)
VALUES (7, 15);

INSERT INTO user_favorites (user_id, favorites)
VALUES (7, 14);

INSERT INTO user_favorites (user_id, favorites)
VALUES (8, 30);

INSERT INTO user_favorites (user_id, favorites)
VALUES (9, 10);

INSERT INTO user_favorites (user_id, favorites)
VALUES (9, 35);

INSERT INTO user_favorites (user_id, favorites)
VALUES (10, 4);

INSERT INTO user_favorites (user_id, favorites)
VALUES (10, 2);

INSERT INTO user_favorites (user_id, favorites)
VALUES (10, 3);

INSERT INTO user_favorites (user_id, favorites)
VALUES (10, 7);

INSERT INTO user_history (user_id, history)
VALUES (1, "10/01/2019 - Supernatural");

INSERT INTO user_history (user_id, history)
VALUES (1, "22/05/2019 - Moulin Rouge");

INSERT INTO user_history (user_id, history)
VALUES (1, "24/08/2019 - Corra");

INSERT INTO user_history (user_id, history)
VALUES (2, "02/10/2019 - IT");

INSERT INTO user_history (user_id, history)
VALUES (3, "14/10/2019 - Friends");

INSERT INTO user_history (user_id, history)
VALUES (3, "01/10/2019 - Psicose");

INSERT INTO user_history (user_id, history)
VALUES (4, "24/06/2019 - Pets");

INSERT INTO user_history (user_id, history)
VALUES (5, "30/03/2019 - Sherlock");

INSERT INTO user_history (user_id, history)
VALUES (5, "05/05/2019 - Hannibal");

INSERT INTO user_history (user_id, history)
VALUES (5, "20/06/2019 - Dexter");

INSERT INTO user_history (user_id, history)
VALUES (5, "03/08/2019 - Vikings");

INSERT INTO user_history (user_id, history)
VALUES (6, "05/04/2019 - Narnia");

INSERT INTO user_history (user_id, history)
VALUES (7, "31/01/2019 - Titanic");

INSERT INTO user_history (user_id, history)
VALUES (8, "13/03/2019 - As Branquelas");

INSERT INTO user_history (user_id, history)
VALUES (8, "08/08/2019 - Detona Ralph");

INSERT INTO user_history (user_id, history)
VALUES (8, "10/09/2019 - Bird Box");

INSERT INTO user_history (user_id, history)
VALUES (9, "13/12/2018 - Divertidamente");

INSERT INTO user_history (user_id, history)
VALUES (10, "04/08/2019 - Dark");

INSERT INTO user_history (user_id, history)
VALUES (10, "25/08/2019 - Podres de Ricos");
