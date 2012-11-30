-- -----------------------------------------------------
-- Schema `MY_GRUB
-- -----------------------------------------------------

DROP SCHEMA IF EXISTS `MY_GRUB`;

CREATE SCHEMA IF NOT EXISTS `MY_GRUB` DEFAULT CHARACTER SET latin1 COLLATE default;
USE `MY_GRUB`;


-- --------------------------------------------------------------------------
-- Table `MY_GRUB`.`MEASUREMENTS`
-- --------------------------------------------------------------------------

-- DROP TABLE IF EXISTS `MY_GRUB`.`MEASUREMENTS`;

CREATE  TABLE IF NOT EXISTS `MY_GRUB`.`MEASUREMENTS` (
  `_ID` INT NOT NULL AUTO_INCREMENT ,
  `typeName` VARCHAR(20) NOT NULL ,
  `symbol` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`_ID`) )
ENGINE = InnoDB;

INSERT INTO `MEASUREMENTS` VALUES (NULL,'gallon','gal');
INSERT INTO `MEASUREMENTS` VALUES (NULL,'liter','liter');
INSERT INTO `MEASUREMENTS` VALUES (NULL,'milliliter','mL');
INSERT INTO `MEASUREMENTS` VALUES (NULL,'ounce','oz');
INSERT INTO `MEASUREMENTS` VALUES (NULL,'pint','pt');
INSERT INTO `MEASUREMENTS` VALUES (NULL,'quart','qt');
INSERT INTO `MEASUREMENTS` VALUES (NULL,'cups','cp');
INSERT INTO `MEASUREMENTS` VALUES (NULL,'pounds','lbs');
INSERT INTO `MEASUREMENTS` VALUES (NULL,'grams','g');
INSERT INTO `MEASUREMENTS` VALUES (NULL,'kilograms','kg');
INSERT INTO `MEASUREMENTS` VALUES (NULL,'teaspoons','tsp');
INSERT INTO `MEASUREMENTS` VALUES (NULL,'table spoons','Tbls');

-- --------------------------------------------------------------------------
-- Table `MY_GRUB`.`GROCERY_STORES`
-- --------------------------------------------------------------------------

-- DROP TABLE IF EXISTS `MY_GRUB`.`GROCERY_STORES`;

CREATE  TABLE IF NOT EXISTS `MY_GRUB`.`GROCERY_STORES` (
  `_ID` INT NOT NULL AUTO_INCREMENT ,
  `storeName` VARCHAR(45) NOT NULL ,
  `storeNumber` VARCHAR(10) NULL ,
  `storeBrandName` VARCHAR(45) NULL ,
  `streetAddress` VARCHAR(80) NULL ,
  `city` VARCHAR(45) NULL ,
  `state` VARCHAR(45) NULL ,
  `zipCode` VARCHAR(5) NULL ,
  `zipCode2` VARCHAR(4) NULL ,
  PRIMARY KEY (`_ID`) )
ENGINE = InnoDB;

INSERT INTO `GROCERY_STORES` VALUES (NULL, 'WalMart', '', 'Great Value', '150 N Beckley St', 'Lancaster', 'TX', '75146', '1844');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Albertsons','', 'Albertsons Generic', '1300 W Belt Line Rd', 'Desoto', 'TX', '75115','3628');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Tom Thumb', '', 'Tom Thumb Generic', '210 E Pleasant Run Rd', 'Desoto', 'TX', '75115','3938');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Kroger', '', 'Kroger Generic', '1001 N I 35 E # 500', 'Desoto', 'TX', '75115','6800');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Minyard', '', 'Minyard Generic', '919 N Dallas Ave', 'Lancaster', 'TX', '75146','1615');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Safeway', '', 'SafeWay Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'QFC','', 'QFC Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Whole Foods', '', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Smiths', '', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Target', '', 'Target Generic', 'U S Hwy 67', 'Cedar Hill', 'TX', '75104','');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Ralphs', '', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Fiesta', '', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'HEC','', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Piggly wiggly', '', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Winn Dixie', '', 'Generic', '', 'Dallas', 'TX', '75154','');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Costco', '', 'Costco Generic', '250 W Highway 67', 'Duncanville', 'TX', '75137','4415');
INSERT INTO `GROCERY_STORES` VALUES (NULL, 'Sams', '', 'Sams Generic', '2900 Wheatland Rd', 'Dallas', 'TX', '75237','');

-- --------------------------------------------------------------------------
-- Table `MY_GRUB`.`GROCERY_CATEGORIES`
-- --------------------------------------------------------------------------

-- DROP TABLE IF EXISTS `MY_GRUB`.`GROCERY_CATEGORIES`;

CREATE  TABLE IF NOT EXISTS `MY_GRUB`.`GROCERY_CATEGORIES` (
  `_ID` INT NOT NULL AUTO_INCREMENT ,
  `categoryName` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`_ID`) )
ENGINE = InnoDB;

INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Bakery');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Deli');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Fruits');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Vegtables');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Bread');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Dairy');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Condiments');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Beverages');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Baking');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Spices');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Sauces/Oils');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Meat/Seafood');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Can/Jar Goods');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Packaged Foods');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Frozen Foods');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Snacks');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Breakfast');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Paper/Wraps');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Cleaning');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Personal Care');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Baby');
INSERT INTO `GROCERY_CATEGORIES` VALUES (NULL,'Pets');

-- -----------------------------------------------------------------
-- Table `MY_GRUB`.`GROCERY_ITEMS`
-- -----------------------------------------------------------------

-- DROP TABLE IF EXISTS `MY_GRUB`.`GROCERY_ITEMS`;

CREATE  TABLE IF NOT EXISTS `MY_GRUB`.`GROCERY_ITEMS` (
  `_ID` INT NOT NULL AUTO_INCREMENT ,
  `categoryID` INT NOT NULL ,
  `genericName` VARCHAR(45) NOT NULL ,
  `specificName` VARCHAR(45) NULL ,
  `brandName` VARCHAR(45) NULL ,
  `upcNumber` INT NULL DEFAULT 0 ,
  `barcodeImage` VARCHAR(256) NULL ,
  `itemImage` VARCHAR(256) NULL ,
  PRIMARY KEY (`_ID`) ,
  INDEX `categoryID` (`categoryID` ASC) ,
  FOREIGN KEY (`categoryID` )
    REFERENCES `MY_GRUB`.`GROCERY_CATEGORIES` (`_ID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


