
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
    `category` VARCHAR(45) DEFAULT NULL,
    `contact_name` VARCHAR(45) DEFAULT NULL,
    `preferred_name` VARCHAR(45) DEFAULT NULL,
    `phone` VARCHAR(20) DEFAULT NULL,
    `email` VARCHAR(45) DEFAULT NULL,
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


-- Set up table: market_recurrence_pattern
DROP TABLE IF EXISTS `market_recurrence_pattern`;
CREATE TABLE `market_recurrence_pattern` (
    `id` BIGINT(20) NOT NULL UNIQUE AUTO_INCREMENT,
    `name` VARCHAR(45) DEFAULT NULL,
    `start` DATE DEFAULT NULL,
    `end` DATE DEFAULT NULL,
    `day_of_week` INT DEFAULT NULL,
    `recur_weekday1` TINYINT(1) UNSIGNED DEFAULT 0,
    `recur_weekday2` TINYINT(1) UNSIGNED DEFAULT 0,
    `recur_weekday3` TINYINT(1) UNSIGNED DEFAULT 0,
    `recur_weekday4` TINYINT(1) UNSIGNED DEFAULT 0,
    `recur_weekday5` TINYINT(1) UNSIGNED DEFAULT 0,
    `recur_month1` TINYINT(1) UNSIGNED DEFAULT 1,
    `recur_month2` TINYINT(1) UNSIGNED DEFAULT 1,
    `recur_month3` TINYINT(1) UNSIGNED DEFAULT 1,
    `recur_month4` TINYINT(1) UNSIGNED DEFAULT 1,
    `recur_month5` TINYINT(1) UNSIGNED DEFAULT 1,
    `recur_month6` TINYINT(1) UNSIGNED DEFAULT 1,
    `recur_month7` TINYINT(1) UNSIGNED DEFAULT 1,
    `recur_month8` TINYINT(1) UNSIGNED DEFAULT 1,
    `recur_month9` TINYINT(1) UNSIGNED DEFAULT 1,
    `recur_month10` TINYINT(1) UNSIGNED DEFAULT 1,
    `recur_month11` TINYINT(1) UNSIGNED DEFAULT 1,
    `recur_month12` TINYINT(1) UNSIGNED DEFAULT 1,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

UNLOCK TABLES;
