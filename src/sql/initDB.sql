CREATE DATABASE mytest;

CREATE TABLE user(
  user_id INT(4) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  user_name VARCHAR(255) NOT NULL ,
  password VARCHAR(255) NOT NULL ,
  phone VARCHAR(255) NOT NULL,
  order_number varchar(50)
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

CREATE TABLE `t_order` (
`id` int(4) NOT NULL PRIMARY KEY AUTO_INCREMENT,
`user_id` int(4) NOT NULL ,
`order_number` varchar(50) NULL ,
`uid` int(10) NULL ,
`pay_price` double(20,2) NULL ,
`is_pay` tinyint(4) NULL ,
`pay_time` int(10) NULL ,
`is_ship` tinyint(4) NULL ,
`ship_time` int(10) NULL ,
`is_receipt` tinyint(4) NULL ,
`receipt_time` int(10) NULL ,
`ship_nmber` varchar(100) NULL ,
`status` tinyint(4) NULL ,
`create_time` int(10) NULL ,
`update_time` int(10) NULL
) ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;
