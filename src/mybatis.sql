/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50134
Source Host           : localhost:3306
Source Database       : mybatis

Target Server Type    : MYSQL
Target Server Version : 50134
File Encoding         : 65001

Date: 2018-05-22 10:11:17
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
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '管理员', '这是默认的', null);
INSERT INTO `role` VALUES ('3', '普通用户', '仅供测试', null);
INSERT INTO `role` VALUES ('4', '普通用户', '仅供测试', '1');
INSERT INTO `role` VALUES ('5', '普通用户', '仅供测试', '1');
INSERT INTO `role` VALUES ('7', '普通用户', '仅供测试', 'FAMALE');
INSERT INTO `role` VALUES ('8', '普通用户', '仅供测试', 'FAMALE');
INSERT INTO `role` VALUES ('9', '普通用户', '仅供测试', 'MALE');

-- ----------------------------
-- Table structure for t_lecture
-- ----------------------------
DROP TABLE IF EXISTS `t_lecture`;
CREATE TABLE `t_lecture` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `lecture_name` varchar(60) NOT NULL COMMENT '课程名称',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1003 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_lecture
-- ----------------------------
INSERT INTO `t_lecture` VALUES ('1001', '高等数学', 'math');
INSERT INTO `t_lecture` VALUES ('1002', 'C语言程序设计', 'program language');

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `cnname` varchar(60) NOT NULL COMMENT '学生姓名',
  `sex` tinyint(4) NOT NULL COMMENT '性别',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  `effective` tinyint(4) NOT NULL COMMENT '是否有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2017053003 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student
-- ----------------------------
INSERT INTO `t_student` VALUES ('2017053001', '张磊', '1', '张磊的测试', '1');
INSERT INTO `t_student` VALUES ('2017053002', '王梅', '2', '王梅的测试', '1');

-- ----------------------------
-- Table structure for t_student_health_female
-- ----------------------------
DROP TABLE IF EXISTS `t_student_health_female`;
CREATE TABLE `t_student_health_female` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `student_id` int(20) NOT NULL COMMENT '学生编号',
  `check_date` varchar(60) NOT NULL COMMENT '检查日期',
  `heart` varchar(60) NOT NULL COMMENT '心',
  `liver` varchar(60) NOT NULL COMMENT '肝',
  `spleen` varchar(60) NOT NULL COMMENT '脾',
  `lung` varchar(60) NOT NULL COMMENT '肺',
  `kidney` varchar(60) NOT NULL COMMENT '肾',
  `uterus` varchar(60) NOT NULL COMMENT '子宫',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_health_female
-- ----------------------------
INSERT INTO `t_student_health_female` VALUES ('1', '2017053002', '2017-04-01', 'bad', 'bad', 'bad', 'bad', 'bad', 'good', 'total bad');

-- ----------------------------
-- Table structure for t_student_health_male
-- ----------------------------
DROP TABLE IF EXISTS `t_student_health_male`;
CREATE TABLE `t_student_health_male` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `student_id` int(20) NOT NULL COMMENT '学生编号',
  `check_date` varchar(60) NOT NULL COMMENT '检查日期',
  `heart` varchar(60) NOT NULL COMMENT '心',
  `liver` varchar(60) NOT NULL COMMENT '肝',
  `spleen` varchar(60) NOT NULL COMMENT '脾',
  `lung` varchar(60) NOT NULL COMMENT '肺',
  `kidney` varchar(60) NOT NULL COMMENT '肾',
  `prostate` varchar(60) NOT NULL COMMENT '前列腺',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_health_male
-- ----------------------------
INSERT INTO `t_student_health_male` VALUES ('1', '2017053001', '2017-04-01', 'good', 'good', 'good', 'good', 'good', 'normal', 'total good');

-- ----------------------------
-- Table structure for t_student_lecture
-- ----------------------------
DROP TABLE IF EXISTS `t_student_lecture`;
CREATE TABLE `t_student_lecture` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `student_id` int(20) NOT NULL COMMENT '学生编号',
  `lecture_id` int(20) NOT NULL COMMENT '课程编号',
  `grade` decimal(16,2) NOT NULL COMMENT '评分',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_lecture
-- ----------------------------
INSERT INTO `t_student_lecture` VALUES ('1', '2017053001', '1001', '98.00', 'good');
INSERT INTO `t_student_lecture` VALUES ('2', '2017053001', '1002', '61.00', 'bad');

-- ----------------------------
-- Table structure for t_student_selfcard
-- ----------------------------
DROP TABLE IF EXISTS `t_student_selfcard`;
CREATE TABLE `t_student_selfcard` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `student_id` int(20) NOT NULL COMMENT '学生编号',
  `native` varchar(60) NOT NULL COMMENT '籍贯',
  `issue_date` date NOT NULL COMMENT '发证日期',
  `end_date` date NOT NULL COMMENT '结束发证日期',
  `note` varchar(1024) DEFAULT NULL COMMENT '备注',
  `student_effective` tinyint(4) NOT NULL COMMENT '学生是否有效',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_student_selfcard
-- ----------------------------
INSERT INTO `t_student_selfcard` VALUES ('1', '2017053001', '江苏', '2017-01-01', '2017-12-31', '张三的学生证测试', '1');
