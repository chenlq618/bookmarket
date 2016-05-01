package com.bookmarket.dao;

import java.util.List;

import com.bookmarket.bean.BookInfo;
import com.bookmarket.bean.Buy;
import com.bookmarket.bean.UserInfo;

public interface BookDao {
	//用户管理
	public void addUser(UserInfo user);
	public void updateUserInfo(UserInfo user);
	public UserInfo getUserByName(String name);
	public List<UserInfo> getUsers();
	
	//图书管理
	public void addBook(BookInfo book);
	public void updataBookInfo(BookInfo book);
	public List<BookInfo> getBooks();
	public List<BookInfo> getBooksByType(Integer bookType);
	public BookInfo getBooksById(String bookId);
	
	//订单管理
	public void addBuy(Buy buy);
	public List<Buy> getBuyByUserName(String name);
	public List<Buy> getFavoriteByUserName(String name);
	public List<Buy> getBuys();
	
	//搜索
	public List<BookInfo> sousuo(String bookName);
	

}
