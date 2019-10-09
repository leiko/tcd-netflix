DROP TABLE IF EXISTS ticket;

CREATE TABLE ticket (
  id INT PRIMARY KEY NOT NULL,
  user_id  INT NOT NULL,
  title  VARCHAR(100) NOT NULL,
  description  VARCHAR(500) NOT NULL,
  status  VARCHAR(20) NOT NULL);

INSERT INTO ticket (id, user_id, title, description, status)
VALUES (1, 1, "error", "filme não abre", "open");
INSERT INTO ticket (id, user_id, title, description, status)
VALUES (2, 1, "error 2", "serie não abre", "open");