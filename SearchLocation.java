package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchLocation extends Base {
	
	By EmpleosLinkLocator= By.linkText("Empleos");
	By EmpleosPageLocator= By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/2019/07/banner.png']");
	By LocationLocator= By.name("search_location");
	By SearchJobsBtnLocator= By.xpath("//input[@value='Search Jobs']");

	public SearchLocation(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void Location() throws InterruptedException {
		click(EmpleosLinkLocator);
		Thread.sleep(2000);
		if(isDisplayed(EmpleosPageLocator)) {
			type("Lima",LocationLocator);
			click(SearchJobsBtnLocator);
			System.out.println("Prueba Exitosa");
			
		}else {
			System.out.print("Empleados page not found");
		}
	}
}
