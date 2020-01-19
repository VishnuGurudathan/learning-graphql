/**
 * 
 * grpahql-demo : BookService.java
 */
package com.vishnu.service;

import java.util.List;
import java.util.Optional;

import com.vishnu.dao.entity.Book;

/**
 * 
 * grpahql-demo : com.vishnu.service
 *
 * 
 * @author vishnu.g
 *
 * 08-Jan-2020
 * 
 */
public interface BookService {

	/**
	 * <p>
	 * Create a Book.
	 * </p>
	 * 
	 * @param title
	 * @param isbn
	 * @param pageCount
	 * @param Author
	 * @param publishedOn
	 * @return {@link Book}
	 */
	public Book addBook(final String title, final String isbn, final Integer pageCount,
			final Long authorId, final String publishedOn);

	/**
	 * <p>
	 * Get all Books.
	 * </p>
	 * 
	 * @return {@link List<Book>}
	 */
	public List<Book> findAllBooks();

	/**
	 * <p>
	 * Get a Book based on id.
	 * </p>
	 * 
	 * @param id
	 * @return {@link Optional<Book>}
	 */
	public Optional<Book> getBook(final long id);
	
	/**
	 * 
	 * @return
	 */
	public Long numberOfBooks();
	
	/**
	 * 
	 * @param book
	 * @return {@link Book}
	 */
	public Book save(Book book);
}