LOAD DATA
  INFILE 'C:/users/Joel/workspace/mobetter/GRUB/database/data/fresh_fruit.csv'
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ','
  LINES TERMINATED BY '\r\n' (categoryID,genericName,specificName);


LOAD DATA
  INFILE 'C:/users/Joel/workspace/mobetter/GRUB/database/data/fresh_produce.csv'
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ','
  LINES TERMINATED BY '\r\n' (categoryID,genericName,specificName);

LOAD DATA
  INFILE 'C:/users/Joel/workspace/mobetter/GRUB/database/data/spices.csv'
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ','
  LINES TERMINATED BY '\r\n' (categoryID,genericName,specificName);

LOAD DATA
  INFILE 'C:/users/Joel/workspace/mobetter/GRUB/database/data/baking.csv'
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ','
  LINES TERMINATED BY '\r\n' (categoryID,genericName,specificName);

LOAD DATA
  INFILE 'C:/users/Joel/workspace/mobetter/GRUB/database/data/canned_goods.csv'
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ','
  LINES TERMINATED BY '\r\n' (categoryID,genericName,specificName);

LOAD DATA
  INFILE 'C:/users/Joel/workspace/mobetter/GRUB/database/data/breakfast_foods.csv'
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ','
  LINES TERMINATED BY '\r\n' (categoryID,genericName,specificName);

LOAD DATA
  INFILE 'C:/users/Joel/workspace/mobetter/GRUB/database/data/beverages.csv'
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ','
  LINES TERMINATED BY '\r\n' (categoryID,genericName,specificName);

LOAD DATA
  INFILE 'C:/users/Joel/workspace/mobetter/GRUB/database/data/dairy.csv'
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ','
  LINES TERMINATED BY '\r\n' (categoryID,genericName,specificName);

