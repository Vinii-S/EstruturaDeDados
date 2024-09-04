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
-- Table structure for table `cursodisciplina`
--

DROP TABLE IF EXISTS `cursodisciplina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cursodisciplina` (
  `id_Curso` int(11) NOT NULL,
  `id_Disciplina` int(11) NOT NULL,
  PRIMARY KEY (`id_Curso`,`id_Disciplina`),
  KEY `fk_id_Disciplina_CursoDisciplina` (`id_Disciplina`),
  KEY `idx_cursodisciplina_id` (`id_Curso`,`id_Disciplina`),
  CONSTRAINT `fk_id_Curso_CursoDisciplina` FOREIGN KEY (`id_Curso`) REFERENCES `curso` (`id_Curso`),
  CONSTRAINT `fk_id_Disciplina_CursoDisciplina` FOREIGN KEY (`id_Disciplina`) REFERENCES `disciplina` (`id_Disciplina`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cursodisciplina`
--

LOCK TABLES `cursodisciplina` WRITE;
/*!40000 ALTER TABLE `cursodisciplina` DISABLE KEYS */;
INSERT INTO `cursodisciplina` VALUES (1,1),(3,3),(3,6),(6,2),(6,4),(7,10),(9,8),(10,10),(12,10),(13,9),(15,6),(16,11);
/*!40000 ALTER TABLE `cursodisciplina` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-04  9:53:17
