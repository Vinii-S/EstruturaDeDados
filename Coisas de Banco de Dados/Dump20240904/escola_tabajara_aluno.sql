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
-- Table structure for table `aluno`
--

DROP TABLE IF EXISTS `aluno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `aluno` (
  `id_Aluno` int(11) NOT NULL AUTO_INCREMENT,
  `nome_Aluno` varchar(50) NOT NULL,
  `rg_Aluno` varchar(11) NOT NULL,
  `cpf_Aluno` varchar(15) NOT NULL,
  `matricula_Aluno` varchar(50) NOT NULL,
  `id_Endereco` int(11) NOT NULL,
  PRIMARY KEY (`id_Aluno`),
  KEY `fk_id_Endereco_Aluno` (`id_Endereco`),
  KEY `idx_aluno_id` (`id_Aluno`),
  CONSTRAINT `fk_id_Endereco_Aluno` FOREIGN KEY (`id_Endereco`) REFERENCES `endereco` (`id_Endereco`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aluno`
--

LOCK TABLES `aluno` WRITE;
/*!40000 ALTER TABLE `aluno` DISABLE KEYS */;
INSERT INTO `aluno` VALUES (1,'Jefferson Siqueira','123123-09','112.443.335','2020112232',1),(2,'Nash Diniz','47636-25','187.322.413-82','5058235186',10),(3,'Martha Barreto','24548-93','184.528.572-24','1796564293',5),(4,'Dalton Cavalcante','52133-65','485.242.838-58','1316364436',5),(5,'Carlos Fernandes','85559-59','442.943.645-28','3412568818',12),(6,'Sasha Vieira','55401-12','218.513.265-24','6188116558',9),(7,'Hope Paulino','93154-85','648.152.354-48','4317371355',3),(8,'Fiona Andrade','15491-13','355.642.692-64','4760618440',9),(9,'Rylee Carvalho','38840-78','674.864.729-91','5398149522',12),(10,'Stella Guedes','27508-47','868.746.768-36','3674385843',6),(11,'Sara Mota','28610-19','847.151.139-61','3247787835',1);
/*!40000 ALTER TABLE `aluno` ENABLE KEYS */;
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
