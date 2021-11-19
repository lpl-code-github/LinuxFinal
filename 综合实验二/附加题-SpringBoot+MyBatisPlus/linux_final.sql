/*
Navicat MySQL Data Transfer

Source Server         : 阿里云ECS_MySQL
Source Server Version : 50736
Source Host           : 121.199.44.171:3306
Source Database       : linux_final

Target Server Type    : MYSQL
Target Server Version : 50736
File Encoding         : 65001

Date: 2021-11-19 12:00:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` int(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('1', 'Alan');
INSERT INTO `t_student` VALUES ('2', '徐老师');
INSERT INTO `t_student` VALUES ('3', 'Tony');
INSERT INTO `t_student` VALUES ('4', '李鹏龙');
