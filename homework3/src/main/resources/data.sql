/* USER */
INSERT INTO my_user (email, first_name, last_name, password) VALUES ('Abubakr@gmail.com', 'Abubakr', 'Abdullaev', '614686');
INSERT INTO my_user (email, first_name, last_name, password) VALUES ('Nagua@gmail.com', 'Smith', 'Do', '614888');

/* REVIEW */
INSERT INTO review (id, comment, user_id) VALUES (1, 'great', 1);
INSERT INTO review (id, comment, user_id) VALUES (2, 'Unbelivable', 1);
INSERT INTO review (id, comment, user_id) VALUES (3, 'Prety good!', 2);
INSERT INTO review (id, comment, user_id) VALUES (4, 'Splendid', 2);

/* ADDRESS */
INSERT INTO address (id, city, street, zip, user_id) VALUES (1, 'Fairfield', 'IA', 123, 1);
INSERT INTO address (id, city, street, zip, user_id) VALUES (2, 'Brooklyn', 'NY', 123, 2);

/* CATEGORY */
INSERT INTO category (name) VALUES ('HP');
INSERT INTO category (name) VALUES ('Apple');
INSERT INTO category (name) VALUES ('Gateway');

/* PRODUCT */
INSERT INTO product (name, price, rating, category_id) VALUES ('Sony', 999, 5, 1);
INSERT INTO product (name, price, rating, category_id) VALUES ('Aser', 399, 4, 1);
INSERT INTO product (name, price, rating, category_id) VALUES ('Apple 14 pro', 1099, 5, 2);
INSERT INTO product (name, price, rating, category_id) VALUES ('Apple 11 pro', 1399, 3, 2);
INSERT INTO product (name, price, rating, category_id) VALUES ('SonyEricson 301i', 200, 4, 3);
INSERT INTO product (name, price, rating, category_id) VALUES ('SonyEricson 501i', 289, 5, 3);