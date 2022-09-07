INSERT INTO category (name) VALUES ('Phone');
INSERT INTO category (name) VALUES ('Laptop');

INSERT INTO product (name,price,catagory_id) VALUES ('IPhone',1000,1);
INSERT INTO product (name,price,catagory_id) VALUES ('Samsung',2000,1);
INSERT INTO product (name,price,catagory_id) VALUES ('Nokia',500,1);

INSERT INTO product (name,price,catagory_id) VALUES ('Macbook',2000,2);
INSERT INTO product (name,price,catagory_id) VALUES ('Hp',1500,2);
INSERT INTO product (name,price,catagory_id) VALUES ('Toshiba',1200,2);

INSERT INTO product_user (email,first_name,last_name,password) VALUES ('zola@gmail.com','zola','mrB','zola123');
INSERT INTO product_user (email,first_name,last_name,password) VALUES ('beki@gmail.com','beki','daniel','daniel123');
INSERT INTO product_user (email,first_name,last_name,password) VALUES ('redu@gmail.com','redu','mrx','redu123');

INSERT INTO review (comment,user_id) VALUES ('It is good',1);
INSERT INTO review (comment,user_id) VALUES ('Not bad',2);
INSERT INTO review (comment,user_id) VALUES ('Seen better',3);

INSERT INTO address (city,street,zip,user_id) VALUES ('Fairfield','100N 4th st',52557,1);
INSERT INTO address (city,street,zip,user_id) VALUES ('Des Moines','123 blvd',53443,2);
INSERT INTO address (city,street,zip,user_id) VALUES ('Iowa City','george st',56321,3);




