package com.infosys.Librarypgm;

import java.util.List;

import lombok.Data;
@Data
public class LibraryServices {
	private List<Book>Books;
	
	public void displayBooks() {
		for(Book book: Books) {
			System.out.println("Title: "+ book.getBookname()+", Author: "+ book.getAuthorname());
			
		}
	}
	
}
