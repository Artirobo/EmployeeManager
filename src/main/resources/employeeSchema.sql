DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee (
                              id LONG AUTO_INCREMENT  PRIMARY KEY,
                              name VARCHAR(250) ,
                              email VARCHAR(250),
                              jobTitle VARCHAR(250) ,
                            phone VARCHAR(250),
                              imageUrl VARCHAR(250)
);
