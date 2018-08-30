//create table in database
create table diets 
(
Room_No int NOT NULL,
Room_Id varchar(255) NOT NULL,
LUNCH int,
DINNER int,
CONSTRAINT ALL_STUDENTS FOREGIN KEY(Room_No,Room_Id)REFERENCES Students (Room_No,
Room_Id) ON Delete CASCADE ON UPDATE CASCADE,
DATE DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP);

//second table
create table extras 
(
ID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
ROOM_No int NOT NULL,
ROOM_ID varchar(255) NOT NULL,
PRODUCT_ID int NOT NULL,
PRODUCT_PRICE int NOT NULL,
QUANTITY int  NOT NULL,
FOREGIN KEY(ROOM_NO,ROOM_ID)REFERENCES menu (PRODUCT_ID),
DATE DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP );


// Trigger On Table Extras
create table TRIGGER trigername BEFORE INSERT
ON extras 
FOR EACH ROW
SET NEW.TOTAL =NEW.PRODUCT _PRICE *NEW.QUANNTITY;


//Third table
create table activity
(
Id int AUTO_INCREMENT PRIMARY KEY,
Activity_log varchar(255),
DATE DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP );


//Fourth table
create table login
(
admin varchar(255),
password varchar(255) );


// Fifth table
create table menu
(
product_id int AUTO_INCREMENT PRIMARY KEY ,
product_name varchar(255),
product_price decimal  );


//Sixth table 
create table Students
(
ROOM_NO int,
ROOM_ID varchar(255),
NAME varchar(255),
CONTACT_NO long int,
EMAIL_ID varchar(255) ,
PRIMARY KEY(ROOM_N0,ROOM_ID) );


//Seventh table
create table bill
(
ROOM_NO int,
ROOM_ID varchar(255),
DINNER_DIETS int,
LUNCH_DIETS int,
DIETS_COST decimal,
EXTRAS_COST decimal,
TOTAL decimal,
FOREGIN KEY(ROOM_NO,ROOM_ID) REFRENCES Students(ROOM_NO,ROOM_ID) );

//Trigger On Table Bill
create TRIGGER triggername2 BEFORE INSERT
(
ON BILL
FOR EACH ROW
DIETS_COST = (DINNER_DIETS +LUNCH_DIETS) *25,
TOTAL = DIETS_COST + EXTRAS_COST );