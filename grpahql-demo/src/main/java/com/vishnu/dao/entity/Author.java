/**
 * 
 * grpahql-demo : Author.java
 */
package com.vishnu.dao.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * grpahql-demo : com.vishnu.dao.entity
 *
 * 
 * @author vishnu.g
 *
 *         07-Jan-2020
 * 
 */
@EqualsAndHashCode
@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
public class Author implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4638089449910120047L;

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "website")
	private String webSite;
	
	public Author(Long id) {
        this.id = id;
    }
}
