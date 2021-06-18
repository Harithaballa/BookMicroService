package com.redshift.BookSerice.Model;

public class Book 
{
	int book_id;
	String book_name;
	String author;
	Integer Library_id;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public Book(int book_id, String book_name, String author, int library_id) {
	//	super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.author = author;
		Library_id = library_id;
	}
	public Book() {
		//super();
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getLibrary_id() {
		return Library_id;
	}
	public void setLibrary_id(Integer library_id) {
		Library_id = library_id;
	}

}

