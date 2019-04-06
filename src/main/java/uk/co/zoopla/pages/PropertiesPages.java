package uk.co.zoopla.pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import uk.co.zoopla.TestBase.Testbase;

public class PropertiesPages extends Testbase{
	
	
	//Object Repository
	
	//verifyTitle
	//amount 
	@FindBy(xpath="//ul[@class=\"listing-results clearfix js-gtm-list\"]/li/div/div[2]/div[1]/following-sibling::a[contains(text(),'£')]")
	WebElement price;
	
	@FindBy(xpath="//ul[@class=\"listing-results clearfix js-gtm-list\"]/li[6]/div/div[1]")
	WebElement FifthOption;

	
	
	
	
	
	public PropertiesPages() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	public PropertiesViewPage DisplayAmount() throws IOException {
		
		List<WebElement> price = new ArrayList<WebElement>(driver.findElements(By.xpath("//ul[@class=\\\"listing-results clearfix js-gtm-list\\\"]/li/div/div[2]/div[1]/following-sibling::a[contains(text(),'£')]")));
		
		Collections.reverse(price);
		
		System.out.println(price);
		
		return new PropertiesViewPage();
			
		}
		
	
	
	public void ClickFifthOption() {
		
		FifthOption.click();
	}
	
	
	
	public String getPageTitle() {
		 String a = driver.getTitle();
		 return a;
	}
	}
	
	
	
	

