CREATE TABLE `OneMillionData` (
 `id` int(11) NOT NULL,
 `userName` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
 `fullName` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
 `province` varchar(255) CHARACTER SET utf8mb4 NOT NULL,
 `age` int(3) DEFAULT NULL,
 PRIMARY KEY (`id`),
 UNIQUE KEY `Username_UNIQUE` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

-- Q2 Tìm username có tên ghtk
SHOW index from OneMillionData 
SELECT * FROM OneMillionData omd  WHERE omd.userName LIKE "%ghtk%" 

-- Q3 Tìm top 10 user ? sài gòn có tu?i cao nh?t
CREATE INDEX prindex ON OneMillionData (province)
SELECT * FROM OneMillionData omd where omd.province like "%Thành ph? H? Chí Minh"
order by omd.age DESC limit 10;
-- ch?a có index 2s59.có index 700ms
