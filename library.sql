/*
Navicat MySQL Data Transfer

Source Server         : drake
Source Server Version : 50022
Source Host           : localhost:3306
Source Database       : library

Target Server Type    : MYSQL
Target Server Version : 50022
File Encoding         : 65001

Date: 2019-03-11 21:02:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rooms
-- ----------------------------
DROP TABLE IF EXISTS `rooms`;
CREATE TABLE `rooms` (
  `id` int(11) NOT NULL auto_increment,
  `room` int(11) NOT NULL,
  `floor` int(11) NOT NULL,
  PRIMARY KEY  (`id`,`room`),
  UNIQUE KEY `unique` USING BTREE (`room`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of rooms
-- ----------------------------
INSERT INTO `rooms` VALUES ('1', '101', '1');
INSERT INTO `rooms` VALUES ('2', '102', '1');
INSERT INTO `rooms` VALUES ('3', '301', '3');

-- ----------------------------
-- Table structure for seats
-- ----------------------------
DROP TABLE IF EXISTS `seats`;
CREATE TABLE `seats` (
  `id` int(11) NOT NULL auto_increment,
  `room` int(11) NOT NULL,
  `position` varchar(255) character set utf8 default NULL,
  `exist` varchar(255) character set utf8 default 'no',
  PRIMARY KEY  (`id`,`room`),
  UNIQUE KEY `unique` USING BTREE (`position`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of seats
-- ----------------------------
INSERT INTO `seats` VALUES ('1', '101', '1,1', '1');
INSERT INTO `seats` VALUES ('2', '101', '1,2', '0');
INSERT INTO `seats` VALUES ('3', '101', '2,1', '1');
INSERT INTO `seats` VALUES ('4', '101', '2,2', '1');
