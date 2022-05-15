package com.jwlim.api.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestMethod {

	@Test
	void test() {
//		fail("Not yet implemented");
	}
	@BeforeAll
	static void BeforeAll() {
		System.out.println("@beforAll");
	}
	
	@AfterAll
	static void AfterAll() {
		System.out.println("@AfterAll");
	}
	
	@BeforeEach
	void BeforeEach() {
		System.out.println("@BeforeEach");
	}
	
	@AfterEach
	void AfterEach() {
		System.out.println("@AfterEach");
	}
	
	@Test
	void Test1() {
		System.out.println("Test1");
	}
	
	@Test
	@Disabled
	void Test2() {
		System.out.println("Test2");
	}
}
