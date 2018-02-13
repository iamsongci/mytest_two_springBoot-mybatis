# Host: 127.0.0.1  (Version 5.7.18)
# Date: 2018-02-13 18:00:16
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "t_student"
#

CREATE TABLE `t_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  `role_id` tinyint(3) unsigned DEFAULT '4' COMMENT '1:班长 2:班委 3:组长 4:普通成员',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='学生表';

#
# Data for table "t_student"
#

INSERT INTO `t_student` VALUES (7,'小张6',2,'2018-02-09 10:03:43','2018-02-13 17:42:51'),(8,'小张7',3,'2018-02-09 10:03:43','2018-02-13 15:59:42'),(9,'小张8',2,'2018-02-09 10:03:43','2018-02-13 17:42:56'),(10,'小张9',3,'2018-02-09 10:03:43','2018-02-13 15:59:44'),(17,'1',1,'2018-02-13 15:29:55','2018-02-13 17:27:28'),(19,'4',3,'2018-02-13 15:30:48','2018-02-13 15:59:41'),(20,'123',3,'2018-02-13 15:40:17','2018-02-13 15:59:45'),(21,'3',3,'2018-02-13 15:48:21',NULL),(22,'111',3,'2018-02-13 15:49:13','2018-02-13 15:59:47'),(23,'1',3,'2018-02-13 16:00:09','2018-02-13 16:21:16'),(24,'张三',3,'2018-02-13 16:59:48',NULL);
