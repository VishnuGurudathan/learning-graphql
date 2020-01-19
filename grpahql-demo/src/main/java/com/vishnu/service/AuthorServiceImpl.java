/**
 * 
 * grpahql-demo : AuthorServiceImpl.java
 */
package com.vishnu.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vishnu.dao.entity.Author;
import com.vishnu.dao.repository.AuthorRepository;

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
@Service
public class AuthorServiceImpl implements AuthorService {

    private static final Logger logger = LoggerFactory.getLogger(AuthorServiceImpl.class);

	@Autowired
	private AuthorRepository authorRepository;

	@Override
	@Transactional
	public Author createAuthor(String firstName, String lastName, String email, String webSite) {
		final Author author = new Author();
		author.setFirstName(firstName);
		author.setLastName(lastName);
		author.setEmail(email);
		author.setWebSite(webSite);
		return this.authorRepository.save(author);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Author> findAllAuthors() {
		return this.authorRepository.findAll();
	}


	@Override
	@Transactional(readOnly = true)
	public Optional<Author> getAuthor(long id) {
		return this.authorRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Long numberOfAuthors() {
		return this.authorRepository.count();
	}


	@Override
	@Transactional(readOnly = true)
	public Author findByEmail(String email) {
		return this.authorRepository.findByEmail(email);
	}


	@Override
	@Transactional
	public Author updateAuthorDeatils(Author author) {
		return this.authorRepository.saveAndFlush(author);
	}

}
