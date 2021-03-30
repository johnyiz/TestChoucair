package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SearchKeywords_Test {
	
	private WebDriver driver;
	SearchKeywords searchkeyword;

	@Before
	public void setUp() throws Exception {
		
		searchkeyword= new SearchKeywords(driver);
		driver = searchkeyword.chromeDriverConection();
		searchkeyword.visit("https://www.choucairtesting.com/");
		
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() throws InterruptedException {
		searchkeyword.Keywords();
	}

}