LOAD DATA
  INFILE 'C:/users/Joel/workspace/mobetter/GRUB/database/data/condiments.csv'
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ','
  LINES TERMINATED BY '\r\n' (categoryID,genericName,specificName);

LOAD DATA
  INFILE 'C:/users/Joel/workspace/mobetter/GRUB/database/data/snacks.csv'
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ','
  LINES TERMINATED BY '\r\n' (categoryID,genericName,specificName);

LOAD DATA
  INFILE 'C:/users/Joel/workspace/mobetter/GRUB/database/data/packaged_foods.csv'
  INTO TABLE GROCERY_ITEMS
  FIELDS TERMINATED BY ','
  LINES TERMINATED BY '\r\n' (categoryID,genericName,specificName);

Update MY_GRUB.GROCERY_ITEMS
  SET specificName=NULL
  WHERE specificName='NULL' OR specificName='';


-- --------------------------------------------------------------------------------------
-- View `MY_GRUB`.`GENERIC_GROCERY_TYPES`
-- --------------------------------------------------------------------------------------

-- DROP VIEW IF EXISTS `MY_GRUB`.`GENERIC_GROCERY_TYPES`;

CREATE  VIEW GENERIC_GROCERY_TYPES AS
  SELECT DISTINCT genericName FROM `MY_GRUB`.`GROCERY_ITEMS`;


-- -----------------------------------------------------
-- Table `MY_GRUB`.`PANTRY_ITEMS`
-- -----------------------------------------------------

-- DROP TABLE IF EXISTS `MY_GRUB`.`PANTRY_ITEMS`;

