/*
Navicat MySQL Data Transfer

Source Server         : 阿里云RDS
Source Server Version : 50732
Source Host           : rm-bp177h34qu3p00oj8bo.mysql.rds.aliyuncs.com:3306
Source Database       : linux-helloword

Target Server Type    : MYSQL
Target Server Version : 50732
File Encoding         : 65001

Date: 2021-11-19 11:41:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for helloinfo
-- ----------------------------
DROP TABLE IF EXISTS `helloinfo`;
CREATE TABLE `helloinfo` (
  `id` int(255) NOT NULL,
  `content` varchar(255) NOT NULL,
  `ip` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of helloinfo
-- ----------------------------
INSERT INTO `helloinfo` VALUES ('1', 'hello，天翼云主机', '203.56.192.178');
INSERT INTO `helloinfo` VALUES ('2', 'hello，阿里云主机1', '139.196.40.171');
INSERT INTO `helloinfo` VALUES ('3', 'hello，阿里云主机2', '121.199.44.171');
