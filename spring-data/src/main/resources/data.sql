insert into address ("id", "street", "city", "zip") values
                                                  (1, "fairfield_street1", "fairfield_city1", "52557"),
                                                  (2, "fairfield_street2", "fairfield_city2", "52557"),
                                                  (3, "fairfield_street3", "fairfield_city3", "52557"),
                                                  (4, "fairfield_street4", "fairfield_city4", "52557");

insert into category ("id", "name") values
                                        (1, "category_one"),
                                        (2, "category_two"),
                                        (3, "category_three");

insert into product ("id", "name", "rating", "price", "category_id") values
                                                        (1, "product_one", 4, 50.5, 1),
                                                        (2, "product_two", 3, 50.5, 1),
                                                        (3, "product_three", 3.5, 50.5, 2),
                                                        (4, "product_four", 4.5, 50.5, 2),
                                                        (5, "product_five", 2.5, 50.5, 3),
                                                        (6, "product_six", 4, 50.5, 3);

insert into user (id, firstName, lastName, email, password) values
                                                                (1, "user_first_name_one", "user_last_name_one", "user_one@email.com", "very_secure_password"),
                                                                (2, "user_first_name_two", "user_last_name_two", "user_two@email.com", "very_secure_password"),
                                                                (3, "user_first_name_three", "user_last_name_three", "user_three@email.com", "very_secure_password"),
                                                                (4, "user_first_name_four", "user_last_name_four", "user_four@email.com", "very_secure_password");

insert into review ("id", "comment", "user_id", "product_id") values
                                                                  (1, "bla bla bla", 1, 1),
                                                                  (2, "bla bla bla", 1, 1),
                                                                  (3, "bla bla bla", 2, 1),
                                                                  (4, "bla bla bla", 2, 3),
                                                                  (5, "bla bla bla", 2, 2),
                                                                  (6, "bla bla bla", 3, 3),
                                                                  (7, "bla bla bla", 3, 1),
                                                                  (8, "bla bla bla", 3, 1),
                                                                  (9, "bla bla bla", 3, 2),
                                                                  (10, "bla bla bla", 1,2),
                                                                  (11, "bla bla bla", 2, 1),
                                                                  (12, "bla bla bla", 3, 1),
                                                                  (13, "bla bla bla", 1, 3),
                                                                  (14, "bla bla bla", 1, 3),
                                                                  (15, "bla bla bla", 3, 1),
                                                                  (16, "bla bla bla", 1, 2),
                                                                  (17, "bla bla bla", 3, 1),