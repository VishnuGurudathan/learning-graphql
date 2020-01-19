/**
 * 
 * grpahql-demo : BookNotFoundException.java
 */
package com.vishnu.graphql.exception;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

/**
 * 
 * grpahql-demo : com.vishnu.graphql.exception
 *
 * 
 * @author vishnu.g
 *
 *         18-Jan-2020
 * 
 */
public class BookNotFoundException extends RuntimeException implements GraphQLError {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7486434770130316303L;
	private final Long bookId;

	public BookNotFoundException(String message, Long invalidBookId) {
		super(message);
		this.bookId = invalidBookId;
	}

	@Override
	public List<SourceLocation> getLocations() {
		return null;
	}

	@Override
	public ErrorType getErrorType() {
		return ErrorType.DataFetchingException;
	}

	@Override
	public Map<String, Object> getExtensions() {
		return Collections.singletonMap("bookId", bookId);
	}
	
	@Override
	@JsonIgnore
	public StackTraceElement[] getStackTrace() {
	    return super.getStackTrace();
	}

}
