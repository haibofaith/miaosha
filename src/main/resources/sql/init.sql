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


SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `login_user`
-- ----------------------------
DROP TABLE IF EXISTS `login_user`;
CREATE TABLE `login_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records of `login_user`
-- ----------------------------
BEGIN;
INSERT INTO `login_user` VALUES ('1', '18511068606', 'b7797cce01b4b131b433b6acf4add449');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
