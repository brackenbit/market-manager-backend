
-- Market Manager
-- (C) Brackenbit 2023
--
-- Database setup script
-- 2 - Populate with example data

-- Warning! Assumes tables are empty.


INSERT INTO `stallholder` VALUES
(1, "Big Jim's Sandwiches", "Jim Robertson", "+61430123456", "jim@bigjims.com", "Food and Drink", 1, 1, "vanSide, power"),
(2, "Artichoke & Typewriter", "Shauna Martin", "+61430123456", "artichokeandtypewriter@gmail.com", "Clothing", 1, 1, ""),
(3, "Doggy Delights", "Reba Small", "+61430123456", "reba@email.com", "Pets", 1, 1, ""),
(4, "Salami salami salami!", "Les Matthews", "+61430123456", "les@smallgoods.com", "Meat", 1, 1, "marqueeEssential, power"),
(5, "Rare Flavours", "Jamil Voon", "+61430123456", "admin@rareflavours.com", "Pantry", 1, 1, ""),
(6, "The Friendly Baker", "Christopher Eaton", "+61430123456", "chris@email.com", "Bakery", 1, 1, ""),
(7, "Green Cellar", "Annmarie Marsh", "+61430123456", "amarsh@greencellar.com", "Pantry", 0, 1, ""),
(8, "Jackson Woodworking", "Alan Jackson", "+61430123456", "jacksonwoodworking@proton.me", "Other", 0, 2, ""),
(9, "Mega Veg", "Amado Lam", "+61430123456", "veggietime@yahoo.com", "Fruit & Veg", 1, 2, ""),
(10, "Eco Coffee", "Alan Gilbert", "+61430123456", "info@ecocoffee.com", "Food and Drink", 1, 1, "vanEnd"),
(11, "Crazy for Apples", "Mable Lane", "+61430123456", "getreadyforapples@apple.com", "Fruit & Veg", 1, 1, ""),
(12, "Lemon & Pepper", "Melinda Willis", "+61430123456", "lemonandpepper@email.com", "Other", 0, 1, "");


INSERT INTO `stallholder_category` VALUES
(1, "Bakery"),
(2, "Clothing"),
(3, "Food & Drink"),
(4, "Fruit & Veg"),
(5, "Meat"),
(6, "Other"),
(7, "Pantry"),
(8, "Pets");


INSERT INTO `market_event` VALUES
(1, "Market", "2023-11-04"),
(2, "Market", "2023-11-18"),
(3, "Market", "2023-12-02"),
(4, "Market", "2023-12-16");

