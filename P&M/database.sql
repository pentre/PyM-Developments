DROP TABLE IF EXISTS branch CASCADE;
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
    phone_number VARCHAR(10) NOT NULL,
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

/*ramas*/
INSERT INTO branch VALUES('Sede0','cali','Cra 84A #14-115',true);
INSERT INTO branch VALUES('Sede1','Bogota','Cra 106D #14-15',true);

/*catalog*/
INSERT INTO catalog VALUES(DEFAULT, 'silla', 100, 'madera', 10, 'cafe', true);
INSERT INTO catalog VALUES(DEFAULT, 'sofa', 100, 'sintetico', 20, 'rojo', true);
INSERT INTO catalog VALUES (DEFAULT, 'armario', 100 , 'madera', 34, 'negro', true);

/*inventory*/
INSERT INTO inventory VALUES(1, 5, 'Sede0');
INSERT INTO inventory VALUES(2, 3, 'Sede0');
INSERT INTO inventory VALUES(3, 2,'Sede0');

/*commission*/
INSERT INTO commission VALUES(DEFAULT, false, 1, 10, 'Sede0');
INSERT INTO commission VALUES(DEFAULT, true, 2, 10, 'Sede0');


/*Usuarios*/
INSERT INTO employee VALUES('1', 'soph', 'Sede0', 'Administrador', 1234567, '12345678', true);
INSERT INTO login VALUES('1', '123');
INSERT INTO employee VALUES('2', 'Jaime', 'Sede0', 'Jefe de Taller', 1234567, '1234567', true);
INSERT INTO login VALUES('2', '123');
INSERT INTO employee VALUES('3', 'Emily', 'Sede0', 'Jefe de Taller', 2345678, '2345678', true);
INSERT INTO login VALUES('3', '123');
INSERT INTO employee VALUES('4', 'Luis', 'Sede0', 'Vendedor', 3456789, '3456789', true);
INSERT INTO login VALUES('4', '123');
INSERT INTO employee VALUES('5', 'Camilo', 'Sede0', 'Vendedor', 4567890, '4567890', true);
INSERT INTO login VALUES('5', '123');
INSERT INTO employee VALUES('6', 'Jose', 'Sede0', 'Gerente', 9876543, '9876543', true);
INSERT INTO login VALUES('6', '123');
INSERT INTO employee VALUES('7', 'Juan', 'Sede0', 'Gerente', 8765432, '8765432', true);
INSERT INTO login VALUES('7', '123');

