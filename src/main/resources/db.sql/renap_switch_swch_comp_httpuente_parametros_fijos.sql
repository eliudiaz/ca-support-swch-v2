-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: renap_switch
-- ------------------------------------------------------
-- Server version	5.1.73-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `swch_comp_httpuente_parametros_fijos`
--

DROP TABLE IF EXISTS `swch_comp_httpuente_parametros_fijos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `swch_comp_httpuente_parametros_fijos` (
  `nombre` varchar(45) NOT NULL,
  `valor` varchar(200) NOT NULL,
  `tipo` int(11) NOT NULL DEFAULT '1' COMMENT '1/query|input param, 2/path param, 3/form param,4/cabecera',
  `httpuente_config_uri` varchar(40) NOT NULL,
  PRIMARY KEY (`nombre`),
  KEY `fk_swch_comp_httpuente_parametros_fijos_swch_comp_httpuente_idx` (`httpuente_config_uri`),
  CONSTRAINT `fk_swch_comp_httpuente_parametros_fijos_swch_comp_httpuente_c1` FOREIGN KEY (`httpuente_config_uri`) REFERENCES `swch_comp_httpuente_configs` (`uri`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swch_comp_httpuente_parametros_fijos`
--

LOCK TABLES `swch_comp_httpuente_parametros_fijos` WRITE;
/*!40000 ALTER TABLE `swch_comp_httpuente_parametros_fijos` DISABLE KEYS */;
/*!40000 ALTER TABLE `swch_comp_httpuente_parametros_fijos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-09-15 23:25:47
