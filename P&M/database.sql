DROP TABLE IF EXISTS login CASCADE;
CREATE TABLE login
(
    username VARCHAR(20) PRIMARY KEY NOT NULL,
    pass VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS employee CASCADE;
CREATE TABLE employee 
(
    id VARCHAR(20) PRIMARY KEY NOT NULL,
    name VARCHAR(20) NOT NULL,
    branch VARCHAR(20) NOT NULL,
    charge VARCHAR(20) NOT NULL,
    salary FLOAT(20) NOT NULL,
    phone_number VARCHAR(10) NOT NULL,
    active BOOLEAN NOT NULL,

    FOREIGN KEY (branch) REFERENCES branch (name)
);

DROP TABLE IF EXISTS branch CASCADE;
CREATE TABLE branch 
(
    name VARCHAR(20) PRIMARY KEY NOT NULL,
    city VARCHAR(20) NOT NULL,
    address VARCHAR(30) NOT NULL,
    manager_id VARCHAR(20) NOT NULL,
    active BOOLEAN NOT NULL,
    
    FOREIGN KEY (manager_id) REFERENCES employee (id)
);

DROP TABLE IF EXISTS transaction CASCADE;
CREATE TABLE transaction 
(
    client_id VARCHAR(20) PRIMARY KEY NOT NULL,
    client_phone VARCHAR(20) NOT NULL,
    employee_id VARCHAR(20) NOT NULL,
    date DATE NOT NULL,

    FOREIGN KEY (employee_id) REFERENCES employee (id)
);

DROP TABLE IF EXISTS catalog CASCADE;
CREATE TABLE catalog
(
    furniture_id VARCHAR(20) PRIMARY KEY NOT NULL,
    price FLOAT(20) NOT NULL,
    material VARCHAR(20) NOT NULL,
    weight VARCHAR(20) NOT NULL,
    color VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS quote CASCADE;
CREATE TABLE quote 
(
    id VARCHAR(20) PRIMARY KEY NOT NULL,
    furniture_id VARCHAR(20) NOT NULL,

    FOREIGN KEY (furniture_id) REFERENCES catalog (furniture_id)
);

DROP TABLE IF EXISTS sale CASCADE;
CREATE TABLE sale 
(
    sale_id VARCHAR(20) PRIMARY KEY NOT NULL,
    value FLOAT(30) NOT NULL,
    branch VARCHAR(20) NOT NULL,
    date DATE NOT NULL,

    FOREIGN KEY (branch) REFERENCES branch (name)
);

DROP TABLE IF EXISTS furniture_sold CASCADE;
CREATE TABLE furniture_sold
(
    sale_id VARCHAR(20) NOT NULL,
    furniture_id VARCHAR(20) NOT NULL,
    quantity VARCHAR(20) NOT NULL,

    PRIMARY KEY (sale_id, furniture_id),
    FOREIGN KEY (sale_id) REFERENCES sale (sale_id),
    FOREIGN KEY (furniture_id) REFERENCES catalog (furniture_id)
);

DROP TABLE IF EXISTS inventory CASCADE;
CREATE TABLE inventory
(    
    furniture_id VARCHAR(20) NOT NULL,
    quantity VARCHAR(20) NOT NULL,

    PRIMARY KEY (furniture_id, quantity),    
    FOREIGN KEY (furniture_id) REFERENCES catalog (furniture_id)
);

DROP TABLE IF EXISTS commission CASCADE;
CREATE TABLE commission
(    
    order_id VARCHAR(20) PRIMARY KEY NOT NULL,
    status BOOLEAN NOT NULL,
    furniture_id VARCHAR(20) NOT NULL,
  
    FOREIGN KEY (furniture_id) REFERENCES catalog (furniture_id)
);

INSERT INTO login VALUES('admin', '123');
INSERT INTO login VALUES('manager', '123');
INSERT INTO login VALUES('seller', '123');
INSERT INTO login VALUES('foreman', '123');
