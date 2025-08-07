INSERT INTO categories (id, name) VALUES
(1, 'Fruits'),
(2, 'Dairy'),
(3, 'Bakery'),
(4, 'Beverages'),
(5, 'Snacks'),
(6, 'Meat'),
(7, 'Vegetables'),
(8, 'Frozen'),
(9, 'Pantry'),
(10, 'Household');

INSERT INTO products (name, price, description, category_id) VALUES
('Bananas', 1.29, 'Fresh ripe bananas, sold per pound.', 1),
('Organic Whole Milk', 3.49, '1 gallon of organic whole milk from grass-fed cows.', 2),
('Sourdough Bread Loaf', 4.25, 'Artisan sourdough bread, crusty outside and soft inside.', 3),
('Coca-Cola 2L', 2.15, 'Classic Coca-Cola, 2-liter bottle.', 4),
('Lays Classic Potato Chips', 3.99, 'Crispy salted potato chips, family-size bag.', 5),
('Boneless Chicken Breast', 6.75, 'Skinless, boneless chicken breast per pound.', 6),
('Fresh Broccoli Bunch', 2.49, 'Locally grown, fresh broccoli.', 7),
('Frozen Pepperoni Pizza', 5.99, 'Ready-to-bake frozen pepperoni pizza, 12 inches.', 8),
('Uncle Ben’s Basmati Rice', 3.79, '2 lb bag of premium basmati rice.', 9),
('Bounty Paper Towels (6-pack)', 7.99, '6 rolls of ultra-absorbent paper towels.', 10);
