package uk.co.zoopla;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import uk.co.zoopla.TestBase.Testbase;
import uk.co.zoopla.pages.ProjectsDetails;
import uk.co.zoopla.pages.PropertiesViewPage;

public class PropertiesViewPageTest extends Testbase {

	PropertiesViewPage propertiesView;
	ProjectsDetails projectDetails;
	
	
	public PropertiesViewPageTest() throws IOException {
		super();
	}
	
	
	@BeforeMethod
	@BeforeTest
	public void setUp() throws IOException {
	initialisation();
	propertiesView = new PropertiesViewPage();
	
	}
	
	
	@Test
	public void ClickDealerPage() throws IOException {
		projectDetails = propertiesView.DealerContact();
	}
	
	
	@AfterTest
	public void TearDown() {
		
		driver.close();
	}
}
