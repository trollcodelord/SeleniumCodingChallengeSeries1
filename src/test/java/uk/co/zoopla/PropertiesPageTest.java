package uk.co.zoopla;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import uk.co.zoopla.TestBase.Testbase;
import uk.co.zoopla.pages.PropertiesPages;
import uk.co.zoopla.pages.PropertiesViewPage;

public class PropertiesPageTest extends Testbase {

	PropertiesViewPage PropertiesVvewpage;
	PropertiesPages propertiesPages;
	
	public PropertiesPageTest() throws IOException {
			super();
	}
	
	@BeforeTest
	public void setup() throws IOException {
		initialisation();
		propertiesPages = new PropertiesPages();
	}
	
	
	@Test
	public void VerifyPagetitle() {
	String a =	propertiesPages.getPageTitle();
	AssertJUnit.assertEquals(a, a);
	}
	
	
	@Test
	public void VerifyFifithOption() {
		propertiesPages.ClickFifthOption();
	}
	
	@Test
	public void priceList() throws IOException {
		PropertiesVvewpage = 	propertiesPages.DisplayAmount();
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
}
