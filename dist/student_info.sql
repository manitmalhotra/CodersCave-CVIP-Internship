CREATE DATABASE  IF NOT EXISTS `student_info` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `student_info`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: student_info
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accountancy_class12`
--

DROP TABLE IF EXISTS `accountancy_class12`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accountancy_class12` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accountancy_class12`
--

LOCK TABLES `accountancy_class12` WRITE;
/*!40000 ALTER TABLE `accountancy_class12` DISABLE KEYS */;
INSERT INTO `accountancy_class12` VALUES ('u');
/*!40000 ALTER TABLE `accountancy_class12` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `contact` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('manit','manit','212');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `biology_class12`
--

DROP TABLE IF EXISTS `biology_class12`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `biology_class12` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `biology_class12`
--

LOCK TABLES `biology_class12` WRITE;
/*!40000 ALTER TABLE `biology_class12` DISABLE KEYS */;
INSERT INTO `biology_class12` VALUES ('S001'),('u');
/*!40000 ALTER TABLE `biology_class12` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `businessstudies_class12`
--

DROP TABLE IF EXISTS `businessstudies_class12`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `businessstudies_class12` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `businessstudies_class12`
--

LOCK TABLES `businessstudies_class12` WRITE;
/*!40000 ALTER TABLE `businessstudies_class12` DISABLE KEYS */;
INSERT INTO `businessstudies_class12` VALUES ('u');
/*!40000 ALTER TABLE `businessstudies_class12` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chemistry_class12`
--

DROP TABLE IF EXISTS `chemistry_class12`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chemistry_class12` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chemistry_class12`
--

