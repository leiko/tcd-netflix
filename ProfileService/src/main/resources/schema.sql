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

INSERT INTO user_favorites (user_id, favorites)
VALUES (2, 1);

INSERT INTO user_history (user_id, history)
VALUES (2, "02/10/2019 - IT");
