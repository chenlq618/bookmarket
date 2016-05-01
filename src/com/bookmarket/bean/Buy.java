package com.bookmarket.bean;

import java.io.Serializable;

public class Buy implements Serializable{

	private static final long serialVersionUID = 1L;
	private int buyId;
	
	private int userId;
	private String name;//购买者名
	private String phone;
	private String address;
	
	private long bookId;
	private String bookName;
	private int type; //0是收藏，1是购买
	
	private String bookImg;
	private String bookURL;
	
	private String operateDate;
	public int getBuyId() {
		return buyId;
	}
	public void setBuyId(int buyId) {
		this.buyId = buyId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getOperateDate() {
		return operateDate;
	}
	public void setOperateDate(String operateDate) {
		this.operateDate = operateDate;
	}
	public String getBookImg() {
		return bookImg;
	}
	public void setBookImg(String bookImg) {
		this.bookImg = bookImg;
	}
	public String getBookURL() {
		return bookURL;
	}
	public void setBookURL(String bookURL) {
		this.bookURL = bookURL;
	}
	

}
