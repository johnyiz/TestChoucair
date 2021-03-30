package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchKeywords extends Base {
	
	By EmpleosLinkLocator= By.linkText("Empleos");
	By EmpleosPageLocator= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2019/07/banner.png']");
	By KeyWordsLocator= By.id("search_keywords");
	By SearchJobsBtnLocator= By.xpath("//input[@value='Search Jobs']");

	public SearchKeywords(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void Keywords() throws InterruptedException {
		click(EmpleosLinkLocator);
		Thread.sleep(2000);
		if(isDisplayed(EmpleosPageLocator)) {
			type("automatizador",KeyWordsLocator);
			click(SearchJobsBtnLocator);
			System.out.println("Prueba Exitosa");
			
		}else {
			System.out.print("Empleados page not found");
		}
	}
}
