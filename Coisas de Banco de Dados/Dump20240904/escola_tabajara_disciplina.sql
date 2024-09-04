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
-- Table structure for table `disciplina`
--

DROP TABLE IF EXISTS `disciplina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `disciplina` (
  `id_Disciplina` int(11) NOT NULL AUTO_INCREMENT,
  `nome_Disciplina` varchar(50) NOT NULL,
  `descricao_Disciplina` varchar(50) NOT NULL,
  `id_Professor` int(11) NOT NULL,
  PRIMARY KEY (`id_Disciplina`),
  KEY `fk_id_Professor_Disciplina` (`id_Professor`),
  KEY `idx_disciplina_id` (`id_Disciplina`),
  CONSTRAINT `fk_id_Professor_Disciplina` FOREIGN KEY (`id_Professor`) REFERENCES `professor` (`id_Professor`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `disciplina`
--

LOCK TABLES `disciplina` WRITE;
/*!40000 ALTER TABLE `disciplina` DISABLE KEYS */;
INSERT INTO `disciplina` VALUES (1,'MATEMATICA','DISCIPLINA DO 1 ANO INTEGRADO',1),(2,'Cálculo 2','enim commodo hendrerit. Donec porttitor tellus non',1),(3,'Cálculo 2','Integer tincidunt aliquam arcu. Aliquam ultrices i',12),(4,'Programação','sapien, gravida non, sollicitudin a, malesuada id,',11),(5,'Programação','dolor, tempus',12),(6,'Cálculo 2','elit sed',13),(7,'Física 1','iaculis aliquet diam. Sed diam lorem, auctor',13),(8,'Cálculo 2','orci tincidunt',1),(9,'Física 2','dis parturient montes, nascetur ridiculus mus. Don',11),(10,'Cálculo 1','ac turpis egestas. Aliquam fringilla cursus purus.',12),(11,'Física 3','dui.',1);
/*!40000 ALTER TABLE `disciplina` ENABLE KEYS */;
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
