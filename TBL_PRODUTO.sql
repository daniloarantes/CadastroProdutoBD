-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Sep 13, 2018 at 11:05 AM
-- Server version: 10.1.35-MariaDB-1
-- PHP Version: 7.0.31-1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `teste`
--

-- --------------------------------------------------------

--
-- Table structure for table `TBL_PRODUTO`
--

CREATE TABLE `TBL_PRODUTO` (
  `id` int(11) NOT NULL,
  `descricao` varchar(70) NOT NULL,
  `valor` double NOT NULL,
  `quantidade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `TBL_PRODUTO`
--

INSERT INTO `TBL_PRODUTO` (`id`, `descricao`, `valor`, `quantidade`) VALUES
(1, 'Arroz', 2.5, 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `TBL_PRODUTO`
--
ALTER TABLE `TBL_PRODUTO`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `TBL_PRODUTO`
--
ALTER TABLE `TBL_PRODUTO`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
