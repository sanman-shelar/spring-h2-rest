DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS company;

create TABLE company (
 cid VARCHAR(255) NOT NULL PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
);

CREATE TABLE employee (
  eid VARCHAR(255) NOT NULL PRIMARY KEY,
  cid VARCHAR(255) NOT NULL,
  aid VARCHAR(255) NOT NULL,
  name VARCHAR(250) NOT NULL,
  age int NOT NULL,
  foreign key (cid) references company(cid)
);

INSERT INTO company (cid, name) VALUES
  ('100', 'company one'),
  ('101', 'company two');

INSERT INTO employee (eid, cid, aid, name, age) VALUES
  ('1', '100', 'c1', 'John', 22),
  ('2', '100', 'c1', 'Nick', 26),
  ('3', '101', 'c2', 'Peter', 19);