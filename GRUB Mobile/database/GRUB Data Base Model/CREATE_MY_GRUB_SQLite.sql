-- DROP TABLE IF EXISTS MEASUREMENTS;

CREATE TABLE MEASUREMENTS 
(
  _ID INTEGER PRIMARY KEY AUTOINCREMENT,
  typeName TEXT NOT NULL,
  symbol TEXT NOT NULL
);

INSERT INTO MEASUREMENTS VALUES (NULL,'gallon','gal');
INSERT INTO MEASUREMENTS VALUES (NULL,'liter','liter');
INSERT INTO MEASUREMENTS VALUES (NULL,'milliliter','mL');
INSERT INTO MEASUREMENTS VALUES (NULL,'ounce','oz');
INSERT INTO MEASUREMENTS VALUES (NULL,'pINTEGER','pt');
INSERT INTO MEASUREMENTS VALUES (NULL,'quart','qt');
INSERT INTO MEASUREMENTS VALUES (NULL,'cups','cp');
INSERT INTO MEASUREMENTS VALUES (NULL,'pounds','lbs');
INSERT INTO MEASUREMENTS VALUES (NULL,'grams','g');
INSERT INTO MEASUREMENTS VALUES (NULL,'kilograms','kg');
INSERT INTO MEASUREMENTS VALUES (NULL,'teaspoons','tsp');
INSERT INTO MEASUREMENTS VALUES (NULL,'table spoons','Tbls');

-- *******************************************************************
-- Table GROCERY_STORES
-- *******************************************************************

DROP TABLE IF EXISTS GROCERY_STORES;

CREATE  TABLE IF NOT EXISTS GROCERY_STORES 
(
  _ID INTEGER PRIMARY KEY AUTOINCREMENT,
  storeName TEXT NOT NULL ,
  storeNumber TEXT NULL ,
  storeBrandName TEXT NULL ,
  streetAddress TEXT NULL ,
  city TEXT NULL ,
  state TEXT NULL ,
  zipCode TEXT NULL ,
  zipCode2 TEXT NULL 
);


INSERT INTO GROCERY_STORES VALUES (NULL, 'WalMart', '', 'Great Value', '150 N Beckley St', 'Lancaster', 'TX', '75146', '1844');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Albertsons','', 'Albertsons Generic', '1300 W Belt Line Rd', 'Desoto', 'TX', '75115','3628');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Tom Thumb', '', 'Tom Thumb Generic', '210 E Pleasant Run Rd', 'Desoto', 'TX', '75115','3938');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Kroger', '', 'Kroger Generic', '1001 N I 35 E # 500', 'Desoto', 'TX', '75115','6800');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Minyard', '', 'Minyard Generic', '919 N Dallas Ave', 'Lancaster', 'TX', '75146','1615');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Safeway', '', 'SafeWay Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO GROCERY_STORES VALUES (NULL, 'QFC','', 'QFC Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Whole Foods', '', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Smiths', '', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Target', '', 'Target Generic', 'U S Hwy 67', 'Cedar Hill', 'TX', '75104','');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Ralphs', '', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Fiesta', '', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO GROCERY_STORES VALUES (NULL, 'HEC','', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Piggly wiggly', '', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Winn Dixie', '', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Costco', '', 'Costco Generic', '250 W Highway 67', 'Duncanville', 'TX', '75137','4415');
INSERT INTO GROCERY_STORES VALUES (NULL, 'Sams', '', 'Sams Generic', '2900 Wheatland Rd', 'Dallas', 'TX', '75237','');

-- *******************************************************************
-- Table GROCERY_CATEGORIES
-- *******************************************************************

DROP TABLE IF EXISTS GROCERY_CATEGORIES;

CREATE  TABLE IF NOT EXISTS GROCERY_CATEGORIES 
(
  _ID INTEGER PRIMARY KEY AUTOINCREMENT,
  categoryName TEXT NOT NULL
);

INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Bakery');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Deli');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Fruits');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Vegtables');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Bread');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Dairy');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Condiments');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Beverages');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Baking');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Spices');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Sauces/Oils');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Meat/Seafood');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Can/Jar Goods');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Packaged Foods');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Frozen Foods');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Snacks');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Breakfast');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Paper/Wraps');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Cleaning');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Personal Care');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Baby');
INSERT INTO GROCERY_CATEGORIES VALUES (NULL,'Pets');

