-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 22, 2023 at 04:01 AM
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
-- Database: `demographic`
--

-- --------------------------------------------------------

--
-- Table structure for table `dip_tang_thuong`
--

CREATE TABLE `dip_tang_thuong` (
  `id_dip_tang_thuong` varchar(5) NOT NULL,
  `ten_dip` varchar(1024) NOT NULL,
  `tuoi_toi_thieu` int(11) NOT NULL DEFAULT 0,
  `tuoi_toi_da` int(11) NOT NULL DEFAULT 18,
  `ngay_tang_thuong` date NOT NULL,
  `tong_so_tien` int(11) NOT NULL DEFAULT 0,
  `chi_tiet_phan_qua` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL CHECK (json_valid(`chi_tiet_phan_qua`)),
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ho_khau`
--

CREATE TABLE `ho_khau` (
  `so_ho_khau` varchar(20) NOT NULL,
  `khu_vuc` varchar(50) DEFAULT NULL,
  `dia_chi` varchar(255) DEFAULT NULL,
  `ngay_lap` date DEFAULT NULL,
  `id_chu_ho` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ho_khau`
--

INSERT INTO `ho_khau` (`so_ho_khau`, `khu_vuc`, `dia_chi`, `ngay_lap`, `id_chu_ho`) VALUES
('HK001', 'Quan 1', '123 A Street', '2023-01-01', '111111111'),
('HK002', 'Quan 2', '456 B Street', '2023-02-01', '222222222'),
('HK003', 'Quan 3', '789 C Street', '2023-03-01', '333333333'),
('HK004', 'Quan 4', '101 D Street', '2023-04-01', '444444444');

-- --------------------------------------------------------

--
-- Table structure for table `khai_tu`
--

CREATE TABLE `khai_tu` (
  `so_giay_khai_tu` varchar(20) NOT NULL,
  `so_CMND` varchar(20) NOT NULL,
  `thoi_gian` date DEFAULT NULL,
  `li_do` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ngan_quy_tang_thuong`
--

CREATE TABLE `ngan_quy_tang_thuong` (
  `id_ngan_quy_tang_thuong` varchar(5) NOT NULL,
  `so_tien_thay_doi` int(11) NOT NULL DEFAULT 0,
  `ngay_thay_doi` date NOT NULL,
  `tong_so_tien` int(11) NOT NULL DEFAULT 0,
  `chi_tiet` varchar(1024) NOT NULL,
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `nhan_khau`
--

CREATE TABLE `nhan_khau` (
  `so_CMND` varchar(20) NOT NULL,
  `ho_ten` varchar(100) NOT NULL,
  `biet_danh` varchar(50) DEFAULT NULL,
  `gioi_tinh` varchar(10) DEFAULT NULL,
  `ngay_sinh` date DEFAULT NULL,
  `thuong_tru` varchar(255) DEFAULT NULL,
  `ton_giao` varchar(50) DEFAULT NULL,
  `so_ho_khau` varchar(20) DEFAULT NULL,
  `la_chu_ho` varchar(10) DEFAULT NULL,
  `qua_doi` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `nhan_khau`
--

INSERT INTO `nhan_khau` (`so_CMND`, `ho_ten`, `biet_danh`, `gioi_tinh`, `ngay_sinh`, `thuong_tru`, `ton_giao`, `so_ho_khau`, `la_chu_ho`, `qua_doi`) VALUES
('101010101', 'Nguyen Thi N', 'N', 'Nu', '1997-07-07', '456 B Street', 'Phat giao', 'HK002', 'No', 'No'),
('111111111', 'Nguyen Van A', 'A', 'Nam', '1990-01-01', '123 A Street', 'Khong', 'HK001', 'Yes', 'No'),
('111111119', 'Nguyen Van K', 'AK', 'Nam', '1990-01-04', '222 A Street', 'Khong', 'HK001', 'No', 'No'),
('121212121', 'Le Van O', 'O', 'Nam', '2002-12-12', '789 C Street', 'Cao Dai', 'HK003', 'No', 'No'),
('141414141', 'Pham Thi P', 'P', 'Nu', '1988-08-08', '101 D Street', 'Cong giao', 'HK004', 'No', 'No'),
('161616161', 'Nguyen Van Q', 'Q', 'Nam', '1993-04-04', '123 A Street', 'Khong', 'HK001', 'No', 'No'),
('181818181', 'Tran Thi R', 'R', 'Nu', '1998-09-09', '456 B Street', 'Phat giao', 'HK002', 'No', 'No'),
('202020202', 'Le Van S', 'S', 'Nam', '2003-05-05', '789 C Street', 'Cao Dai', 'HK003', 'No', 'No'),
('222222222', 'Tran Thi B', 'B', 'Nu', '1995-05-15', '456 B Street', 'Phat giao', 'HK002', 'No', 'No'),
('222222229', 'Nguyen Van Q', 'Q', 'Nam', '1993-04-04', '101 D Street', 'Cong giao', 'HK004', 'No', 'No'),
('333333333', 'Le Van C', 'C', 'Nam', '2000-09-30', '789 C Street', 'Cao Dai', 'HK003', 'Yes', 'No'),
('444444444', 'Pham Thi D', 'D', 'Nu', '1980-03-20', '101 D Street', 'Cong giao', 'HK004', 'Yes', 'No'),
('555555555', 'Nguyen Van X', 'X', 'Nam', '1991-02-02', '123 A Street', 'Khong', 'HK001', 'No', 'No'),
('666666666', 'Tran Thi Y', 'Y', 'Nu', '1996-06-16', '456 B Street', 'Phat giao', 'HK002', 'Yes', 'No'),
('777777777', 'Le Van Z', 'Z', 'Nam', '2001-10-31', '789 C Street', 'Cao Dai', 'HK003', 'No', 'Yes'),
('888888888', 'Pham Thi W', 'W', 'Nu', '1985-04-15', '101 D Street', 'Cong giao', 'HK004', 'No', 'No'),
('999999999', 'Tran Van M', 'M', 'Nam', '1992-03-03', '123 A Street', 'Khong', 'HK001', 'No', 'No');

-- --------------------------------------------------------

--
-- Table structure for table `tam_tru`
--

CREATE TABLE `tam_tru` (
  `so_giay_tam_tru` varchar(20) NOT NULL,
  `so_CMND` varchar(20) DEFAULT NULL,
  `thoi_gian` date DEFAULT NULL,
  `li_do` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tam_tru`
--

INSERT INTO `tam_tru` (`so_giay_tam_tru`, `so_CMND`, `thoi_gian`, `li_do`) VALUES
('TT001', '111111119', '2023-11-11', 'Trọ mới thuê');

-- --------------------------------------------------------

--
-- Table structure for table `tam_vang`
--

CREATE TABLE `tam_vang` (
  `so_CMND` varchar(20) DEFAULT NULL,
  `so_giay_tam_vang` varchar(20) NOT NULL,
  `tu_ngay` date DEFAULT NULL,
  `den_ngay` date DEFAULT NULL,
  `noi_tam_tru` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tam_vang`
--

INSERT INTO `tam_vang` (`so_CMND`, `so_giay_tam_vang`, `tu_ngay`, `den_ngay`, `noi_tam_tru`) VALUES
('161616161', 'TTV05', '2023-11-15', '2023-11-17', 'adasds'),
('161616161', 'TTV10', '2023-11-15', '2023-11-17', 'adasds'),
('111111111', 'TV001', '2023-01-01', '2023-02-01', '456 X Street'),
('222222222', 'TV002', '2023-02-15', '2023-03-15', '789 Y Street'),
('333333333', 'TV003', '2023-04-01', '2023-05-01', '101 Z Street');

-- --------------------------------------------------------

--
-- Table structure for table `tang_thuong`
--

CREATE TABLE `tang_thuong` (
  `id_tang_thuong` varchar(5) NOT NULL,
  `id_dip_tang_thuong` varchar(5) DEFAULT NULL,
  `so_ho_khau` varchar(20) DEFAULT NULL,
  `so_tien` int(11) DEFAULT 0,
  `so_phan_qua` int(11) DEFAULT 1,
  `isDeleted` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` varchar(50) NOT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `isAdmin` varchar(10) DEFAULT 'YES',
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `email`, `isAdmin`, `password`) VALUES
('1', 'admin', 'admin@email.com', 'Yes', '12345'),
('2', 'user1', 'user1@email.com', 'No', 'password1'),
('3', 'user2', 'user2@email.com', 'No', 'password2');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dip_tang_thuong`
--
ALTER TABLE `dip_tang_thuong`
  ADD PRIMARY KEY (`id_dip_tang_thuong`);

--
-- Indexes for table `ho_khau`
--
ALTER TABLE `ho_khau`
  ADD PRIMARY KEY (`so_ho_khau`),
  ADD KEY `id_chu_ho` (`id_chu_ho`);

--
-- Indexes for table `khai_tu`
--
ALTER TABLE `khai_tu`
  ADD PRIMARY KEY (`so_CMND`,`so_giay_khai_tu`);

--
-- Indexes for table `ngan_quy_tang_thuong`
--
ALTER TABLE `ngan_quy_tang_thuong`
  ADD PRIMARY KEY (`id_ngan_quy_tang_thuong`);

--
-- Indexes for table `nhan_khau`
--
ALTER TABLE `nhan_khau`
  ADD PRIMARY KEY (`so_CMND`);

--
-- Indexes for table `tam_tru`
--
ALTER TABLE `tam_tru`
  ADD PRIMARY KEY (`so_giay_tam_tru`),
  ADD KEY `so_CMND` (`so_CMND`);

--
-- Indexes for table `tam_vang`
--
ALTER TABLE `tam_vang`
  ADD PRIMARY KEY (`so_giay_tam_vang`),
  ADD KEY `so_CMND` (`so_CMND`);

--
-- Indexes for table `tang_thuong`
--
ALTER TABLE `tang_thuong`
  ADD PRIMARY KEY (`id_tang_thuong`),
  ADD KEY `so_ho_khau` (`so_ho_khau`),
  ADD KEY `id_dip_tang_thuong` (`id_dip_tang_thuong`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `ho_khau`
--
ALTER TABLE `ho_khau`
  ADD CONSTRAINT `ho_khau_ibfk_1` FOREIGN KEY (`id_chu_ho`) REFERENCES `nhan_khau` (`so_CMND`);

--
-- Constraints for table `khai_tu`
--
ALTER TABLE `khai_tu`
  ADD CONSTRAINT `khai_tu_ibfk_1` FOREIGN KEY (`so_CMND`) REFERENCES `nhan_khau` (`so_CMND`);

--
-- Constraints for table `tam_tru`
--
ALTER TABLE `tam_tru`
  ADD CONSTRAINT `tam_tru_ibfk_1` FOREIGN KEY (`so_CMND`) REFERENCES `nhan_khau` (`so_CMND`);

--
-- Constraints for table `tam_vang`
--
ALTER TABLE `tam_vang`
  ADD CONSTRAINT `tam_vang_ibfk_1` FOREIGN KEY (`so_CMND`) REFERENCES `nhan_khau` (`so_CMND`);

--
-- Constraints for table `tang_thuong`
--
ALTER TABLE `tang_thuong`
  ADD CONSTRAINT `tang_thuong_ibfk_1` FOREIGN KEY (`so_ho_khau`) REFERENCES `ho_khau` (`so_ho_khau`),
  ADD CONSTRAINT `tang_thuong_ibfk_2` FOREIGN KEY (`id_dip_tang_thuong`) REFERENCES `dip_tang_thuong` (`id_dip_tang_thuong`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
