/**
 * 
 * grpahql-demo : AuthorService.java
 */
package com.vishnu.service;

import java.util.List;
import java.util.Optional;

import com.vishnu.dao.entity.Author;

/**
 * 
 * grpahql-demo : com.vishnu.service
 *
 * 
 * @author vishnu.g
 *
 *         07-Jan-2020
 * 
 */
public interface AuthorService {

	/**
	 * <p>
	 * Create a Author.
	 * </p>
	 * 
	 * @param firstName
	 * @param lastName
	 * @param email
	 * @param webSite
	 * @return {@link Author}
	 */
	public Author createAuthor(final String firstName, final String lastName, final String email,
			final String webSite);

	/**
	 * <p>
	 * Get all Author's based on number of counts.
	 * </p>
	 * 
	 * @return {@link List<Author>}
	 */
	public List<Author> findAllAuthors();

	/**
	 * <p>
	 * Find author by email.
	 * </p>
	 * @return {@link Author}
	 */
	public Author findByEmail(String email);
	/**
	 * <p>
	 * Get a Author based on id.
	 * </p>
	 * 
	 * @param id
	 * @return {@link Optional<Author>}
	 */
	public Optional<Author> getAuthor(final long id);
	
	/**
	 * 
	 * @return
	 */
	public Long numberOfAuthors();
	
	/**
	 * 
	 * @param author
	 * @return @return {@link Author}
	 */
	public Author updateAuthorDeatils(Author author);
}
