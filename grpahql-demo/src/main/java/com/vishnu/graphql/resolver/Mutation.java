/**
 * 
 * grpahql-demo : Mutation.java
 */
package com.vishnu.graphql.resolver;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.vishnu.dao.entity.Author;
import com.vishnu.dao.entity.Book;
import com.vishnu.graphql.exception.BookNotFoundException;
import com.vishnu.graphql.input.UpdateAuthorInput;
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
public class Mutation implements GraphQLMutationResolver {

	private static final Logger logger = LoggerFactory.getLogger(Mutation.class);

	@Autowired
	private AuthorService authorService;

	@Autowired
	private BookService bookService;

	public Author newAuthor(final String firstName, final String lastName, final String email, final String webSite) {
		logger.debug("request for creating a vehicle with payload type : {}", firstName);
		return this.authorService.createAuthor(firstName, lastName, email, webSite);
	}

	public Book newBook(final String title, final String isbn, final Integer pageCount, final Long authorId,
			final String publishedOn) {
		return this.bookService.addBook(title, isbn, pageCount, authorId, publishedOn);
	}

	public Book updateBookPageCount(Integer pageCount, Long id) {
		Book book = bookService.getBook(id)
				.orElseThrow(() -> new BookNotFoundException("Requested book to update was not found.", id));
		book.setPageCount(pageCount);
		return bookService.save(book);
	}
	
	public Author updateAuthor(UpdateAuthorInput input) {
		Author author = authorService.findByEmail(input.getEmail());
		if (author == null) // TODO Need to change to application specific exception class.
			throw new EntityNotFoundException("Requested Author with email '" + input.getEmail() + "' not found.");
		if (input.getWebSite()!= null)
			author.setWebSite(input.getWebSite());
		if (input.getFirstName() != null)
			author.setFirstName(input.getFirstName());
		
		return authorService.updateAuthorDeatils(author);
	}
}
