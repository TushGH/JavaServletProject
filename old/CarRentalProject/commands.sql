<<<<<<< HEAD:old/CarRentalProject/commands.sql
CREATE TABLE user (username varchar(100), role varchar(100), name varchar(100) , email varchar(100) , phone int, address varchar(100), utaid int, password varchar(100), BlackListed varchar(100), Autoclubnumber varchar(100));

CREATE TABLE cars (CarName varchar(100), capacity int, Weekday double, Weekend double, Week double);

CREATE TABLE extras (CarName varchar(100), GPS double, OnStar double, SiriusXm double);

CREATE TABLE reservedcars (Confirmationid int, CarName varchar(100), Username varchar(100), Starttime time, Startdate date, Endtime time, EndDate Date);


INSERT INTO cars(CarName, capacity , Weekday, Weekend, Week)VALUES('Smart', '1','32.99','37.99','230.93'),('Economy', '3','39.99','44.99','279.93'),('Compact', '4','44.99','49.99','314.93'),('Intermediate', '4','45.99','50.99','321.93'),('Standard', '5','48.99','53.99','342.93'),('FullSize', '6','52.99','57.99','370.93'),('SUV', '8','59.99','64.99','419.93'),('Minivan', '9','59.99','64.99','419.93'),('UltraSports', '2','199.99','204.99','1399.93');
=======
CREATE TABLE user (username varchar(100), role varchar(100), name varchar(100) , email varchar(100) , phone int, address varchar(100), utaid int, password varchar(100), BlackListed varchar(100), Autoclubnumber varchar(100));

CREATE TABLE cars (CarName varchar(100), capacity int, Weekday double, Weekend double, Week double,GPS double, OnStar double, SiriusXm double);

CREATE TABLE reservedcars (Confirmationid int, CarName varchar(100), Username varchar(100), Starttime time, Startdate date, Endtime time, EndDate Date);


INSERT INTO cars(CarName, capacity , Weekday, Weekend, Week)VALUES('Smart', '1','32.99','37.99','230.93'),
('UltraSports', '2','199.99','204.99','1399.93','3','5','7'),
('Economy', '3','39.99','44.99','279.93','5','7','9'),
('Compact', '4','44.99','49.99','314.93','3','5','7'),
('Intermediate', '4','45.99','50.99','321.93','3','5','7'),
('Standard', '5','48.99','53.99','342.93','3','5','7'),
('FullSize', '6','52.99','57.99','370.93','3','5','7'),
('SUV', '8','59.99','64.99','419.93','3','5','7'),
('Minivan', '9','59.99','64.99','419.93','3','5','7');
>>>>>>> 8d1d0d3df2c7be18d28586fb28a54ffa0cf11867:CarRentalProject/commands.sql
