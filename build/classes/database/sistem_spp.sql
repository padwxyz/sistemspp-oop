-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 07 Jan 2024 pada 05.12
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sistem_spp`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_siswa`
--

CREATE TABLE `data_siswa` (
  `nis` varchar(10) NOT NULL,
  `nama_lengkap` varchar(100) NOT NULL,
  `alamat_lengkap` varchar(100) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `no_telp` varchar(15) NOT NULL,
  `email` varchar(30) NOT NULL,
  `jurusan` text DEFAULT NULL,
  `kelas` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `data_siswa`
--

INSERT INTO `data_siswa` (`nis`, `nama_lengkap`, `alamat_lengkap`, `jenis_kelamin`, `no_telp`, `email`, `jurusan`, `kelas`) VALUES
('2208561067', 'Pande Bhargo', 'Jalan Satria', 'Laki-laki', '081234', 'pandeaja@gmail.com', 'Teknologi Rekayasa Perangkat Lunak', 'XII TRPL 1'),
('2208561073', 'Bagus Devit', 'Jalan Hah', 'Laki-laki', '082567', 'devitanjaymabar@gmail.com', 'Teknologi Rekayasa Perangkat Lunak', 'XII TRPL 1'),
('2208561099', 'Darma Berguna', 'Jalan Pintas', 'Laki-laki', '083890', 'gimanamenya@gmail.com', 'Teknologi Rekayasa Perangkat Lunak', 'XII TRPL 1'),
('2208561023', 'Tun Pasek', 'Jalan Hidup', 'Laki-laki', '088967', 'iamtun@gmail.com', 'Teknologi Rekayasa Perangkat Lunak', 'XII TRPL 1'),
('2208561017', 'Sida Nanda', 'Jalan Ninja', 'Laki-laki', '086490', 'sidaningdon@gmail.com', 'Teknologi Rekayasa Perangkat Lunak', 'XII TRPL 1'),
('2208561000', 'Anantha Aditya', 'Jalan Hati', 'Laki-laki', '078934', 'anntdty@gmail.com', 'Teknologi Rekayasa Perangkat Lunak', 'XII TRPL 1'),
('2208561063', 'Heri Baskara', 'Jalan Curr', 'Laki-laki', '081672', 'curinaja@gmail.com', 'Teknologi Rekayasa Perangkat Lunak', 'XII TRPL 1'),
('2208561129', 'Kevin Tanes', 'Jalan Skena', 'Laki-laki', '089178', 'sekannibuos@gmail.com', 'Teknologi Rekayasa Perangkat Lunak', 'XII TRPL 1'),
('2208561111', 'Candra', 'Jalan Singaraja', 'Perempuan', '081267', 'on@gmail.com', 'Teknologi Rekayasa Perangkat Lunak', 'XII TRPL 1'),
('2208561135', 'Prast Dewi', 'Jalan Galau', 'Perempuan', '082943', 'prast@gmail.com', 'Teknologi Rekayasa Perangkat Lunak', 'XII TRPL 1'),
('xx', 'xx', 'xx', 'Laki-laki', 'xx', 'xx', 'Pilih Jurusan', 'Pilih Kelas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `riwayat_transaksi`
--

CREATE TABLE `riwayat_transaksi` (
  `id_transaksi` varchar(100) NOT NULL,
  `nis` varchar(75) NOT NULL,
  `nama_lengkap` varchar(100) NOT NULL,
  `jurusan` varchar(100) NOT NULL,
  `kelas` varchar(100) NOT NULL,
  `cicilan` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `metode_pembayaran` varchar(100) NOT NULL,
  `total_pembayaran` varchar(100) NOT NULL,
  `keterangan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `riwayat_transaksi`
--

INSERT INTO `riwayat_transaksi` (`id_transaksi`, `nis`, `nama_lengkap`, `jurusan`, `kelas`, `cicilan`, `semester`, `metode_pembayaran`, `total_pembayaran`, `keterangan`) VALUES
('TRF00001', '2208561000', 'Anantha Aditya', 'Teknologi Rekayasa Perangkat Lunak', 'X TRPL 1', '', 'Semester 1', 'Tunai', 'Rp 3.000.000', 'Lunas'),
('TRF00002', '2208561000', 'Anantha Aditya', 'Teknologi Rekayasa Perangkat Lunak', 'X TRPL 1', '', 'Semester 2', 'Tunai', 'Rp 3.000.000', 'Lunas'),
('TRF00003', '2208561000', 'Anantha Aditya', 'Teknologi Rekayasa Perangkat Lunak', 'XI TRPL 1', '', 'Semester 3', 'Tunai', 'Rp 3.000.000', 'Lunas'),
('TRF00004', '2208561000', 'Anantha Aditya', 'Teknologi Rekayasa Perangkat Lunak', 'XI TRPL 1', '', 'Semester 4', 'Non Tunai', 'Rp 3.000.000', 'Lunas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tagihan`
--

CREATE TABLE `tagihan` (
  `id_transaksi` varchar(100) NOT NULL,
  `semester` varchar(100) NOT NULL,
  `status` varchar(100) NOT NULL,
  `keterangan` varchar(100) NOT NULL,
  `subtotal` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `tagihan`
--

INSERT INTO `tagihan` (`id_transaksi`, `semester`, `status`, `keterangan`, `subtotal`) VALUES
('TRF00005', 'Semester 5', 'Balum Bayar', '', 'Rp 3.000.000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `user`
--

CREATE TABLE `user` (
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `namasiswa` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `user`
--

INSERT INTO `user` (`username`, `password`, `namasiswa`) VALUES
('2208561000', '12345', 'Anantha Aditya');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
