-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: ppi
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `edit` varchar(255) NOT NULL,
  `lang` varchar(255) NOT NULL,
  `pages` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `ejemplares` varchar(255) NOT NULL,
  `stock` int NOT NULL,
  `available` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (2,'Don Quijote de la Mancha','1605-01-16','Miguel de Cervantes','Novela','Planeta','Español','1088','Las aventuras del caballero Don Quijote y su fiel escudero Sancho Panza, en un viaje de locura y reflexión.','150',76,75),(3,'1984','1949-06-08','George Orwell','Distopía','Secker & Warburg','Inglés','328','Una obra maestra que presenta una sociedad totalitaria donde el gobierno lo controla todo.','120',60,60),(4,'Matar a un ruiseñor','1960-07-11','Harper Lee','Ficción','J.B. Lippincott & Co.','Inglés','281','Una novela que aborda temas de racismo y justicia en el sur de Estados Unidos durante la Gran Depresión.','80',40,40),(5,'Orgullo y prejuicio','1813-01-28','Jane Austen','Romántica','T. Egerton','Inglés','432','La historia de Elizabeth Bennet y su relación con el orgulloso Mr. Darcy en la sociedad inglesa del siglo XIX.','150',85,84),(6,'Cumbres Borrascosas','1847-12-01','Emily Brontë','Ficción','Thomas Cautley Newby','Inglés','416','Un cuento oscuro de amor, venganza y sufrimiento en las desoladas tierras de Yorkshire.','100',60,60),(7,'El Gran Gatsby','1925-04-10','F. Scott Fitzgerald','Ficción','Charles Scribner\'s Sons','Inglés','180','Una crítica al sueño americano y las ilusiones de la vida en la década de 1920.','110',55,55),(8,'La Odisea','800 A.C.','Homero','Épico','Varios','Griego','560','El largo viaje de Odiseo mientras intenta regresar a su hogar tras la Guerra de Troya.','70',30,30),(9,'La sombra del viento','2001-11-17','Carlos Ruiz Zafón','Misterio','Planeta','Español','496','Un joven descubre un libro en un cementerio de libros olvidados, lo que lo lleva a una serie de oscuros secretos.','130',65,65),(10,'Los Miserables','1862-04-03','Victor Hugo','Ficción histórica','A. Lacroix, Verboeckhoven & Cie','Francés','1232','La lucha por la redención en la Francia post-revolucionaria a través de los ojos de varios personajes complejos.','60',30,29),(11,'El Hobbit','1937-09-21','J.R.R. Tolkien','Fantasía','George Allen & Unwin','Inglés','310','La aventura de Bilbo Bolsón mientras se embarca en una misión para recuperar un tesoro robado por un dragón.','200',100,100),(12,'Fahrenheit 451','1953-10-19','Ray Bradbury','Ciencia ficción','Ballantine Books','Inglés','158','Una sociedad donde los libros están prohibidos y los bomberos queman todo lo que encuentren relacionado con ellos.','90',45,45),(13,'El código Da Vinci','2003-03-18','Dan Brown','Thriller','Doubleday','Inglés','689','Un thriller histórico en el que un profesor de simbología desentraña secretos de la historia de la humanidad.','180',90,90),(14,'Harry Potter y la piedra filosofal','1997-06-26','J.K. Rowling','Fantasía','Bloomsbury','Inglés','223','Un joven huérfano descubre que es un mago y asiste a la escuela Hogwarts para aprender magia.','200',100,100),(15,'El principito','1943-04-06','Antoine de Saint-Exupéry','Fábula','Reynal & Hitchcock','Francés','96','La historia de un pequeño príncipe que viaja por el universo, reflexionando sobre la vida, la amistad y la naturaleza humana.','160',80,80),(16,'La casa de los espíritus','1982-11-01','Isabel Allende','Realismo mágico','Sudamericana','Español','500','Una saga familiar que abarca varias generaciones, explorando temas como el amor, el poder y la lucha social.','120',60,60),(17,'El alquimista','1988-05-01','Paulo Coelho','Ficción','Rocco','Portugués','208','La historia de un joven pastor que sigue su sueño de encontrar un tesoro, aprendiendo valiosas lecciones de vida en el camino.','190',95,95),(18,'Crónica de una muerte anunciada','1981-01-01','Gabriel García Márquez','Ficción','Editorial Oveja Negra','Español','120','La historia de un asesinato que se sabe que va a ocurrir, pero nadie hace nada para evitarlo.','110',55,55),(19,'Los detectives salvajes','1998-10-01','Roberto Bolaño','Novela','Anagrama','Español','592','Una novela que explora el mundo de los poetas y la búsqueda de un grupo literario por encontrar a una autora desaparecida.','80',40,40),(20,'El túnel','1948-03-23','Ernesto Sabato','Psicológica','Editorial Sur','Español','190','Un hombre obsesionado con una mujer, cuya locura lo lleva a cometer un crimen, es la trama central de esta novela psicológica.','150',76,76);
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lendings`
--

DROP TABLE IF EXISTS `lendings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lendings` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL,
  `book_id` int NOT NULL,
  `date_out` varchar(255) NOT NULL,
  `date_return` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lendings`
