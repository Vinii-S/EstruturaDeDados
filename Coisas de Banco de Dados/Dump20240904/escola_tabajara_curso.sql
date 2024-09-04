-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: escola_tabajara
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

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
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `id_Curso` int(11) NOT NULL AUTO_INCREMENT,
  `nome_Curso` varchar(50) NOT NULL,
  `descricao_Curso` varchar(50) NOT NULL,
  `tipo_Curso` varchar(50) DEFAULT NULL,
  `id_Campus` int(11) NOT NULL,
  PRIMARY KEY (`id_Curso`),
  KEY `fk_id_Campus_Curso` (`id_Campus`),
  KEY `idx_curso_id` (`id_Curso`),
  CONSTRAINT `fk_id_Campus_Curso` FOREIGN KEY (`id_Campus`) REFERENCES `campus` (`id_Campus`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
INSERT INTO `curso` VALUES (1,'Informática','Curso Técnico de Informática','Integrado',1),(2,'Engenharia Elétrica','neque vitae','Subsequente',1),(3,'Engenharia Elétrica','urna. Ut tincidunt vehicula risus.','Superior',1),(4,'Ciência da Computação','Pellentesque habitant morbi','Integrado',1),(5,'Biocombustíveis','mus. Aenean eget','Integrado',1),(6,'Biocombustíveis','mollis dui, in','Superior',1),(7,'Eletromecânica','justo. Proin','Superior',1),(9,'Ciência da Computação','sit amet, risus.','Integrado',1),(10,'Biocombustíveis','arcu. Vestibulum','Subsequente',1),(11,'Ciência da Computação','Proin vel nisl. Quisque fringilla','Superior',1),(12,'Engenhaia de Pesca','dsadmsadna','Superior',2),(13,'Economia','sdffefefe','Integrado',2),(14,'Engenhaia de Software','horghrogh','Subsequente',2),(15,'Engenhaia de Produção','prrorprpeorpe','Superior',2),(16,'Engenhaia Elétrica','eleleleeeee','Superior',2),(17,'Agronomia','dsagrgorogr','Integrado',2);
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-04  9:53:18
