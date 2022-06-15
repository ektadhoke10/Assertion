package PageFactory;
import org.testng.Assert;
import org.openqa.selenium.By;
import generics.BaseTest;

public class AssertionEx extends BaseTest{

	By loc_btnChcekBox = By.xpath("//span[text()='Check Box']");
	By loc_btnTextBox = By.xpath("//span[text()='Text Box']");
	By loc_btnRadioButton = By.xpath("//span[text()='Radio Button']");
	By loc_btnWebTables = By.xpath("//span[text()='Web Tables']");
	By loc_txtCheckBox= By.xpath("//div[text()='Check Box']");
	By loc_txtTextBox= By.xpath("//div[text()='Text Box']");
	By loc_txtWebTables= By.xpath("//div[text()='Web Tables']");
	By loc_txtImpressive= By.xpath("//label[contains(text(),'Impressive')]");

	//Assert.asserTrue()
	public void clickTextBoX() {
		driver.findElement(loc_btnTextBox).click();
	}
	public String getTextBoxTextOnTextBoxsPage() {
		String strReturnValue = driver.findElement(loc_txtTextBox).getText().trim();
		return strReturnValue;
	}
	public void verifyTextBoxIsDisplayedOnTextBoxPage() {
		Assert.assertTrue(this.getTextBoxTextOnTextBoxsPage().equals("Text Box"));
		System.out.println("Check...assertTrue");
	}

	//Assert.assetEquals()
	public void clickCheckBox() {
		driver.findElement(loc_btnChcekBox).click();
	}
	public String getCheckBoxTextOnCheckBoxPage() {
		String strReturnValue = driver.findElement(loc_txtCheckBox).getText().trim();
		return strReturnValue;
	}
	public void verifyCheckBoxIsDisplayedOnCheckBoxPage() {
		Assert.assertEquals("Check Box", this.getCheckBoxTextOnCheckBoxPage());
		System.out.println("Check...assertEquals");
	}

	//Assert.assertFalse()
	public void clickRadioButton() {
		driver.findElement(loc_btnRadioButton).click();
	}
	public boolean getRadioButtonTextOnRadioButtonPage() {
		boolean strReturnValue = driver.findElement(loc_txtImpressive).isSelected();
		return strReturnValue;
	}

	//Assert.assertFalse() contains the condition which is returning false value. 
	//Therefore, it passes the test case.
	public void verifyRadioButtonIsDisplayedOnRadioButtonPage() {
		Assert.assertFalse(this.getRadioButtonTextOnRadioButtonPage());
		System.out.println("Check...assertFalse");
	}

	//Assert.assertNotEquals()
	public void clickWebTables() {
		driver.findElement(loc_btnWebTables).click();
	}
	public boolean getWebTablesTextOnWebTablesPage() {
		boolean strReturnValue = driver.findElement(loc_txtWebTables).isSelected();
		return strReturnValue;
	}
	public void verifyWebTablesIsDisplayedOnWebTablesPage() {
		Assert.assertNotEquals("WEB TABLES",this.getWebTablesTextOnWebTablesPage());
		System.out.println("Check...assertNotEquals");
	}

	//Assert.assertNull()
	public void assertNullExample() {
		Assert.assertNull(null);  
		System.out.println("Check...assertNull");  
	}	

	//Assert.assertNotNull()
	public void assertNotNullExample() {
		Assert.assertNotNull(10);  
		System.out.println("Check...assertNotNull");  
	}	

}
