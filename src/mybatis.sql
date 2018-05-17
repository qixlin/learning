/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50134
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50134
File Encoding         : 65001

Date: 2018-05-17 17:47:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `role_name` varchar(255) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员', '这是默认的');
INSERT INTO `role` VALUES ('3', '普通用户', '仅供测试');

-- ----------------------------
-- Table structure for role_copy
-- ----------------------------
DROP TABLE IF EXISTS `role_copy`;
CREATE TABLE `role_copy` (
  `id` bigint(20) NOT NULL,
  `role_name` varchar(255) DEFAULT NULL,
  `notes` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_copy
-- ----------------------------
INSERT INTO `role_copy` VALUES ('1', '管理员', '这是默认的');
INSERT INTO `role_copy` VALUES ('3', '普通用户', '仅供测试');
