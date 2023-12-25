-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 25, 2023 at 04:31 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quan_ly_khu_dan_cu`
--

-- --------------------------------------------------------

--
-- Table structure for table `ngan_quy_tang_thuong`
--

CREATE TABLE `ngan_quy_tang_thuong` (
  `id_ngan_quy_tang_thuong` int(11) NOT NULL,
  `so_tien_thay_doi` int(11) NOT NULL DEFAULT 0,
  `ngay_thay_doi` date NOT NULL,
  `tong_so_tien` int(11) NOT NULL DEFAULT 0,
  `chi_tiet` varchar(1024) NOT NULL,
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ngan_quy_tang_thuong`
--

INSERT INTO `ngan_quy_tang_thuong` (`id_ngan_quy_tang_thuong`, `so_tien_thay_doi`, `ngay_thay_doi`, `tong_so_tien`, `chi_tiet`, `isDeleted`) VALUES
(17, 0, '2023-12-25', 0, 'Thuong hoc sinh Gioi hoc ky 20102', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ngan_quy_tang_thuong`
--
ALTER TABLE `ngan_quy_tang_thuong`
  ADD PRIMARY KEY (`id_ngan_quy_tang_thuong`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