-- *******************************************************************
-- Table `GROCERY_ITEMS`
-- *******************************************************************

DROP TABLE IF EXISTS GROCERY_ITEMS;

CREATE  TABLE IF NOT EXISTS GROCERY_ITEMS 
(
  _ID INTEGER PRIMARY KEY AUTOINCREMENT,
  categoryID INTEGER NOT NULL ,
  genericName TEXT NOT NULL ,
  specificName TEXT NULL ,
  brandName TEXT NULL ,
  upcNumber INTEGER NULL DEFAULT 0,
  barcodeImage TEXT NULL ,
  itemImage TEXT NULL ,
  INDEX categoryID (categoryID ASC) ,
  FOREIGN KEY (categoryID)
    REFERENCES GROCERY_CATEGORIES (_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);


LOAD DATA
  INFILE C:/users/joel/workspace/mobetter/GRUB/database/data/fresh_fruit.csv
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ,
  LINES TERMINATED BY \r\n (categoryID,genericName,specificName);


LOAD DATA
  INFILE C:/users/joel/workspace/mobetter/GRUB/database/data/fresh_produce.csv
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ,
  LINES TERMINATED BY \r\n (categoryID,genericName,specificName);

LOAD DATA
  INFILE C:/users/joel/workspace/mobetter/GRUB/database/data/spices.csv
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ,
  LINES TERMINATED BY \r\n (categoryID,genericName,specificName);

LOAD DATA
  INFILE C:/users/joel/workspace/mobetter/GRUB/database/data/baking.csv
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ,
  LINES TERMINATED BY \r\n (categoryID,genericName,specificName);

LOAD DATA
  INFILE C:/users/joel/workspace/mobetter/GRUB/database/data/canned_goods.csv
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ,
  LINES TERMINATED BY \r\n (categoryID,genericName,specificName);

LOAD DATA
  INFILE C:/users/joel/workspace/mobetter/GRUB/database/data/breakfast_foods.csv
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ,
  LINES TERMINATED BY \r\n (categoryID,genericName,specificName);

LOAD DATA
  INFILE C:/users/joel/workspace/mobetter/GRUB/database/data/beverages.csv
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ,
  LINES TERMINATED BY \r\n (categoryID,genericName,specificName);

LOAD DATA
  INFILE C:/users/joel/workspace/mobetter/GRUB/database/data/dairy.csv
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ,
  LINES TERMINATED BY \r\n (categoryID,genericName,specificName);

LOAD DATA
  INFILE C:/users/joel/workspace/mobetter/GRUB/database/data/condiments.csv
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ,
  LINES TERMINATED BY \r\n (categoryID,genericName,specificName);

LOAD DATA
  INFILE C:/users/joel/workspace/mobetter/GRUB/database/data/snacks.csv
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ,
  LINES TERMINATED BY \r\n (categoryID,genericName,specificName);

LOAD DATA
  INFILE C:/users/joel/workspace/mobetter/GRUB/database/data/packaged_foods.csv
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ,
  LINES TERMINATED BY \r\n (categoryID,genericName,specificName);

Update GROCERY_ITEMS
  SET specificName=NULL
  WHERE specificName='NULL' OR specificName='';


-- *******************************************************************
-- View `GENERIC_GROCERY_TYPES`
-- *******************************************************************

DROP VIEW IF EXISTS GENERIC_GROCERY_TYPES;

CREATE  VIEW GENERIC_GROCERY_TYPES AS
  SELECT DISTINCT genericName FROM `GROCERY_ITEMS`;


-- *******************************************************************
-- Table `PANTRY_ITEMS`
-- *******************************************************************

DROP TABLE IF EXISTS PANTRY_ITEMS;

CREATE  TABLE IF NOT EXISTS PANTRY_ITEMS 
(
  _ID INTEGER PRIMARY KEY AUTOINCREMENT,
  groceryItemID INTEGER NOT NULL ,
  containerSizeID INTEGER NOT NULL ,
  containerSizeValue NUMBER NOT NULL ,
  groceryStoreID INTEGER NULL ,
  staple INTEGER NULL ,
  quantity INTEGER NULL ,
  cost NUMBER NULL,
  INDEX groceryItemID (groceryItemID ASC) ,
  INDEX containerSizeID` (containerSizeID ASC) ,
  FOREIGN KEY (groceryItemID)
    REFERENCES GROCERY_ITEMS (_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (groceryStoreID)
    REFERENCES GROCERY_STORES (_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (containerSizeId)
    REFERENCES MEASUREMENTS (ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);


-- *******************************************************************
-- Table `SHOPPING_LISTS`
-- *******************************************************************

DROP TABLE IF EXISTS SHOPPING_LISTS;

CREATE  TABLE IF NOT EXISTS SHOPPING_LISTS 
(
  _ID INTEGER PRIMARY KEY AUTOINCREMENT,
  listName TEXT NOT NULL ,
  groceryStoreID INTEGER NOT NULL ,
  dueDate DATETIME NULL ,
  alarm DATETIME NULL ,
  INDEX groceryStoreID (groceryStoreID ASC) ,
  FOREIGN KEY (groceryStoreID)
    REFERENCES GROCERY_STORES (_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);


-- *******************************************************************
-- Table `SHOPPING_LIST_ITEMS`
-- *******************************************************************

DROP TABLE IF EXISTS SHOPPING_LIST_ITEMS;

CREATE  TABLE IF NOT EXISTS `SHOPPING_LIST_ITEMS` 
(
  _ID INTEGER PRIMARY KEY AUTOINCREMENT,
  groceryItemID INTEGER NOT NULL ,
  shoppingListID INTEGER NOT NULL ,
  containerSizeID INTEGER NOT NULL ,
  containerSizeValue DOUBLE NOT NULL ,
  quantity INTEGER NULL DEFAULT 0,
  cost DOUBLE NULL DEFAULT 0.00,
  INDEX groceryItemID (groceryItemID ASC) ,
  INDEX shoppingListID (shoppingListID ASC) ,
  INDEX containerSizeID (containerSizeID ASC) ,
  FOREIGN KEY (groceryItemID)
    REFERENCES GROCERY_ITEMS (_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (shoppingListID)
    REFERENCES SHOPPING_LISTS (_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (containerSizeID)
    REFERENCES MEASUREMENTS (_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);


-- *******************************************************************
-- Table `SHOPPING_CART`
-- *******************************************************************

DROP TABLE IF EXISTS SHOPPING_CART;

CREATE  TABLE IF NOT EXISTS `SHOPPING_CART_ITEMS` 
(
  _ID INTEGER PRIMARY KEY AUTOINCREMENT,
  shoppingListID INTEGER NOT NULL ,
  INDEX shoppingListID (shoppingListID ASC) ,
  FOREIGN KEY (shoppingListID )
    REFERENCES SHOPPING_LIST_ITEMS (_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);


-- *******************************************************************
-- Table `DISCOUNT_TYPES`
-- *******************************************************************

DROP TABLE IF EXISTS DISCOUNT_TYPES;

CREATE  TABLE IF NOT EXISTS `DISCOUNT_TYPES` 
(
  _ID INTEGER PRIMARY KEY AUTOINCREMENT,
  discountName TEXT NOT NULL
);

INSERT INTO DISCOUNT_TYPES VALUES (NULL,'Sales Price Coupon');
INSERT INTO DISCOUNT_TYPES VALUES (NULL,'Buy 1 Get 1 Coupon');
INSERT INTO DISCOUNT_TYPES VALUES (NULL,'Store Discount');

-- *******************************************************************
-- Table SHOPPING_ITEM_DISCOUNTS
-- *******************************************************************

DROP TABLE IF EXISTS SHOPPING_ITEM_DISCOUNTS;

CREATE  TABLE IF NOT EXISTS SHOPPING_ITEM_DISCOUNTS 
(
  _ID INTEGER PRIMARY KEY AUTOINCREMENT,
  discountTypeID INTEGER NOT NULL ,
  shoppingListID INTEGER NOT NULL ,
  groceryCategoryID INTEGER NOT NULL ,
  genericItemName TEXT NOT NULL ,
  productName TEXT NULL ,
  manufacturer TEXT NULL ,
  value DOUBLE NULL ,
  notes MEDIUMTEXT NULL ,
  INDEX discountTypeID (discountTypeID ASC) ,
  INDEX shoppingListID (shoppingListID ASC) ,
  INDEX groceryCategoryID (groceryCategoryID ASC) ,
  FOREIGN KEY (discountTypeID)
    REFERENCES DISCOUNT_TYPES (_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (shoppingListID)
    REFERENCES SHOPPING_LISTS (_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (groceryCategoryID)
    REFERENCES GROCERY_CATEGORIES (_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
);


