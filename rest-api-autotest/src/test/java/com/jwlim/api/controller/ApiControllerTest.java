package com.jwlim.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(ApiController.class)
public class ApiControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void apiCallTest() throws Exception{
		
		mockMvc.perform(get("/api/call"))
			   .andExpect(status().isOk())
			   .andDo(print());
	}
}
