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
-- Table structure for table `swch_servicios`
--

DROP TABLE IF EXISTS `swch_servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `swch_servicios` (
  `id` int(11) NOT NULL,
  `uri` varchar(45) NOT NULL,
  `descripcion` varchar(45) NOT NULL,
  `componente_id` int(11) NOT NULL,
  `comp_config_uri_def` varchar(40) DEFAULT NULL,
  `hora_inicio_acceso` int(11) DEFAULT '-1' COMMENT '0-24',
  `hora_fin_acceso` int(11) DEFAULT '-1' COMMENT '0-24',
  `limite_consultas_dia` int(11) DEFAULT '0',
  `ip_dominio_permitido` varchar(50) DEFAULT NULL,
  `sin_cache` int(11) DEFAULT '1',
  `sin_parametros` int(11) DEFAULT '0',
  `sin_restriccion_comp_config` int(11) DEFAULT '0',
  `estado` int(11) NOT NULL DEFAULT '1',
  `creado` datetime NOT NULL,
  `modificado` datetime DEFAULT NULL,
  `tarificacion_auto` int(11) DEFAULT NULL,
  `sin_pago_automatico` int(11) DEFAULT '1',
  PRIMARY KEY (`id`),
  KEY `fk_swch_servicios_swch_componentes1_idx` (`componente_id`),
  CONSTRAINT `fk_swch_servicios_swch_componentes1` FOREIGN KEY (`componente_id`) REFERENCES `swch_componentes` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `swch_servicios`
--

LOCK TABLES `swch_servicios` WRITE;
/*!40000 ALTER TABLE `swch_servicios` DISABLE KEYS */;
/*!40000 ALTER TABLE `swch_servicios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-09-15 23:25:56