LOCK TABLES `chemistry_class12` WRITE;
/*!40000 ALTER TABLE `chemistry_class12` DISABLE KEYS */;
INSERT INTO `chemistry_class12` VALUES ('S001'),('u');
/*!40000 ALTER TABLE `chemistry_class12` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classes`
--

DROP TABLE IF EXISTS `classes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classes` (
  `name` varchar(10) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classes`
--

LOCK TABLES `classes` WRITE;
/*!40000 ALTER TABLE `classes` DISABLE KEYS */;
INSERT INTO `classes` VALUES ('Class 12');
/*!40000 ALTER TABLE `classes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `economics_class12`
--

DROP TABLE IF EXISTS `economics_class12`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `economics_class12` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `economics_class12`
--

LOCK TABLES `economics_class12` WRITE;
/*!40000 ALTER TABLE `economics_class12` DISABLE KEYS */;
INSERT INTO `economics_class12` VALUES ('S001');
/*!40000 ALTER TABLE `economics_class12` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `english_class10`
--

DROP TABLE IF EXISTS `english_class10`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `english_class10` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `english_class10`
--

LOCK TABLES `english_class10` WRITE;
/*!40000 ALTER TABLE `english_class10` DISABLE KEYS */;
/*!40000 ALTER TABLE `english_class10` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `english_class12`
--

DROP TABLE IF EXISTS `english_class12`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `english_class12` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `english_class12`
--

LOCK TABLES `english_class12` WRITE;
/*!40000 ALTER TABLE `english_class12` DISABLE KEYS */;
INSERT INTO `english_class12` VALUES ('S001'),('u');
/*!40000 ALTER TABLE `english_class12` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hindi_class10`
--

DROP TABLE IF EXISTS `hindi_class10`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hindi_class10` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hindi_class10`
--

LOCK TABLES `hindi_class10` WRITE;
/*!40000 ALTER TABLE `hindi_class10` DISABLE KEYS */;
/*!40000 ALTER TABLE `hindi_class10` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maths_class10`
--

DROP TABLE IF EXISTS `maths_class10`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `maths_class10` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maths_class10`
--

LOCK TABLES `maths_class10` WRITE;
/*!40000 ALTER TABLE `maths_class10` DISABLE KEYS */;
/*!40000 ALTER TABLE `maths_class10` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `physics_class12`
--

DROP TABLE IF EXISTS `physics_class12`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `physics_class12` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `physics_class12`
--

LOCK TABLES `physics_class12` WRITE;
/*!40000 ALTER TABLE `physics_class12` DISABLE KEYS */;
INSERT INTO `physics_class12` VALUES ('S001');
/*!40000 ALTER TABLE `physics_class12` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `psychology_class12`
--

DROP TABLE IF EXISTS `psychology_class12`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `psychology_class12` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `psychology_class12`
--

LOCK TABLES `psychology_class12` WRITE;
/*!40000 ALTER TABLE `psychology_class12` DISABLE KEYS */;
/*!40000 ALTER TABLE `psychology_class12` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `s001`
--

DROP TABLE IF EXISTS `s001`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `s001` (
  `subject_name` varchar(50) DEFAULT NULL,
  `class` varchar(45) DEFAULT NULL,
  `lectureattended` varchar(10) DEFAULT NULL,
  `totallecture` varchar(10) DEFAULT NULL,
  `attendance` varchar(10) DEFAULT NULL,
  `marksObtained` varchar(45) DEFAULT NULL,
  `totalMarks` varchar(45) DEFAULT NULL,
  `marks` varchar(45) DEFAULT NULL,
  UNIQUE KEY `subject_name` (`subject_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `s001`
--

LOCK TABLES `s001` WRITE;
/*!40000 ALTER TABLE `s001` DISABLE KEYS */;
INSERT INTO `s001` VALUES ('English','Class 12',NULL,NULL,NULL,NULL,NULL,NULL),('Physics','Class 12',NULL,NULL,NULL,NULL,NULL,NULL),('Chemistry','Class 12',NULL,NULL,NULL,NULL,NULL,NULL),('Biology','Class 12',NULL,NULL,NULL,NULL,NULL,NULL),('Economics','Class 12',NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `s001` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `science_class10`
--

DROP TABLE IF EXISTS `science_class10`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `science_class10` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `science_class10`
--

LOCK TABLES `science_class10` WRITE;
/*!40000 ALTER TABLE `science_class10` DISABLE KEYS */;
/*!40000 ALTER TABLE `science_class10` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `socialscience_class10`
--

DROP TABLE IF EXISTS `socialscience_class10`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `socialscience_class10` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `socialscience_class10`
--

LOCK TABLES `socialscience_class10` WRITE;
/*!40000 ALTER TABLE `socialscience_class10` DISABLE KEYS */;
/*!40000 ALTER TABLE `socialscience_class10` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sociology_class12`
--

DROP TABLE IF EXISTS `sociology_class12`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sociology_class12` (
  `Student_Id` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sociology_class12`
--

LOCK TABLES `sociology_class12` WRITE;
/*!40000 ALTER TABLE `sociology_class12` DISABLE KEYS */;
/*!40000 ALTER TABLE `sociology_class12` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `id` varchar(10) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `rollno` varchar(10) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `blood_group` varchar(5) DEFAULT NULL,
  `aadhar_no` varchar(12) DEFAULT NULL,
  `class` varchar(10) DEFAULT NULL,
  `father_name` varchar(45) DEFAULT NULL,
  `mother_name` varchar(45) DEFAULT NULL,
  `mobile_no` varchar(10) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('S001','Manit Malhotra','10','2001-01-09','O+','789456123654','Class 12','Gurjiv Kumar','Kiran Bala','9915206890','456','manit'),('u','u','uu','2001-01-09','u','u','Class 12','u','u','u','u','u');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `subject_name` varchar(40) NOT NULL,
  `class` varchar(45) NOT NULL,
  PRIMARY KEY (`subject_name`,`class`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES ('Accountancy','Class 12'),('Biology','Class 12'),('Business Studies','Class 12'),('BusinessStudies','Class 12'),('Chemistry','Class 12'),('Economics','Class 12'),('English','Class 12'),('Physics','Class 12'),('Psychology','Class 12'),('Sociology','Class 12');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `id` varchar(10) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `bloodgroup` varchar(5) DEFAULT NULL,
  `aadharno` varchar(12) DEFAULT NULL,
  `subject` varchar(40) DEFAULT NULL,
  `mobile_no` varchar(10) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `class` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('T001','XYZ','2001-01-09','B+','3153','Accountancy','78','7586','xyz','Class 12');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `u`
--

DROP TABLE IF EXISTS `u`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `u` (
  `subject_name` varchar(50) DEFAULT NULL,
  `class` varchar(45) DEFAULT NULL,
  `lectureattended` varchar(10) DEFAULT NULL,
  `totallecture` varchar(10) DEFAULT NULL,
  `attendance` varchar(10) DEFAULT NULL,
  `marksobtained` varchar(10) DEFAULT NULL,
  `totalMarks` varchar(10) DEFAULT NULL,
  `marks` varchar(10) DEFAULT NULL,
  UNIQUE KEY `subject_name` (`subject_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `u`
--

LOCK TABLES `u` WRITE;
/*!40000 ALTER TABLE `u` DISABLE KEYS */;
INSERT INTO `u` VALUES ('Accountancy','Class 12','778.0','787.0','98.85642','78.0','80.0','97.5'),('Biology','Class 12',NULL,NULL,NULL,NULL,NULL,NULL),('BusinessStudies','Class 12',NULL,NULL,NULL,NULL,NULL,NULL),('Chemistry','Class 12',NULL,NULL,NULL,NULL,NULL,NULL),('English','Class 12',NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `u` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-13 23:54:05