CREATE  TABLE IF NOT EXISTS `MY_GRUB`.`PANTRY_ITEMS` (
  `_ID` INT NOT NULL AUTO_INCREMENT ,
  `groceryItemID` INT NOT NULL ,
  `containerSizeID` INT NOT NULL ,
  `containerSizeValue` DOUBLE NOT NULL ,
  `groceryStoreID` INT NULL ,
  `staple` TINYINT(1) NULL ,
  `quantity` INT NULL ,
  `cost` DOUBLE NULL ,
  PRIMARY KEY (`_ID`) ,
  INDEX `groceryItemID` (`groceryItemID` ASC) ,
  INDEX `containerSizeID` (`containerSizeID` ASC) ,
  FOREIGN KEY (`groceryItemID`)
    REFERENCES `MY_GRUB`.`GROCERY_ITEMS` (`_ID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (`groceryStoreID`)
    REFERENCES `MY_GRUB`.`GROCERY_STORES` (`_ID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (`containerSizeId` )
    REFERENCES `MY_GRUB`.`MEASUREMENTS` (`_ID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `MY_GRUB`.`SHOPPING_LISTS`
-- -----------------------------------------------------

-- DROP TABLE IF EXISTS `MY_GRUB`.`SHOPPING_LISTS`;

CREATE  TABLE IF NOT EXISTS `MY_GRUB`.`SHOPPING_LISTS` (
  `_ID` INT NOT NULL AUTO_INCREMENT ,
  `listName` VARCHAR(45) NOT NULL ,
  `groceryStoreID` INT NOT NULL ,
  `dueDate` DATETIME NULL ,
  `alarm` DATETIME NULL ,
  PRIMARY KEY (`_ID`) ,
  INDEX `groceryStoreID` (`groceryStoreID` ASC) ,
  FOREIGN KEY (`groceryStoreID` )
    REFERENCES `MY_GRUB`.`GROCERY_STORES` (`_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `MY_GRUB`.`SHOPPING_LIST_ITEMS`
-- -----------------------------------------------------

-- DROP TABLE IF EXISTS `MY_GRUB`.`SHOPPING_LIST_ITEMS`;

CREATE  TABLE IF NOT EXISTS `MY_GRUB`.`SHOPPING_LIST_ITEMS` (
  `_ID` INT NOT NULL AUTO_INCREMENT ,
  `groceryItemID` INT NOT NULL ,
  `shoppingListID` INT NOT NULL ,
  `containerSizeID` INT NOT NULL ,
  `containerSizeValue` DOUBLE NOT NULL ,
  `quantity` INT NULL DEFAULT 0,
  `cost` DOUBLE NULL DEFAULT 0.00,
  PRIMARY KEY (`_ID`) ,
  INDEX `groceryItemID` (`groceryItemID` ASC) ,
  INDEX `shoppingListID` (`shoppingListID` ASC) ,
  INDEX `containerSizeID` (`containerSizeID` ASC) ,
  FOREIGN KEY (`groceryItemID` )
    REFERENCES `MY_GRUB`.`GROCERY_ITEMS` (`_ID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (`shoppingListID` )
    REFERENCES `MY_GRUB`.`SHOPPING_LISTS` (`_ID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (`containerSizeID` )
    REFERENCES `MY_GRUB`.`MEASUREMENTS` (`_ID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `MY_GRUB`.`SHOPPING_CART`
-- -----------------------------------------------------

-- DROP TABLE IF EXISTS `MY_GRUB`.`SHOPPING_CART`;

CREATE  TABLE IF NOT EXISTS `MY_GRUB`.`SHOPPING_CART_ITEMS` (
  `_ID` INT NOT NULL AUTO_INCREMENT ,
  `shoppingListID` INT NOT NULL ,
  PRIMARY KEY (`_ID`) ,
  INDEX `shoppingListID` (`shoppingListID` ASC) ,
  FOREIGN KEY (`shoppingListID` )
    REFERENCES `MY_GRUB`.`SHOPPING_LIST_ITEMS` (`_ID` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `MY_GRUB`.`DISCOUNT_TYPES`
-- -----------------------------------------------------

-- DROP TABLE IF EXISTS `MY_GRUB`.`DISCOUNT_TYPES`;

CREATE  TABLE IF NOT EXISTS `MY_GRUB`.`DISCOUNT_TYPES` (
  `_ID` INT NOT NULL AUTO_INCREMENT ,
  `discountName` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`_ID`) )
ENGINE = InnoDB;

INSERT INTO `DISCOUNT_TYPES` VALUES (NULL,'Sales Price Coupon');
INSERT INTO `DISCOUNT_TYPES` VALUES (NULL,'Buy 1 Get 1 Coupon');
INSERT INTO `DISCOUNT_TYPES` VALUES (NULL,'Store Discount');

-- -----------------------------------------------------
-- Table `MY_GRUB`.`SHOPPING_ITEM_DISCOUNTS`
-- -----------------------------------------------------

-- DROP TABLE IF EXISTS `MY_GRUB`.`SHOPPING_ITEM_DISCOUNTS`;

CREATE  TABLE IF NOT EXISTS `MY_GRUB`.`SHOPPING_ITEM_DISCOUNTS` (
  `_ID` INT NOT NULL AUTO_INCREMENT ,
  `discountTypeID` INT NOT NULL ,
  `shoppingListID` INT NOT NULL ,
  `groceryCategoryID` INT NOT NULL ,
  `genericItemName` VARCHAR(45) NOT NULL ,
  `productName` VARCHAR(45) NULL ,
  `manufacturer` VARCHAR(45) NULL ,
  `value` DOUBLE NULL ,
  `notes` MEDIUMTEXT NULL ,
  PRIMARY KEY (`_ID`) ,
  INDEX `discountTypeID` (`discountTypeID` ASC) ,
  INDEX `shoppingListID` (`shoppingListID` ASC) ,
  INDEX `groceryCategoryID` (`groceryCategoryID` ASC) ,
  FOREIGN KEY (`discountTypeID`)
    REFERENCES `MY_GRUB`.`DISCOUNT_TYPES` (`_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (`shoppingListID`)
    REFERENCES `MY_GRUB`.`SHOPPING_LISTS` (`_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  FOREIGN KEY (`groceryCategoryID`)
    REFERENCES `MY_GRUB`.`GROCERY_CATEGORIES` (`_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



-- SET SQL_MODE=@OLD_SQL_MODE;
-- SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
-- SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;