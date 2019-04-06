package uk.co.zoopla;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import uk.co.zoopla.TestBase.Testbase;
import uk.co.zoopla.pages.ProjectsDetails;

public class ProjectDetailsTest extends Testbase {

	
	ProjectsDetails projectDetailsasda;
	
	public ProjectDetailsTest() throws IOException {
		super();
	}
	
	
	@BeforeTest
	public void Setup() throws IOException {
		initialisation();
		projectDetailsasda = new ProjectsDetails();
		
	}
	
	
	@Test
	public void verifyPropList() {
		projectDetailsasda.PropList();
	}
	
	
	@AfterMethod
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
