/* USER */
INSERT INTO my_user (email, first_name, last_name, password) VALUES ('nodirbek@gmail.com', 'Nodirbek', 'Ergashev', '123456');
INSERT INTO my_user (email, first_name, last_name, password) VALUES ('Joe@gmail.com', 'Joe', 'Do', '123456');

/* REVIEW */
INSERT INTO review (id, comment, user_id) VALUES (1, 'Awesome', 1);
INSERT INTO review (id, comment, user_id) VALUES (2, 'Not Bad', 1);
INSERT INTO review (id, comment, user_id) VALUES (3, 'Cool!', 2);
INSERT INTO review (id, comment, user_id) VALUES (4, 'Superb', 2);

/* ADDRESS */
INSERT INTO address (id, city, street, zip, user_id) VALUES (1, 'Fairfield', 'NY', 123, 1);
INSERT INTO address (id, city, street, zip, user_id) VALUES (2, 'Greyhound', 'JR', 123, 2);

/* CATEGORY */
INSERT INTO category (name) VALUES ('Apple');
INSERT INTO category (name) VALUES ('Samsung');
INSERT INTO category (name) VALUES ('Xiaomi');

/* PRODUCT */
INSERT INTO product (name, price, rating, category_id) VALUES ('iPhone', 999, 5, 1);
INSERT INTO product (name, price, rating, category_id) VALUES ('iPad', 399, 4, 1);
INSERT INTO product (name, price, rating, category_id) VALUES ('Galaxy S22', 1099, 5, 2);
INSERT INTO product (name, price, rating, category_id) VALUES ('Galaxy Fold3', 1399, 3, 2);
INSERT INTO product (name, price, rating, category_id) VALUES ('Redmi 4X', 199, 4, 3);
INSERT INTO product (name, price, rating, category_id) VALUES ('Redmi 8', 349, 5, 3);