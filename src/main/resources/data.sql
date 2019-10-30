DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  eid VARCHAR(255) NOT NULL PRIMARY KEY,
  aid VARCHAR(255) NOT NULL,
  name VARCHAR(250) NOT NULL,
  age int NOT NULL
);

INSERT INTO employee (eid, aid, name, age) VALUES
  ('1', '100', 'John', 22),
  ('2', '100', 'Nick', 26),
  ('3', '101', 'Peter', 19);