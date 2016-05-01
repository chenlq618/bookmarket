create database bookmarket;
use bookmarket;

drop table if exists userInfo;
create table userInfo(
userId int primary key auto_increment,
name varchar(20),
userIcon varchar(200),
password varchar(20),
sex int, -- 0表示男，1表示女
phone varchar(11),
address varchar(200),
userType int -- 用户类型，0是管理员，1是普通用户
);

insert into userInfo(name,userIcon,password,sex,phone,address,userType) values('曾琳婷','1.jpg','123456','1','12345678901','广东省茂名市','0');
insert into userInfo(name,userIcon,password,sex,phone,address,userType) values('a1','defaultUserIcon.jpg','123456','0','12345678901','广省广州市','1');

drop table if exists bookInfo;
create table bookInfo(
id int primary key auto_increment,
bookId long,
bookName varchar(100),
bookIntro varchar(4000),
author varchar(50),
bookImg varchar(200),
bookURL varchar(200),
prize numeric(10,2),
pageSize int,
bookType int, -- 0是小说；1是文学；2是计算机
releaseDate timestamp
);


drop table if exists buys;
create table buys(
buyId int primary key auto_increment,
userId int,
name varchar(20),
bookId long,
type int, -- 0是收藏，1是购买，3是查看
operateDate timestamp -- 操作日期
);


