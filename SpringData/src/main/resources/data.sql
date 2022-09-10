INSERT INTO category (name) VALUES ('Phone');
INSERT INTO category (name) VALUES ('Laptop');

INSERT INTO product (name,price,rating,category_id) VALUES ('IPhone',1000,4.5,1);
INSERT INTO product (name,price,rating,category_id) VALUES ('Samsung',2000,4.5,1);
INSERT INTO product (name,price,rating,category_id) VALUES ('Nokia',500,4.5,1);

INSERT INTO product (name,price,rating,category_id) VALUES ('Macbook',2000,4.5,2);
INSERT INTO product (name,price,rating,category_id) VALUES ('Hp',1500,3.2,2);
INSERT INTO product (name,price,rating,category_id) VALUES ('Toshiba',1200,5,2);

INSERT INTO customer (first_name,last_name,email,password) VALUES ('zola@gmail.com','zola','mrB','zola123');
INSERT INTO customer (first_name,last_name,email,password) VALUES ('beki@gmail.com','beki','daniel','daniel123');
INSERT INTO customer (first_name,last_name,email,password) VALUES ('redu@gmail.com','redu','mrx','redu123');

INSERT INTO review (comment,user_id) VALUES ('It is good',1);
INSERT INTO review (comment,user_id) VALUES ('Not bad',2);
INSERT INTO review (comment,user_id) VALUES ('Seen better',3);

INSERT INTO address (city,street,zip,user_id) VALUES ('Fairfield','100N 4th st',52557,1);
INSERT INTO address (city,street,zip,user_id) VALUES ('Des Moines','123 blvd',53443,2);
INSERT INTO address (city,street,zip,user_id) VALUES ('Iowa City','george st',56321,3);




