CREATE TABLE `OneMillionData` (
 `id` int(11) NOT NULL,
 `userName` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
 `fullName` varchar(45) CHARACTER SET utf8mb4 NOT NULL,
 `province` varchar(255) CHARACTER SET utf8mb4 NOT NULL,
 `age` int(3) DEFAULT NULL,
 PRIMARY KEY (`id`),
 UNIQUE KEY `Username_UNIQUE` (`Username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1

-- Q2 T�m username c� t�n ghtk
SHOW index from OneMillionData 
SELECT * FROM OneMillionData omd  WHERE omd.userName LIKE "%ghtk%" 

-- Q3 T�m top 10 user ? s�i g�n c� tu?i cao nh?t
CREATE INDEX prindex ON OneMillionData (province)
SELECT * FROM OneMillionData omd where omd.province like "%Th�nh ph? H? Ch� Minh"
order by omd.age DESC limit 10;
-- ch?a c� index 2s59.c� index 700ms
