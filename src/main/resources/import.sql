INSERT INTO address_table (id, city, create_at, street,update_at, zip) VALUES (1, 'Fairfield', CURRENT_TIMESTAMP, 'N 4st', CURRENT_TIMESTAMP, 52557);
INSERT INTO address_table (id, city, create_at, street,update_at, zip) VALUES (2, 'Fairfield', CURRENT_TIMESTAMP, 'W 4st', CURRENT_TIMESTAMP, 52556);
INSERT INTO address_table (id, city, create_at, street,update_at, zip) VALUES (3, 'Burlington', CURRENT_TIMESTAMP, 'New Street', CURRENT_TIMESTAMP, 52588);
INSERT INTO address_table (id, city, create_at, street,update_at, zip) VALUES (4, 'Iowa City', CURRENT_TIMESTAMP, 'Iowa Street', CURRENT_TIMESTAMP, 52288);

INSERT INTO category_table (id, name, create_at, update_at) VALUES (1, 'Grocery', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO category_table (id, name, create_at, update_at) VALUES (2, 'Laptop', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO category_table (id, name, create_at, update_at) VALUES (3, 'Phone', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);
INSERT INTO category_table (id, name, create_at, update_at) VALUES (4, 'Tablet', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO product_table (id, name, price, rating, create_at, update_at, category_id) VALUES (1, 'iphone', 1000, 4.5, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO product_table (id, name, price, rating, create_at, update_at, category_id) VALUES (2, 'samsung', 900, 4.6, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO product_table (id, name, price, rating, create_at, update_at, category_id) VALUES (3, 'oneplus', 860, 4.8, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);

INSERT INTO product_table (id, name, price, rating, create_at, update_at, category_id) VALUES (4, 'snack', 2, 4.8, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO product_table (id, name, price, rating, create_at, update_at, category_id) VALUES (5, 'nuts', 12, 4.5, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);

INSERT INTO product_table (id, name, price, rating, create_at, update_at, category_id) VALUES (6, 'dell', 1200, 4.5, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO product_table (id, name, price, rating, create_at, update_at, category_id) VALUES (7, 'lenovo', 1250, 4.5, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO product_table (id, name, price, rating, create_at, update_at, category_id) VALUES (8, 'mac', 1800, 4.0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);

INSERT INTO product_table (id, name, price, rating, create_at, update_at, category_id) VALUES (9, 'ipad', 900, 3.9, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO product_table (id, name, price, rating, create_at, update_at, category_id) VALUES (10, 'samsung tab', 800, 4.0, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);

INSERT INTO user_table (id,firstname, lastname, email, password, create_at, update_at, address_id) VALUES (1, 'user1firstname','user1lastname', 'user1@email.com','user1password', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO user_table (id,firstname, lastname, email, password, create_at, update_at, address_id) VALUES (2, 'user2firstname','user2lastname', 'user2@email.com','user2password', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO user_table (id,firstname, lastname, email, password, create_at, update_at, address_id) VALUES (3, 'user3firstname','user3lastname', 'user3@email.com','user3password', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 3);
INSERT INTO user_table (id,firstname, lastname, email, password, create_at, update_at, address_id) VALUES (4, 'user4firstname','user4lastname', 'user4@email.com','user4password', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);

INSERT INTO review_table (id, comment, create_at, update_at, user_id) VALUES (1, 'user1 review', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO review_table (id, comment, create_at, update_at, user_id) VALUES (2, 'user1 second review', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);
INSERT INTO review_table (id, comment, create_at, update_at, user_id) VALUES (3, 'user1 third review', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 1);

INSERT INTO review_table (id, comment, create_at, update_at, user_id) VALUES (4, 'user2 first review', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 2);
INSERT INTO review_table (id, comment, create_at, update_at, user_id) VALUES (5, 'user4 first review', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);
INSERT INTO review_table (id, comment, create_at, update_at, user_id) VALUES (6, 'user4 second review', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 4);


