-- *******************************************************************
--  create_grub_tables: Script for creating grub databse tables
--  
--  Usage: $ sqlite3 databse < create_catalog_table
--
--  Note: 
--          
-- *******************************************************************




-- *******************************************************************
-- The catalog table store the defualt catalog of grocery items. These
-- are the items that can be added to a shopping list.
-- *******************************************************************

DROP TABLE IF EXISTS catalog;

CREATE TABLE catalog 
(
   _id INTEGER PRIMARY KEY AUTOINCREMENT,   
   generic_type TEXT,
   name TEXT,
   maker TEXT,
   upc INTEGER,
   icon_location TEXT
);



-- *******************************************************************
-- The catalog table store the defualt catalog of grocery items. These
-- are the items that can be added to a shopping list.
-- *******************************************************************

DROP TABLE IF EXISTS generic_types;


CREATE TABLE generic_types 
(
   _id INTEGER PRIMARY KEY AUTOINCREMENT,
   name TEXT
);



-- *******************************************************************
-- The pantry table lists purchased grocery items that are in 
-- inventory.
-- *******************************************************************

DROP TABLE IF EXISTS pantry;


CREATE TABLE pantry 
(
   _id INTEGER PRIMARY KEY AUTOINCREMENT,
   purchase_date TIMESTAMP,
   cost NUMBER,
   store TEXT,
   store_location TEXT,
   size TEXT,
   quantity NUMBER
);

-- *******************************************************************
-- The grocery_stores table lists grocery stores that are used for
-- location aware services and price and cupon searches.
-- *******************************************************************

DROP TABLE IF EXISTS grocery_stores;


CREATE TABLE grocery_stores 
(
   _id INTEGER PRIMARY KEY AUTOINCREMENT,
   name TEXT
);