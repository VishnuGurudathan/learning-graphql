/**
 * 
 * grpahql-demo : BookRepository.java
 */
package com.vishnu.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishnu.dao.entity.Book;

/**
 * 
 * grpahql-demo : com.vishnu.dao.repository
 *
 * 
 * @author vishnu.g
 *
 *         08-Jan-2020
 * 
 */
public interface BookRepository extends JpaRepository<Book, Long> {

}
