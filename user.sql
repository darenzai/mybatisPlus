/*
 Navicat MySQL Data Transfer

 Source Server         : MySQL5.7
 Source Server Type    : MySQL
 Source Server Version : 50733
 Source Host           : localhost:3206
 Source Schema         : myemployees

 Target Server Type    : MySQL
 Target Server Version : 50733
 File Encoding         : 65001

 Date: 29/04/2022 10:56:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `version` int(2) NULL DEFAULT NULL,
  `deleted` int(2) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '小胡', 99, NULL, NULL, NULL, 1);
INSERT INTO `user` VALUES (2, 'qwww', 40, NULL, NULL, NULL, 0);
INSERT INTO `user` VALUES (3, 'qwww', 20, NULL, NULL, NULL, 0);
INSERT INTO `user` VALUES (4, 'qwww', 10, NULL, NULL, NULL, 0);
INSERT INTO `user` VALUES (5, NULL, 23, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
