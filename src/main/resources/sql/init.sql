CREATE TABLE `haibodb`.`miaosha_user` (
	`id` bigint(20) NOT NULL,
	`nickname` varchar(255) NOT NULL,
	`password` varchar(32) DEFAULT NULL,
	`salt` varchar(10) DEFAULT NULL,
	`head` varchar(128) DEFAULT NULL,
	`register_date` datetime DEFAULT NULL,
	`last_login_date` datetime DEFAULT NULL,
	`login_count_int` int(11) DEFAULT 0,
	PRIMARY KEY (`id`)
) ENGINE=`InnoDB` CHARACTER SET utf8mb4;