package com.redshift.BookService.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.redshift.BookSerice.Model.Book;

@RestController
public class BookController {

	List<Book> books=List.of(
			new Book(12,"science","haritha",1),
			new Book(13,"social","harika",1),
			new Book(14,"Hindi","srinu",2)
	);
	
	
	@GetMapping("/Book/Library/{library_id}")
	public List<Book> getBooks(@PathVariable Integer library_id)
	{
		
		return  this.books.stream().filter(books->books.getLibrary_id().equals(library_id)).collect(Collectors.toList());
	}
	
}
