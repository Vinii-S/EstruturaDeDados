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
-- Table structure for table `endereco`
--

DROP TABLE IF EXISTS `endereco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `endereco` (
  `id_Endereco` int(11) NOT NULL AUTO_INCREMENT,
  `rua_Endereco` varchar(50) NOT NULL,
  `bairro_Endereco` varchar(50) NOT NULL,
  `cidade_Endereco` varchar(50) NOT NULL,
  `estado_Endereco` varchar(50) NOT NULL,
  `numero_Endereco` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_Endereco`),
  KEY `idx_endereco_id` (`id_Endereco`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `endereco`
--

LOCK TABLES `endereco` WRITE;
/*!40000 ALTER TABLE `endereco` DISABLE KEYS */;
INSERT INTO `endereco` VALUES (1,'RUA DA ALEGRIA','CENTRO','SÃO JOSÉ','PERNAMBUCO','15'),(2,'RUA DA LUA','SÃO VICENTE','JUAZEIRO','PERNAMBUCO','11'),(3,'172-5974 Fusce Road','Centro','Canoas','Bahia','38'),(4,'P.O. Box 272, 6588 Ultricies Road','Rodoviario','Abaetetuba','Piauí','4'),(5,'Ap #831-8583 Congue. Avenue','Esquina','Mauá','Pernambuco','20'),(6,'885-2322 Lobortis Av.','Rodoviario','Jaboatão dos Guararapes','Pernambuco','35'),(7,'234-2786 Lectus. Avenue','Jardim Novo','Blumenau','Bahia','38'),(8,'2229 Pharetra Street','Centro','Guarapuava','Bahia','18'),(9,'Ap #828-6694 Ut Rd.','Jardim Feliz','Colombo','Pernambuco','5'),(10,'3594 Fusce Avenue','Esquina','Juazeiro','Alagoas','16'),(11,'P.O. Box 991, 4676 Cras Street','Rodoviario','Montes Claros','Ceará','16'),(12,'626-7063 Fringilla. Road','Rodoviario','Crato','Bahia','13');
/*!40000 ALTER TABLE `endereco` ENABLE KEYS */;
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
