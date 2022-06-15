package scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PageFactory.AssertionEx;
import generics.BaseTest;

public class TestAssertionEx {
	private AssertionEx objAssertionEx;
	
	public void initilizeWebPages(){
		objAssertionEx = new AssertionEx();
	}

	@BeforeClass
	public void initilizeWebEnvironment() {
		BaseTest.initializeWebdriver("https://demoqa.com/elements");
		this.initilizeWebPages();
	}

	@AfterClass
	public void tearDownEnv() {
		BaseTest.tearDown();
	}

	@Test
	public void checkAllAssertion() {
		objAssertionEx.clickTextBoX();
		objAssertionEx.verifyTextBoxIsDisplayedOnTextBoxPage();
		
		objAssertionEx.clickCheckBox();
		objAssertionEx.verifyCheckBoxIsDisplayedOnCheckBoxPage();
		
		objAssertionEx.clickRadioButton();
		objAssertionEx.verifyRadioButtonIsDisplayedOnRadioButtonPage();
		
		objAssertionEx.clickWebTables();
		objAssertionEx.verifyWebTablesIsDisplayedOnWebTablesPage();
		
		objAssertionEx.assertNullExample();
		
		objAssertionEx.assertNotNullExample();
	}
	
//	@Test
//	public void TCID_101_VerifyTextboxPageDisplayed() {
//		objAssertionEx.clickTextBoX();
//		objAssertionEx.verifyTextBoxIsDisplayedOnTextBoxPage();
//	}
//	
//	@Test
//	public void TCID_102_VerifyCheckBoxPageDisplayed() {
//		objAssertionEx.clickCheckBox();
//		objAssertionEx.verifyCheckBoxIsDisplayedOnCheckBoxPage();
//	}
//	
//	@Test 
//	public void TCID_103_VerifyRadioButtonPageDisplayed() {
//		objAssertionEx.clickRadioButton();
//		objAssertionEx.verifyRadioButtonIsDisplayedOnRadioButtonPage();
//	}
//	
//	@Test
//	public void TCID_104_VerifyWebTablesPageDisplayed() {
//		objAssertionEx.clickWebTables();
//		objAssertionEx.verifyWebTablesIsDisplayedOnWebTablesPage();
//	}
//	
//	@Test
//	public void TCID_105_AssertNullEx() {
//		objAssertionEx.assertNullExample();
//	}
//	
//	@Test
//	public void TCID_105_AssertNotNullEx() {
//		objAssertionEx.assertNotNullExample();
//	}
	

}
