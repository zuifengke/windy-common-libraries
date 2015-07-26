package com.windy.common.libraries;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import com.windy.common.libraries.HelloWorld;

public class HelloWorldTests {
	private HelloWorld helloworld;
	@Before
	public void	initUnitClass(){
		 helloworld=new HelloWorld();
	}
	@Test
	public void testSayHello() {
		if(helloworld!=null)
			helloworld.sayHello();
	}

}
