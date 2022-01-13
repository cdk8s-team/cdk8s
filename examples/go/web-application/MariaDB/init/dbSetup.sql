CREATE DATABASE IF NOT EXISTS `test`;

USE `test`;

CREATE TABLE IF NOT EXISTS `test`.`test` (`id` serial,`name` varchar(50) NOT NULL, PRIMARY KEY (id));

insert into test (`name`) VALUES ('Cheese Bread'),('Lasagna'),('Baguette'),('Pizza'),('Spaguetti')
