/**
 * 
 * grpahql-demo : Book.java
 */
package com.vishnu.dao.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 
 * grpahql-demo : com.vishnu.dao.entity
 *
 * 
 * @author vishnu.g
 *
 * 08-Jan-2020
 * 
 */
@Data
@EqualsAndHashCode
@Entity
@Table
public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "title", nullable = false)
	private String title;

	@Column(name = "isbn", nullable = false)
	@Size(min=7, message="ISBN should have atleast 4 characters")
	private String isbn;

	@Column(name = "page_count")
	private Integer pageCount;

	
	@ManyToOne
    @JoinColumn(name = "author_id",
            nullable = false, updatable = false)
	private Author author;
	
	@Column(name = "published_on")
	private LocalDate publishedOn;

	private transient String formattedDate;

	// Getter and setter
	public String getFormattedDate() {
		return getPublishedOn().toString();
	}
}

