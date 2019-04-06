package uk.co.zoopla.pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import uk.co.zoopla.TestBase.Testbase;

public class ProjectsDetails extends Testbase{

	
	public ProjectsDetails() throws IOException{
		
	}
	
	
	
	public void PropList() {
	List<WebElement> propT =
			driver.findElements(By.xpath("//*/ul[@class=\\\"listing-results clearfix js-gtm-list\\\"]/li[@class=\\\"srp clearfix   \\"));
	for(WebElement text : propT) {
		System.out.println(text.getText());
		
		
	}
}
}
