
-- SELECT item_id FROM grocery_categories As CATEGORY_NAME WHERE Grocery_Category_Name = 'Fruits';



LOAD DATA
  INFILE 'C:/Users/Joel/workspace/mobetter/GRUB/database/data/fresh_fruit.csv'
  INTO TABLE grocery_catalog
  FIELDS TERMINATED BY ','
  LINES TERMINATED BY '\n' (category_id,generic_item_name,specific_item_name);