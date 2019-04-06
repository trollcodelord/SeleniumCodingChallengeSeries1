package uk.co.zoopla.pages;



import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import uk.co.zoopla.TestBase.Testbase;

public class PropertiesViewPage extends Testbase {

	
	@FindBy(xpath="//*/div[@class=\"dp-sidebar-wrapper__contact\"]//a[@class=\"ui-agent__details\"]/div[@class=\"ui-agent__logo\"]")
	WebElement SidebarContacts;
	
	
	public PropertiesViewPage()  throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	
	public ProjectsDetails DealerContact() throws IOException {
		
		SidebarContacts.click();
		
		return new ProjectsDetails();
	}
}
