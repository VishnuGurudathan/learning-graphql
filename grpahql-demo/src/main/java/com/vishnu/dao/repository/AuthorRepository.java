/**
 * 
 * grpahql-demo : AuthorRepository.java
 */
package com.vishnu.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishnu.dao.entity.Author;

/**
 * 
 * grpahql-demo : com.vishnu.dao.repository
 *
 * 
 * @author vishnu.g
 *
 *         07-Jan-2020
 * 
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