/*Ventas between 2019-02-01 and 2019-03-19 */
insert into sale (sale_id, branch, employee, date) values (1, 'Sede0', 4, '2019-02-04');
insert into sale (sale_id, branch, employee, date) values (2, 'Sede1', 4, '2019-03-17');
insert into sale (sale_id, branch, employee, date) values (3, 'Sede1', 4, '2019-03-02');
insert into sale (sale_id, branch, employee, date) values (4, 'Sede1', 4, '2019-03-06');
insert into sale (sale_id, branch, employee, date) values (5, 'Sede0', 4, '2019-02-23');
insert into sale (sale_id, branch, employee, date) values (6, 'Sede0', 4, '2019-03-10');
insert into sale (sale_id, branch, employee, date) values (7, 'Sede0', 5, '2019-03-10');
insert into sale (sale_id, branch, employee, date) values (8, 'Sede1', 4, '2019-03-13');
insert into sale (sale_id, branch, employee, date) values (9, 'Sede0', 4, '2019-03-14');
insert into sale (sale_id, branch, employee, date) values (10, 'Sede1', 4, '2019-03-13');
insert into sale (sale_id, branch, employee, date) values (11, 'Sede0', 4, '2019-03-11');
insert into sale (sale_id, branch, employee, date) values (12, 'Sede0', 5, '2019-02-22');
insert into sale (sale_id, branch, employee, date) values (13, 'Sede1', 5, '2019-03-01');
insert into sale (sale_id, branch, employee, date) values (14, 'Sede1', 5, '2019-03-14');
insert into sale (sale_id, branch, employee, date) values (15, 'Sede0', 4, '2019-02-20');
insert into sale (sale_id, branch, employee, date) values (16, 'Sede1', 5, '2019-03-15');
insert into sale (sale_id, branch, employee, date) values (17, 'Sede0', 5, '2019-02-12');
insert into sale (sale_id, branch, employee, date) values (18, 'Sede0', 4, '2019-02-20');
insert into sale (sale_id, branch, employee, date) values (19, 'Sede1', 4, '2019-02-02');
insert into sale (sale_id, branch, employee, date) values (20, 'Sede1', 5, '2019-02-02');
insert into sale (sale_id, branch, employee, date) values (21, 'Sede0', 5, '2019-02-14');
insert into sale (sale_id, branch, employee, date) values (22, 'Sede0', 4, '2019-02-21');
insert into sale (sale_id, branch, employee, date) values (23, 'Sede1', 4, '2019-03-18');
insert into sale (sale_id, branch, employee, date) values (24, 'Sede1', 4, '2019-03-07');
insert into sale (sale_id, branch, employee, date) values (25, 'Sede1', 4, '2019-03-02');
insert into sale (sale_id, branch, employee, date) values (26, 'Sede0', 4, '2019-03-13');
insert into sale (sale_id, branch, employee, date) values (27, 'Sede0', 4, '2019-03-04');
insert into sale (sale_id, branch, employee, date) values (28, 'Sede0', 5, '2019-02-24');
insert into sale (sale_id, branch, employee, date) values (29, 'Sede0', 5, '2019-02-05');
insert into sale (sale_id, branch, employee, date) values (30, 'Sede0', 4, '2019-02-02');
insert into sale (sale_id, branch, employee, date) values (31, 'Sede0', 4, '2019-03-08');
insert into sale (sale_id, branch, employee, date) values (32, 'Sede0', 5, '2019-02-26');
insert into sale (sale_id, branch, employee, date) values (33, 'Sede1', 4, '2019-03-15');
insert into sale (sale_id, branch, employee, date) values (34, 'Sede1', 4, '2019-03-14');
insert into sale (sale_id, branch, employee, date) values (35, 'Sede1', 4, '2019-02-25');
insert into sale (sale_id, branch, employee, date) values (36, 'Sede0', 4, '2019-03-05');
insert into sale (sale_id, branch, employee, date) values (37, 'Sede1', 4, '2019-02-01');
insert into sale (sale_id, branch, employee, date) values (38, 'Sede1', 5, '2019-03-06');
insert into sale (sale_id, branch, employee, date) values (39, 'Sede0', 4, '2019-02-03');
insert into sale (sale_id, branch, employee, date) values (40, 'Sede0', 4, '2019-02-28');
insert into sale (sale_id, branch, employee, date) values (41, 'Sede0', 4, '2019-02-11');
insert into sale (sale_id, branch, employee, date) values (42, 'Sede0', 4, '2019-02-27');
insert into sale (sale_id, branch, employee, date) values (43, 'Sede1', 4, '2019-03-15');
insert into sale (sale_id, branch, employee, date) values (44, 'Sede1', 5, '2019-02-19');
insert into sale (sale_id, branch, employee, date) values (45, 'Sede0', 4, '2019-03-17');
insert into sale (sale_id, branch, employee, date) values (46, 'Sede0', 4, '2019-02-24');
insert into sale (sale_id, branch, employee, date) values (47, 'Sede0', 4, '2019-02-14');
insert into sale (sale_id, branch, employee, date) values (48, 'Sede1', 5, '2019-02-26');
insert into sale (sale_id, branch, employee, date) values (49, 'Sede1', 4, '2019-02-01');
insert into sale (sale_id, branch, employee, date) values (50, 'Sede1', 4, '2019-03-07');
/*furniture_sold*/
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (1, 1, 5, 500);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (2, 1, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (3, 1, 5, 500);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (4, 3, 3, 300);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (5, 3, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (6, 2, 1, 100);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (7, 1, 3, 300);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (8, 3, 2, 200);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (9, 2, 2, 200);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (10, 1, 2, 200);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (11, 3, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (12, 1, 3, 300);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (13, 3, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (14, 1, 3, 300);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (15, 2, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (16, 1, 1, 100);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (17, 2, 5, 500);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (18, 3, 2, 200);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (19, 1, 3, 300);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (20, 1, 2, 200);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (21, 3, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (22, 1, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (23, 2, 3, 300);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (24, 2, 1, 100);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (25, 3, 2, 200);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (26, 1, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (27, 3, 2, 200);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (28, 1, 3, 300);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (29, 3, 5, 500);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (30, 2, 3, 300);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (31, 2, 3, 300);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (32, 2, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (33, 2, 1, 100);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (34, 2, 5, 500);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (35, 1, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (36, 2, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (37, 1, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (38, 2, 3, 300);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (39, 1, 2, 200);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (40, 3, 2, 200);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (41, 3, 5, 500);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (42, 3, 5, 500);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (43, 1, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (44, 3, 2, 200);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (45, 3, 5, 500);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (46, 2, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (47, 3, 4, 400);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (48, 2, 2, 200);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (49, 1, 2, 200);
insert into furniture_sold (sale_id, furniture_id, quantity, value) values (50, 2, 5, 500);