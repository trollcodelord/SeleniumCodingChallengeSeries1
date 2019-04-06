package uk.co.zoopla;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import uk.co.zoopla.TestBase.Testbase;
import uk.co.zoopla.pages.HomePage;
import uk.co.zoopla.pages.PropertiesPages;

public class HomePageTest extends Testbase {

	HomePage Homepage;
	PropertiesPages propPages;
	
	
	public HomePageTest() throws IOException {
		super();
		
	}
	
	
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialisation();
		Homepage = new HomePage();
	}
	
	
	@Test
	public void VerifyLogoHomepage() {
		boolean f = Homepage.VerifyLogo();
		AssertJUnit.assertTrue(f);
	}
	
	
	@Test
	public void verifySearchInput() {
		
		Homepage.SearchInput();
	}
	
	@Test
	public void ClickSearchBtn() throws IOException {
		propPages= Homepage.SearchBtn();
	}
	
	
	

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
