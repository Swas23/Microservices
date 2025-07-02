package com.cts.spring_demo;

import java.util.List;

public class Library {
	
	private List<String> books;

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}
	
	public void mylib() {
		System.out.println("List of books : "+books);
	}

}
