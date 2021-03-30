package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class keywordsandLocation_Test {
	
	private WebDriver driver;
	keywordsandLocation keywordlocation;

	@Before
	public void setUp() throws Exception {
		keywordlocation = new keywordsandLocation(driver);
		driver=keywordlocation.chromeDriverConection();
		keywordlocation.visit("https://www.choucairtesting.com/");
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		keywordlocation.keywordLocation();
		
	}

}
