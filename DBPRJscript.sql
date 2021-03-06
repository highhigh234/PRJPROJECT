USE [master]
GO
/****** Object:  Database [PRJ_PROJECT]    Script Date: 3/20/2022 11:56:00 PM ******/
CREATE DATABASE [PRJ_PROJECT]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'PRJ_PROJECT', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\PRJ_PROJECT.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'PRJ_PROJECT_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.MSSQLSERVER\MSSQL\DATA\PRJ_PROJECT_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [PRJ_PROJECT] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [PRJ_PROJECT].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [PRJ_PROJECT] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET ARITHABORT OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [PRJ_PROJECT] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [PRJ_PROJECT] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET  DISABLE_BROKER 
GO
ALTER DATABASE [PRJ_PROJECT] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [PRJ_PROJECT] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET RECOVERY FULL 
GO
ALTER DATABASE [PRJ_PROJECT] SET  MULTI_USER 
GO
ALTER DATABASE [PRJ_PROJECT] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [PRJ_PROJECT] SET DB_CHAINING OFF 
GO
ALTER DATABASE [PRJ_PROJECT] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [PRJ_PROJECT] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [PRJ_PROJECT] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [PRJ_PROJECT] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'PRJ_PROJECT', N'ON'
GO
ALTER DATABASE [PRJ_PROJECT] SET QUERY_STORE = OFF
GO
USE [PRJ_PROJECT]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 3/20/2022 11:56:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[username] [varchar](150) NOT NULL,
	[password] [varchar](150) NOT NULL,
	[isAdmin] [bit] NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Booking]    Script Date: 3/20/2022 11:56:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Booking](
	[bid] [int] IDENTITY(1,1) NOT NULL,
	[rid] [int] NOT NULL,
	[checkInDate] [date] NOT NULL,
	[checkOutDate] [date] NOT NULL,
	[guestusename] [varchar](100) NOT NULL,
 CONSTRAINT [PK_Booking_1] PRIMARY KEY CLUSTERED 
(
	[bid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Customer]    Script Date: 3/20/2022 11:56:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[cid] [int] IDENTITY(1,1) NOT NULL,
	[cfirstname] [varchar](150) NOT NULL,
	[clastname] [varchar](150) NOT NULL,
	[dob] [date] NOT NULL,
	[address] [varchar](200) NOT NULL,
	[phonenumber] [int] NOT NULL,
	[guestusename] [varchar](100) NOT NULL,
 CONSTRAINT [PK_Customer_1] PRIMARY KEY CLUSTERED 
(
	[cid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Room_Type]    Script Date: 3/20/2022 11:56:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Room_Type](
	[rid] [int] NOT NULL,
	[rtype] [varchar](50) NOT NULL,
	[maxallowance] [int] NOT NULL,
	[pricepernight] [float] NOT NULL,
	[description] [varchar](2000) NOT NULL,
	[facilities] [varchar](200) NOT NULL,
	[rpic] [varchar](300) NOT NULL,
 CONSTRAINT [PK_Room_Type_1] PRIMARY KEY CLUSTERED 
(
	[rid] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Booking]  WITH CHECK ADD  CONSTRAINT [FK_Booking_Room_Type] FOREIGN KEY([rid])
REFERENCES [dbo].[Room_Type] ([rid])
GO
ALTER TABLE [dbo].[Booking] CHECK CONSTRAINT [FK_Booking_Room_Type]
GO
USE [master]
GO
ALTER DATABASE [PRJ_PROJECT] SET  READ_WRITE 
GO
