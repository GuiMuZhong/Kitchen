-- 数据库初始化脚本

-- 创建数据库
CREATE DATABASE Kitchen;
-- 使用数据库
USE Kitchen;


-- 创建用户信息表
CREATE TABLE user(
    `user_id` INT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
    `user_name` VARCHAR(120) NOT NULL COMMENT '用户名称',
    `user_password` VARCHAR(60) NOT NULL COMMENT '用户密码',
    `user_email` VARCHAR(60) NOT NULL UNIQUE COMMENT '用户邮箱',
    `user_type` TINYINT NOT NULL COMMENT '用户类型',
    PRIMARY KEY (`user_id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 COMMENT '用户信息表';

-- 初始化用户信息表数据
INSERT INTO
    user(user_name, user_password, user_email, user_type)
VALUES
    ('CQW', '123456', 'cqw@qq.com', '0'),
    ('ZYX', '123456', 'zyx@qq.com', '1'),
    ('LZR', '123456', 'lzr@qq.com', '1');


-- 创建房间信息表
CREATE TABLE house(
    `house_id` INT NOT NULL AUTO_INCREMENT COMMENT '房间ID',
    `house_name` VARCHAR(60) NOT NULL COMMENT '房间名称',
    `house_master` INT NOT NULL COMMENT '房间主人',
    `house_area` DOUBLE NOT NULL COMMENT '房间面积',
    `house_number` VARCHAR(10) NOT NULL COMMENT '房间号',
    FOREIGN KEY (`house_master`) REFERENCES user(`user_id`),
    PRIMARY KEY (`house_id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8 COMMENT '房间信息表';

-- 初始化房间信息表数据
INSERT INTO
    house(house_name, house_master, house_area, house_number)
VALUES
    ('桃花岛', '1', '200', '208'),
    ('风陵渡', '2', '200', '308'),
    ('断肠崖', '3', '208', '408');


-- 创建温湿度记录表
CREATE TABLE temhum(
    `house_id` INT NOT NULL COMMENT '房间ID',
    `record_time` TIMESTAMP NOT NULL COMMENT '记录时间',
    `temperature` DOUBLE NOT NULL COMMENT '温度',
    `humidity` DOUBLE NOT NULL COMMENT '湿度',
    FOREIGN KEY (`house_id`) REFERENCES house(`house_id`),
    PRIMARY KEY (`house_id`, `record_time`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='温湿度记录表';

-- 初始化温湿度记录表数据
INSERT INTO
    temhum(house_id, record_time, temperature, humidity)
VALUES
    (1, '2019-08-28 00:00:00', 20, 0.3),
    (1, '2019-08-28 01:00:00', 21, 0.3),
    (1, '2019-08-28 02:00:00', 22, 0.3),
    (1, '2019-08-28 03:00:00', 23, 0.3),
    (1, '2019-08-28 04:00:00', 24, 0.3),
    (1, '2019-08-28 05:00:00', 25, 0.3),
    (1, '2019-08-28 06:00:00', 26, 0.3),
    (2, '2019-08-28 00:00:00', 20, 0.3),
    (2, '2019-08-28 01:00:00', 21, 0.3),
    (2, '2019-08-28 02:00:00', 22, 0.3),
    (2, '2019-08-28 03:00:00', 23, 0.3),
    (2, '2019-08-28 04:00:00', 24, 0.3),
    (2, '2019-08-28 05:00:00', 25, 0.3),
    (2, '2019-08-28 06:00:00', 26, 0.3),
    (3, '2019-08-28 00:00:00', 20, 0.3),
    (3, '2019-08-28 01:00:00', 21, 0.3),
    (3, '2019-08-28 02:00:00', 22, 0.3),
    (3, '2019-08-28 03:00:00', 23, 0.3),
    (3, '2019-08-28 04:00:00', 24, 0.3),
    (3, '2019-08-28 05:00:00', 25, 0.3),
    (3, '2019-08-28 06:00:00', 26, 0.3);


-- 创建打卡记录表
CREATE TABLE daka(
    `user_id` INT NOT NULL COMMENT '用户ID',
    `record_time` TIMESTAMP NOT NULL COMMENT '记录时间',
    FOREIGN KEY (`user_id`) REFERENCES user(`user_id`),
    PRIMARY KEY (`user_id`, `record_time`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='打卡记录表';

-- 初始化打卡记录表数据
INSERT INTO
    daka(user_id, record_time)
VALUES
    (1, '2019-08-28 09:00:00'),
    (1, '2019-08-28 18:00:00'),
    (2, '2019-08-28 09:00:00'),
    (2, '2019-08-28 18:00:00'),
    (3, '2019-08-28 09:00:00'),
    (3, '2019-08-28 18:00:00');

/*
show databases;
show tables;
show create table user\g
select * from user;
select * from house;
select * from temhum;
select * from daka;
 */