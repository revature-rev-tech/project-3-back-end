INSERT INTO user_details(user_email, user_password, user_first_name, user_last_name, user_address, user_contact, user_type, user_removed) 
VALUES('manager@email.com', 123456, 'Jane', 'Doe', 'California', '555-555-5555', 'Manager', FALSE);

INSERT INTO user_details(user_email, user_password, user_first_name, user_last_name, user_address, user_contact, user_type, user_removed) 
VALUES('employee@email.com', 123456, 'John', 'Doe', 'California', '555-555-5555', 'Employee', FALSE);

INSERT INTO user_details(user_email, user_password, user_first_name, user_last_name, user_address, user_contact, user_type, user_removed) 
VALUES('customer1@email.com', 123456, 'Test', 'Doe', 'California', '555-555-5555', 'Customer', FALSE);

INSERT INTO user_details(user_email, user_password, user_first_name, user_last_name, user_address, user_contact, user_type, user_removed) 
VALUES('customer2@email.com', 123456, 'Test', 'Doe', 'California', '555-555-5555', 'Customer', FALSE);

INSERT INTO user_details(user_email, user_password, user_first_name, user_last_name, user_address, user_contact, user_type, user_removed) 
VALUES('customer3@email.com', 123456, 'Test', 'Doe', 'California', '555-555-5555', 'Customer', FALSE);


INSERT INTO product_details(product_name, product_cost, product_category, product_description, product_sku, product_qty, image_url, product_removed)
VALUES('iphone 13 Pro MAX', 99.95, 'PHONES', 'The newest iphone - 6.7 inch display', 'XXXXXX', 4, '_PHOTO_PLACE_HOLDER_', FALSE);

INSERT INTO product_details(product_name, product_cost, product_category, product_description, product_sku, product_qty, image_url, product_removed)
VALUES('iphone X Pro MAX', 50.95, 'PHONES', 'not newest iphone - 5.9 inch display', 'XXXXXX', 4, '_PHOTO_PLACE_HOLDER_', FALSE);

INSERT INTO cart_details(user_id, cart_paid, cart_removed, cart_total) VALUES ( 3, FALSE, FALSE, 100000);

INSERT INTO cart_items(cart_id, product_id, cart_qty) VALUES ( 1, 1, 2 );

INSERT INTO cart_items(cart_id, product_id, cart_qty) VALUES ( 1, 2, 1 );

INSERT INTO discount_details(product_id, discount_description, discount_percentage) VALUES ( 2, 'stuff', 20.5 );


