/**
 * 
 */
package com.nanditha.BookListApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NANDITHA
 *
 */
@RestController
public class WelcomeController {
	@RequestMapping("/welcome")
	public String welcome() {
		return "Hello";
	}
}
