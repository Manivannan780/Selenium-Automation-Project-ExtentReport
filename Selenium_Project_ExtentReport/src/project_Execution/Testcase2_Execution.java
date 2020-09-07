package project_Execution;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import general_Actions.CommonFunctions;
import project_Elements.Testcase1_Elements;
import project_Elements.Testcase2_Elements;

public class Testcase2_Execution extends CommonFunctions{
	
	public void Pageobjectcreation2() {
		myLogObject.info("Testcase 2 Object Creation");
		PageFactory.initElements(driver, Testcase2_Elements.class);
	
	}
	
	public void InputData1() {
		myLogObject.info("Check out Page Adding Inputs");
		Testcase1_Elements.Checkout.click();
		Testcase2_Elements.inputEmail.sendKeys("Reese");
		Testcase2_Elements.inputName.sendKeys("Finch");
		Testcase2_Elements.inputAddress.sendKeys("Never Give up ");
		
	}
	
	public void InputData2() {
		Select selectObject =new Select(Testcase2_Elements.inputCardType);
		selectObject.selectByIndex(1);
		Testcase2_Elements.inputCardNumer.sendKeys("443322");
		String Cardholdername="Batman";
		Testcase2_Elements.inputcardholder.sendKeys(Cardholdername);
		Testcase2_Elements.inputVerificationcode.sendKeys("767676");
		Testcase2_Elements.ButtonPlaceholder.click();
		myLogObject.info("Testcase 2 Passed and  Verified");
	}
	
	@Test
	public void TestCase2() {
		Pageobjectcreation2();
		InputData1();
		InputData2();
}
}