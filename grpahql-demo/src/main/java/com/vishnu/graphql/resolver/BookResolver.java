/**
 * 
 * grpahql-demo : BookResolver.java
 */
package com.vishnu.graphql.resolver;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.vishnu.dao.entity.Author;
import com.vishnu.dao.entity.Book;
import com.vishnu.dao.repository.AuthorRepository;

/**
 * 
 * grpahql-demo : com.vishnu.graphql.resolver
 *
 * 
 * @author vishnu.g
 *
 *         09-Jan-2020
 * 
 */
public class BookResolver implements GraphQLResolver<Book> {

	@Autowired
	private AuthorRepository authorRepository;

	public BookResolver(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

	public Optional<Author> getAuthor(Book book) {
		return authorRepository.findById(book.getAuthor().getId());
	}
}
