/**
 * 
 */
package com.nanditha.BookListApplication;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.nanditha.BookListApplication.controller.WelcomeController;

/**
 * @author NANDITHA
 *
 */

@RunWith(SpringRunner.class)
@WebMvcTest(WelcomeController.class)
class TestingController {

	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/welcome")).andDo(print()).andExpect(status().isOk())
					.andExpect(content().string(containsString("Hello")));
	}
	
	

}
