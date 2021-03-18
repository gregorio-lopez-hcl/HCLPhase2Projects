# Login-Registration Phase End Project 

## This program utilizes provides an ```index.jsp``` page that prompts the user to either login or sign up/register their profile. 

## Project Elements 
This project utilizes a mySQL database with the following port, syntax, tables, and user credentials: 

####Creating Database/User
```sql
localhost:3306 
create database db_example; 
create user 'springuser'@'%' identified by 'password'; 
grant all on db_example.* to 'User'@'%';

####Creating a table
```sql
CREATE TABLE db_example.user (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

####Sample Data
```sql
use db_example;
insert into db_example.user (id, email, name, password) values (1, 'someemail@someemailprovider.com', 'First', 'mypassword');
insert into db_example.user (id, email, name, password) values (2, 'someemail@someemailprovider.com', 'Second', 'mypassword2');
```
##Logic
### Login
If the user chooses to login the program will direct them to the ```ulogin.jsp``` which accepts user input to 
search the database for a corresponding ```sql name``` and ```sql password``` pair, 
if it is correct it directs them to the ```logsuccess.jsp```, however if incorrect it will direct the user the ```logfail.jsp```. 
Has a ```html Home Page``` hyperlink to navigate back to index. 

###Sign Up
If the user chooses to register a new user the program will direct them to the ```ureg.jsp``` 
that will accept user input for the fields of ```sql 'id', 'name', 'email', 'password```
and then store them and update the corressponding row (only if the row already exsists, so only row/```id 1-2```). 
It will then send the user to either a ```regsuccess.jsp``` or a ```regfail.jsp``` with an option to return to 
the ```index.jsp``` with ```html Home Page```. 
