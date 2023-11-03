
-- Market Manager
-- (C) Brackenbit 2023
--
-- Database setup script
-- 1 - Create database and tables

-- WARNING! This will destroy any existing data.

-- DATABASE CREATION
CREATE DATABASE IF NOT EXISTS `marketmanagerdatabase`;
USE `marketmanagerdatabase`;

-- Set up table: stallholder
DROP TABLE IF EXISTS `stallholder`;
CREATE TABLE `stallholder` (
    `id` BIGINT(20) NOT NULL UNIQUE AUTO_INCREMENT,
    `name` VARCHAR(45) DEFAULT NULL,
    `contact_name` VARCHAR(45) DEFAULT NULL,
    `contact_phone` VARCHAR(20) DEFAULT NULL,
    `email` VARCHAR(45) DEFAULT NULL,
    `category` VARCHAR(45) DEFAULT NULL,
    `regular` TINYINT(1) UNSIGNED DEFAULT 0,
    `stall_size` TINYINT(1) UNSIGNED DEFAULT 1,
    `characteristics` TEXT DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- Set up table: stallholder_category
DROP TABLE IF EXISTS `stallholder_category`;
CREATE TABLE `stallholder_category` (
    `id` BIGINT(20) NOT NULL UNIQUE AUTO_INCREMENT,
    `name` VARCHAR(45) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- Set up table: market_event
DROP TABLE IF EXISTS `market_event`;
CREATE TABLE `market_event` (
    `id` BIGINT(20) NOT NULL UNIQUE AUTO_INCREMENT,
    `title` VARCHAR(45) DEFAULT NULL,
    `start` DATE DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

UNLOCK TABLES;
