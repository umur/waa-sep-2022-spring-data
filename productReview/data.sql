-- CATEGORY
INSERT INTO public.category (id, name) VALUES (2, 'Jeans');
INSERT INTO public.category (id, name) VALUES (3, 'Short');
INSERT INTO public.category (id, name) VALUES (4, 'Tops');
INSERT INTO public.category (id, name) VALUES (1, 'Tops test');

-- PRODUCT
INSERT INTO public.product (id, name, price, rating, category_id) VALUES (2, 'product B', 200, 3, 1);
INSERT INTO public.product (id, name, price, rating, category_id) VALUES (1, 'product A', 101, 4, 3);
INSERT INTO public.product (id, name, price, rating, category_id) VALUES (3, 'product C', 150, 1, 2);

-- ADDRESS
INSERT INTO public.address (id, city, street, zip) VALUES (2, 'Fairfield', '605 E Broadway Ave', '52556');
INSERT INTO public.address (id, city, street, zip) VALUES (3, 'Fairfield', '102 Forest Dr', '52556');
INSERT INTO public.address (id, city, street, zip) VALUES (4, 'Fairfield', '2000 LibertyVille Road', '52556');

-- USERS
INSERT INTO public.lab3user (id, email, first_name, last_name, password, id_address) VALUES (2, 'adam.smith@miu.edu', 'Adam', 'Smith', '1234', 3);
INSERT INTO public.lab3user (id, email, first_name, last_name, password, id_address) VALUES (1, 'thi.truong@miu.edu', 'Thi', 'Truong', '1234', 2);
INSERT INTO public.lab3user (id, email, first_name, last_name, password, id_address) VALUES (3, 'peter.pan@miu.edu', 'Peter', 'Pan', '1234', 4);

-- REVIEWS
INSERT INTO public.review (id, comment, product_id, user_id) VALUES (2, 'Comment 2', 1, 2);
INSERT INTO public.review (id, comment, product_id, user_id) VALUES (5, 'Comment 5', 3, 3);
INSERT INTO public.review (id, comment, product_id, user_id) VALUES (4, 'Comment 4', 3, 2);
INSERT INTO public.review (id, comment, product_id, user_id) VALUES (3, 'Comment 3', 2, 3);
INSERT INTO public.review (id, comment, product_id, user_id) VALUES (1, 'Comment 1', 1, 1);
