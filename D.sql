-- Create database
DROP DATABASE IF EXISTS TourDuLich;
CREATE DATABASE TourDuLich;
-- Use database
USE TourDuLich;

-- Create Table Employee
DROP TABLE IF EXISTS  CUSTOMER;
CREATE TABLE 	CUSTOMER ( 
	CustomerID 			smallint 		 AUTO_INCREMENT PRIMARY KEY,
	CustomerName 		CHAR(50) 	 NOT NULL  CHECK (LENGTH(CustomerName) <= 20),
	`email` 			CHAR(50) 	 NOT NULL UNIQUE ,
    NgayKhoiHanh 		DATE NOT NULL,
	Phone 				CHAR(10) 	 NOT NULL CHECK(LENGTH(Phone) = 10),
	Address 			NVARCHAR(100) NOT NULL  CHECK (LENGTH(Address) <= 300),
    Note				NVARCHAR(100) NOT NULL CHECK (LENGTH(Note) <= 250)
);

INSERT INTO CUSTOMER	(CustomerName, 	`email`,						NgayKhoiHanh,			Phone,			Address , 		Note)
VALUE					('hanhbb',			'hanhhanoi21999@gmail.com',		'2021-10-5',		'0123456789',		'123abc',		'Manager' 	), 
						('thanhhung',		'hung2122112@gmail.com',		'2021-2-5',			'0123456789',		'123abc',		'Manager' 	), 
						('canbbb',			'cananh2.tuan12@vti.com',		'2021-4-7',			'0123456789'	,	'123abc',		'Manager' 	);		
    
    