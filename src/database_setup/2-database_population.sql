
-- Market Manager
-- (C) Brackenbit 2023
--
-- Database setup script
-- 2 - Populate with example data

-- Warning! Assumes tables are empty.


INSERT INTO `stallholder` VALUES
(1, "Big Jim's Sandwiches", "Food & Drink", "Jim Robertson", "Jim", "+61430123456", "jim@bigjims.com", 1, 1, "vanSide, power"),
(2, "Artichoke & Typewriter", "Clothing", "Shauna Martin", NULL, "+61430123456", "artichokeandtypewriter@gmail.com",  1, 1, ""),
(3, "Doggy Delights", "Pets", "Reba Small", "Reba", "+61430123456", "reba@email.com",  1, 1, ""),
(4, "Salami salami salami!", "Meat", "Les Matthews", "Bluey", "+61430123456", "les@smallgoods.com", 1, 1, "marqueeEssential, power"),
(5, "Rare Flavours", "Pantry", "Jamil Voon", "Jamil", "+61430123456", "admin@rareflavours.com", 1, 1, ""),
(6, "The Friendly Baker", "Bakery", "Christopher Eaton", "Chris", "+61430123456", "chris@email.com", 1, 1, ""),
(7, "Green Cellar", "Pantry", "Annmarie Marsh", NULL, "+61430123456", "amarsh@greencellar.com", 0, 1, ""),
(8, "Jackson Woodworking", "Other", "Alan Jackson", NULL, "+61430123456", "jacksonwoodworking@proton.me", 0, 2, ""),
(9, "Mega Veg", "Fruit & Veg", "Amado Lam", "Amado", "+61430123456", "veggietime@yahoo.com", 1, 2, ""),
(10, "Eco Coffee", "Food & Drink", "Alan Gilbert", "Alan", "+61430123456", "info@ecocoffee.com", 1, 1, "vanEnd"),
(11, "Crazy for Apples", "Fruit & Veg", "Mable Lane", "Mable", "+61430123456", "getreadyforapples@apple.com", 1, 1, ""),
(12, "Lemon & Pepper", "Other", "Melinda Willis", "Mel", "+61430123456", "lemonandpepper@email.com", 0, 1, "");


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


INSERT INTO `market_recurrence_pattern` VALUES
-- Demo recurring event: 2nd and 4th Saturdays of every month except Jul and Dec
(1, "Regular Market", "2023-11-01", "2025-12-30", 6, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0);
