/*
SQLyog Ultimate v8.6 Beta2
MySQL - 5.5.5-10.1.9-MariaDB : Database - delcafe
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`delcafe` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `delcafe`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id_account` int(64) NOT NULL,
  `Nama` varchar(64) NOT NULL,
  `Username` varchar(64) NOT NULL,
  `Password` varchar(64) NOT NULL,
  `saldo` varchar(64) NOT NULL,
  `role` int(64) NOT NULL,
  `email` varchar(64) NOT NULL,
  PRIMARY KEY (`id_account`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `account` */

insert  into `account`(`id_account`,`Nama`,`Username`,`Password`,`saldo`,`role`,`email`) values (1,'okta','if314025','N4!n990l4n','1000101',1,'if314025@students.del.ac.id'),(2,'dola','if314013','dola','2003000',2,'if314013@students.del.ac.id'),(3,'benny','if314012','benny','3000331',2,'if314012@students.del.ac.id');

/*Table structure for table `menu` */

DROP TABLE IF EXISTS `menu`;

CREATE TABLE `menu` (
  `id_menu` int(120) NOT NULL AUTO_INCREMENT,
  `nama_menu` varchar(120) NOT NULL,
  `ket_menu` varchar(360) NOT NULL,
  `harga_menu` int(120) NOT NULL,
  `kategori_menu` varchar(260) NOT NULL,
  PRIMARY KEY (`id_menu`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `menu` */

insert  into `menu`(`id_menu`,`nama_menu`,`ket_menu`,`harga_menu`,`kategori_menu`) values (1,'nasi gorengg','nasi di goreng dengan tambahan lauk dan pauk yang enak',12000,'makanan'),(2,'teh manis dinginn','teh manis di hidangkan dengan dingin',5000,'minuman'),(4,'Jus Alpukat','Jus dari sari Alpukat ,disajikan dingin',7000,'minuman');

/*Table structure for table `pemesanan` */

DROP TABLE IF EXISTS `pemesanan`;

CREATE TABLE `pemesanan` (
  `no_pesanan` int(120) NOT NULL AUTO_INCREMENT,
  `nama_pesanan` varchar(260) NOT NULL,
  `tgl_wkt_pemesanan` varchar(260) NOT NULL,
  `status` varchar(260) NOT NULL,
  `pemesan` varchar(260) NOT NULL,
  PRIMARY KEY (`no_pesanan`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `pemesanan` */

insert  into `pemesanan`(`no_pesanan`,`nama_pesanan`,`tgl_wkt_pemesanan`,`status`,`pemesan`) values (1,'nasi goreng','0000-00-00 00:00:00','ondeliver','if314025'),(2,'nasi gorengg','17-01-09 08:11:30','dibatalkan','if314013'),(3,'teh manis dinginn','17-01-09 08:12:06','order','if314013'),(4,'nasi gorengg','2017-01-09 09:54:08','order','if314013');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id_role` int(64) NOT NULL,
  `deskripsi` varchar(64) NOT NULL,
  PRIMARY KEY (`id_role`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `role` */

insert  into `role`(`id_role`,`deskripsi`) values (1,'pegawai'),(2,'pembeli');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
