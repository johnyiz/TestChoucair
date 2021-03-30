package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SearchLocation_Test {

	private WebDriver driver;
	SearchLocation searchlocation;
	
	@Before
	public void setUp() throws Exception {
		
		searchlocation= new SearchLocation(driver);
		driver=searchlocation.chromeDriverConection();
		searchlocation.visit("https://www.choucairtesting.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}
    
	@Test
	public void test() throws InterruptedException {
		searchlocation.Location();
	}

}
