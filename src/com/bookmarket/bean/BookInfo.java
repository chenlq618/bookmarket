package com.bookmarket.bean;

import java.io.Serializable;

public class BookInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	private long bookId;
	private String bookName;
	private String bookIntro;
	private String bookImg;
	private String author;
	private String bookURL;
	private int bookType; //0是小说，1是文学，2是计算机
	private int bookClick;
	private double prize;
	private int pageSize;
	private String releaseDate;
	
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookIntro() {
		return bookIntro;
	}
	public void setBookIntro(String bookIntro) {
		this.bookIntro = bookIntro;
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
	
	public int getBookType() {
		return bookType;
	}
	public void setBookType(int bookType) {
		this.bookType = bookType;
	}
	public int getBookClick() {
		return bookClick;
	}
	public void setBookClick(int bookClick) {
		this.bookClick = bookClick;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
