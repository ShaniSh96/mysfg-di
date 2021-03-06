package com.example.demo.controller;

import static org.assertj.core.api.Assertions.contentOf;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.demo.services.ConstructorGreetingServiceImpl;

class ConstructorInjectionControllerTest {

	public ConstructorInjectionController controlle;
	@BeforeEach
	void setUp() throws Exception {
		controlle = new ConstructorInjectionController(new ConstructorGreetingServiceImpl());
	}

	@Test
	void testGetGrerting() {
		System.out.println(controlle.getGrerting());
	}

}
