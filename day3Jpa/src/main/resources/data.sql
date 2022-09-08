INSERT INTO CATEGORY (id,name) VALUES (2,'Phone');
INSERT INTO CATEGORY (id,name) VALUES (3,'Laptop');
INSERT INTO CATEGORY (id,name) VALUES (4,'Tv');

INSERT INTO PRODUCT (id,name,price,rating,category_id) VALUES (14,'Iphone-14',1850,4,2);
INSERT INTO PRODUCT (id,name,price,rating,category_id) VALUES (15,'Iphone-14',1850,4,2);
INSERT INTO PRODUCT (id,name,price,rating,category_id) VALUES (16,'Iphone-14',1850,4,2);

INSERT INTO ADDRESS (id,city,street,zip) VALUES (10,'Addis Ababa','100N 4th street','52557');
INSERT INTO ADDRESS (id,city,street,zip) VALUES (17,'Addis Ababa','100N 4th street','52557');
INSERT INTO users(id,email,first_name,last_name,password,address_id) VALUES (14,'abc@gmail.com','hiwot','reta','123',1);
INSERT INTO Review (id,comment,user_id,product_id) VALUES (7,'Best product',1,5);
