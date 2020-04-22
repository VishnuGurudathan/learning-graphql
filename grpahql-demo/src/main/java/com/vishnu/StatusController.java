/**
 * 
 * grpahql-demo : StatusController.java
 */
package com.vishnu;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

/**
 * 
 * grpahql-demo : com.vishnu
 *
 * 
 * @author vishnu.g
 *
 *         08-Jan-2020
 * 
 */
@RequestMapping(path = "/status")
@RestController
public class StatusController {


	@GetMapping
	public ResponseEntity<Object> vehicles() {
		ImmutableMap<String, String> status = ImmutableMap.of("status", "OK", "version", "0.0.1", "timestamp",
				LocalDateTime.now().toString());

		return new ResponseEntity<>(status, HttpStatus.OK);
	}
}