--

LOCK TABLES `lendings` WRITE;
/*!40000 ALTER TABLE `lendings` DISABLE KEYS */;
INSERT INTO `lendings` VALUES (3,1,11,'19-05-2025','19-05-2025'),(4,1,8,'19-05-2025','19-05-2025');
/*!40000 ALTER TABLE `lendings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `last_name_p` varchar(30) NOT NULL,
  `last_name_m` varchar(30) NOT NULL,
  `domicilio` varchar(250) DEFAULT NULL,
  `tel` varchar(25) DEFAULT NULL,
  `sanctions` int DEFAULT '0',
  `sanc_money` int NOT NULL DEFAULT '0',
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Rawad Yecith','Muñoz','Romero','Manzana 5 lote 51','3212739222',0,0,'mrawadyecid@gmail.com'),(5,'Jero','Muñoz','Romero','Manzana f5','31232132313',0,0,'mrawad@gmail.com'),(6,'Juan','Pérez','Gómez','Calle Primavera 123','5551234567',0,0,'juan.perez@email.com'),(7,'María','García','López','Avenida Libertad 456','5552345678',0,0,'maria.garcia@email.com'),(8,'Carlos','Martínez','Rodríguez','Boulevard Juárez 789','5553456789',0,0,'carlos.martinez@email.com'),(9,'Ana','Hernández','Sánchez','Calle Roble 321','5554567890',0,0,'ana.hernandez@email.com'),(10,'Luis','Díaz','Fernández','Avenida Central 654','5555678901',0,0,'luis.diaz@email.com'),(11,'Laura','Moreno','Jiménez','Calle Pino 987','5556789012',0,0,'laura.moreno@email.com'),(12,'Pedro','Álvarez','Torres','Boulevard Reforma 135','5557890123',0,0,'pedro.alvarez@email.com'),(13,'Sofía','Romero','Navarro','Avenida Universidad 246','5558901234',0,0,'sofia.romero@email.com'),(14,'Jorge','Ruiz','Domínguez','Calle Encino 357','5559012345',0,0,'jorge.ruiz@email.com'),(15,'Elena','Serrano','Ramírez','Boulevard Constitución 468','5550123456',0,0,'elena.serrano@email.com'),(16,'Miguel','Molina','Gil','Avenida Independencia 579','5551234509',0,0,'miguel.molina@email.com'),(17,'Isabel','Ortega','Rubio','Calle Cedro 680','5552345601',0,0,'isabel.ortega@email.com'),(18,'Fernando','Delgado','Medina','Boulevard Revolución 791','5553456702',0,0,'fernando.delgado@email.com'),(19,'Carmen','Castro','Vega','Avenida Paz 802','5554567803',0,0,'carmen.castro@email.com'),(20,'Ricardo','Santos','Márquez','Calle Nogal 913','5555678904',0,0,'ricardo.santos@email.com'),(21,'Patricia','Vargas','Iglesias','Boulevard Hidalgo 124','5556789015',0,0,'patricia.vargas@email.com'),(22,'Roberto','Cortés','Peña','Avenida Democracia 235','5557890126',0,0,'roberto.cortes@email.com'),(23,'Adriana','Lorenzo','Cabrera','Calle Fresno 346','5558901237',0,0,'adriana.lorenzo@email.com'),(24,'Francisco','Sáez','León','Boulevard República 457','5559012348',0,0,'francisco.saez@email.com'),(25,'Lucía','Ibarra','Reyes','Avenida Justicia 568','5550123459',0,0,'lucia.ibarra@email.com');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'ppi'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-05-19 10:32:28
