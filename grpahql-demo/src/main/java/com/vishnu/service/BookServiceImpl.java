/**
 * 
 * grpahql-demo : BookServiceImpl.java
 */
package com.vishnu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vishnu.dao.entity.Author;
import com.vishnu.dao.entity.Book;
import com.vishnu.dao.repository.BookRepository;

/**
 * 
 * grpahql-demo : com.vishnu.service
 *
 * 
 * @author vishnu.g
 *
 *         08-Jan-2020
 * 
 */
@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	@Transactional
	public Book addBook(String title, String isbn, Integer pageCount, Long authorId, String publishedOn) {
		final Book book = new Book();
		book.setAuthor(new Author(authorId));
		book.setTitle(title);
		book.setIsbn(isbn);
		book.setPageCount(pageCount != null ? pageCount : 0);

		return bookRepository.save(book);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Book> findAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Book> getBook(long id) {
		return bookRepository.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Long numberOfBooks() {
		return bookRepository.count();
	}


	@Override
	@Transactional
	public Book save(Book book) {
		return bookRepository.save(book);
	}

}
