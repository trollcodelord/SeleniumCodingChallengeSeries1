package uk.co.zoopla.pages;

import java.util.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import uk.co.zoopla.TestBase.Testbase;


public class HomePage extends Testbase{
	
	//Object Repository
	
	WebDriverWait wait = new WebDriverWait(driver, 10);
	
	@FindBy(xpath = "//img[@class = \"icon--logo\"]")
	WebElement logo;
	
	
	@FindBy(xpath = "//input[@class = \"search-input geo_autocomplete js-check\"]")
	WebElement searchBox;
	
	@FindBy(xpath = "//button[@class = \"button button--primary\"]")
	WebElement searchButton;
	
	
	// Object Initialization
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Action Methods
	
	public boolean VerifyLogo() {
		boolean f = logo.isDisplayed();
		return f;
	}
	
	public void SearchInput() {
		searchBox.sendKeys(System.getProperty("search"));
		
		Boolean content = wait.until(ExpectedConditions.textToBePresentInElement(searchBox, System.getProperty("search")));
		if(content) {
			
		}else {
			throw new NoSuchElementException("No Such Element Found, Please Wait More");
		}
	}
	
	public PropertiesPages SearchBtn() {
		
		searchButton.click();
		
		return new PropertiesPages();
	}
	
	
}
