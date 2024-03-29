﻿DROP TABLE IF EXISTS branch CASCADE;
CREATE TABLE branch 
(
    name VARCHAR(20) PRIMARY KEY NOT NULL,
    city VARCHAR(20) NOT NULL,
    address VARCHAR(30) NOT NULL,    
    active BOOLEAN NOT NULL  
);

DROP TABLE IF EXISTS employee CASCADE;
CREATE TABLE employee 
(
    id VARCHAR(20) PRIMARY KEY NOT NULL,
    name VARCHAR(20) NOT NULL,
    branch VARCHAR(20) NOT NULL,
    charge VARCHAR(20) NOT NULL,
    salary FLOAT(20) NOT NULL,
    phone_number VARCHAR(12) NOT NULL,
    active BOOLEAN NOT NULL,

    FOREIGN KEY (branch) REFERENCES branch (name)
);

DROP TABLE IF EXISTS login CASCADE;
CREATE TABLE login
(
    username VARCHAR(20) PRIMARY KEY NOT NULL,
    pass VARCHAR(20) NOT NULL
);

DROP TABLE IF EXISTS catalog CASCADE;
CREATE TABLE catalog
(
    furniture_id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR(20) NOT NULL,
    price FLOAT(20) NOT NULL,
    material VARCHAR(20) NOT NULL,
    weight VARCHAR(20) NOT NULL,
    color VARCHAR(20) NOT NULL,
    active BOOLEAN NOT NULL
);

DROP TABLE IF EXISTS sale CASCADE;
CREATE TABLE sale 
(
    sale_id VARCHAR(36) PRIMARY KEY NOT NULL,
    branch VARCHAR(20) NOT NULL,
    employee VARCHAR(29) NOT NULL,
    date DATE NOT NULL,
    FOREIGN KEY (employee) REFERENCES employee(id),
    FOREIGN KEY (branch) REFERENCES branch (name)
);

DROP TABLE IF EXISTS furniture_sold CASCADE;
CREATE TABLE furniture_sold
(
    sale_id VARCHAR(36) NOT NULL,
    furniture_id INTEGER NOT NULL,
    quantity INTEGER NOT NULL,
    value FLOAT(30) NOT NULL,
    PRIMARY KEY (sale_id, furniture_id),
    FOREIGN KEY (sale_id) REFERENCES sale (sale_id),
    FOREIGN KEY (furniture_id) REFERENCES catalog (furniture_id)
);

DROP TABLE IF EXISTS inventory CASCADE;
CREATE TABLE inventory
(    
    furniture_id INTEGER NOT NULL,
    quantity INTEGER NOT NULL,
    branch VARCHAR(20) NOT NULL,
    PRIMARY KEY (furniture_id, branch),    
    FOREIGN KEY (branch) REFERENCES   branch (name),
    FOREIGN KEY (furniture_id) REFERENCES catalog (furniture_id)
);

DROP TABLE IF EXISTS commission CASCADE;
CREATE TABLE commission
(    
    order_id SERIAL PRIMARY KEY NOT NULL,
    status BOOLEAN NOT NULL,
    furniture_id INTEGER NOT NULL,
    quantity INTEGER NOT NULL,
    branch VARCHAR(20) NOT NULL,
    FOREIGN KEY (branch) REFERENCES branch(name),
    FOREIGN KEY (furniture_id) REFERENCES catalog (furniture_id)
);

