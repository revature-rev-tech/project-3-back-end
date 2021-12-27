# -------- Missing columns & cause error on insert---------

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

<<<<<<< HEAD
#--------- Fixed the missing columns User Tables
INSERT INTO user_details(user_id, user_email, user_name, user_password, user_first_name,
user_last_name, user_address, user_contact, user_type, user_removed)
VALUES(1,'manager@email.com',' testu', 'password', 'Jane', 'Doe',
'123 main St Los Angeles, CA', '555-555-5555', 'Customer', FALSE);

INSERT INTO user_details(user_id, user_email, user_name, user_password, user_first_name,
user_last_name, user_address, user_contact, user_type, user_removed)
VALUES(2,'keu@gemail.com',' newg1', 'pass1', 'Kiera', 'Eupnary',
'66 Elm St Manchester, NH', '321-115-6500', 'Customer', FALSE);

#-------For adding Products --------

insert into product_details(product_id, image_url, product_category, product_cost,
product_description, product_name, product_qty, product_removed, product_sku)
values (1, 'http://pexels.com/img23', 'Gaming Chairs', 234.89,
'Best gaming chair ever. You can play all daylong & will never get body ache. Its for the real gamer',
'XBlaster Chair', 10, false, 'A0XB34GCHAIR00234');

 insert into product_details(product_id, image_url, product_category, product_cost,
  product_description, product_name, product_qty, product_removed, product_sku)
 values (2, 'http://pexels.com/img12', 'Gaming Chairs', 134.79,
 'New gaming chair ever. You can play all day long & will never get body ache. Its for the real gamer',
 'New XBlaster Chair', 5, false, 'A0XB34GNEWC00234');

 insert into product_details(product_id, image_url, product_category, product_cost,
  product_description, product_name, product_qty, product_removed, product_sku)
  values (3, 'http://pexels.com/img78', 'Head Phones', 300.12, 'Great for music lovers, Noise Cancelling features better than Sony.',
  'MPow-78', 2, false, 'BNH11R00234');

   insert into product_details(product_id, image_url, product_category, product_cost,
    product_description, product_name, product_qty, product_removed, product_sku)
    values (4, 'http://pexels.com/img40', 'Head Phones', 350.21, 'Amazing Sound, bass etc, Noise Cancelling features better than  Apple.',
    'MSound-79', 6, false, 'C09H11R00234');
=======

INSERT INTO product_details(product_name, product_cost, product_category, product_description, product_sku, product_qty, image_url, product_removed)
VALUES('iphone 13 Pro MAX', 99.95, 'PHONES', 'The newest iphone - 6.7 inch display', 'XXXXXX', 4, '_PHOTO_PLACE_HOLDER_', FALSE);

INSERT INTO product_details(product_name, product_cost, product_category, product_description, product_sku, product_qty, image_url, product_removed)
VALUES('iphone X Pro MAX', 50.95, 'PHONES', 'not newest iphone - 5.9 inch display', 'XXXXXX', 4, '_PHOTO_PLACE_HOLDER_', FALSE);

INSERT INTO cart_details(user_id, cart_paid, cart_removed, cart_total) VALUES ( 3, FALSE, FALSE, 100000);

INSERT INTO cart_items(cart_id, product_id, cart_qty) VALUES ( 1, 1, 2 );

INSERT INTO cart_items(cart_id, product_id, cart_qty) VALUES ( 1, 2, 1 );

INSERT INTO discount_details(product_id, discount_description, discount_percentage) VALUES ( 2, 'stuff', 20.5 );


>>>>>>> main
