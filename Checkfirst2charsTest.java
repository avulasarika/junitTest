package com.epam.tddjunitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Checkfirst2charsTest {
	/*
	 * 1. 2 chars : AA => ""
	 *             -> AB => B
	 *              BB => BB
	 * 2. 4 chars : ABCD => "BCD"
	 *              AACD =>"CD"
	 *              BACD => "BCD"
	 *              BBAA => "BBAA"
	 *              AABAA => "BAA"  
	 */
	Checkfirst2chars checkfirst2chars;
	@BeforeEach
	 void setUp() {
		checkfirst2chars = new Checkfirst2chars();
	}
	@Test
	void test2chars() {
	  assertEquals("B",checkfirst2chars.removeA("AB"));
	}
	@Test
	void test21chars() {
	  assertEquals(" ",checkfirst2chars.removeA("AA"));
	}
	@Test
	void test22chars() {
	  assertEquals("B",checkfirst2chars.removeA("BA"));
	}
	@Test
	void test23chars() {
	  assertEquals("BB",checkfirst2chars.removeA("BB"));
	}
	@Test
	void test4chars() {
		  assertEquals("BCD",checkfirst2chars.removeA("ABCD"));
	}@Test
	void test41chars() {
		  assertEquals("CD",checkfirst2chars.removeA("AACD"));
	}
	@Test
     void test5chars() {
			  assertEquals("BAA",checkfirst2chars.removeA("AABAA"));
	}
}

