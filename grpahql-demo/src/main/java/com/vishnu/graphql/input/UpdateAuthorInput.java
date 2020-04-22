/**
 * 
 * grpahql-demo : UpdateAuthorInput.java
 */
package com.vishnu.graphql.input;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * grpahql-demo : com.vishnu.graphql.input
 *
 * 
 * @author vishnu.g
 *
 *         19-Jan-2020
 * 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateAuthorInput {

	private String firstName;
	private String lastName;
	private String email;
	private String webSite;
}
