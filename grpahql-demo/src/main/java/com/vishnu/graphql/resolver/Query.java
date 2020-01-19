/**
 * 
 * grpahql-demo : Query.java
 */
package com.vishnu.graphql.resolver;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.vishnu.dao.entity.Author;
import com.vishnu.dao.entity.Book;
import com.vishnu.service.AuthorService;
import com.vishnu.service.BookService;

/**
 * 
 * grpahql-demo : com.vishnu.graphql.resolver
 *
 * 
 * @author vishnu.g
 *
 *         07-Jan-2020
 * 
 */
@Component
public class Query implements GraphQLQueryResolver {
	@Autowired
	private AuthorService authorService;

	@Autowired
	private BookService bookService;
	
	public List<Author> findAllAuthors() {
		return this.authorService.findAllAuthors();
	}

	public Optional<Author> findAuthor(final int id) {
		return this.authorService.getAuthor(id);
	}
	
	public Long countAuthors() {
		return this.authorService.numberOfAuthors();
	}
	
	
	public List<Book> findAllBooks() {
		return this.bookService.findAllBooks();
	}

	public Optional<Book> findBook(final int id) {
		return this.bookService.getBook(id);
	}
	
	public Long countBooks() {
		return this.bookService.numberOfBooks();
	}
}
