package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public Index_Page indexPage;

	public WebDriver driver;

	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}

	
	public Index_Page getIndexPage()
	{
	 indexPage= new Index_Page(driver);
	 return indexPage;
	}
	

}
