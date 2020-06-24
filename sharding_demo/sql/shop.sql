CREATE TABLE `shop_01` (
  `id` bigint(50) NOT NULL,
  `productname` varchar(50) NOT NULL,
  `price` decimal(7,0) DEFAULT NULL,
  `picpath` varchar(40) DEFAULT NULL,
  `discription` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `shop_02` (
  `id` bigint(50) NOT NULL,
  `productname` varchar(50) NOT NULL,
  `price` decimal(7,0) DEFAULT NULL,
  `picpath` varchar(40) DEFAULT NULL,
  `discription` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
