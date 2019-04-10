
-- simple
CREATE TABLE student (
  id INT NOT NULL auto_increment,
  first_name VARCHAR(45) NULL,
  last_name VARCHAR(45) NULL,
  email VARCHAR(45) NULL,
  PRIMARY KEY (id)
);

-- many to one
-- CREATE TABLE MTO_DEVELOPERS(
--    ID INT NOT NULL AUTO_INCREMENT,
--    FIRST_NAME VARCHAR(50) DEFAULT NULL,
--    LAST_NAME VARCHAR(50) DEFAULT NULL,
--    SPECIALTY VARCHAR(50) DEFAULT NULL,
--    EXPERIENCE INT DEFAULT NULL,
--    COMPANY INT NOT NULL,
--    PRIMARY KEY(ID)
-- );
--
-- CREATE TABLE MTO_COMPANIES (
--   id INT NOT NULL auto_increment,
--   COMPANY_NAME VARCHAR(100) default NULL,
--   PRIMARY KEY (id)
-- );