package project_Execution;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import general_Actions.CommonFunctions;
import project_Elements.Testcase1_Elements;
import project_Elements.Testcase3_Elements;

public class Testcase3_Execution extends CommonFunctions  {
	
	public void objectCreation() {
		myLogObject.info("Testcase 3 Object Creation");
		PageFactory.initElements(driver, Testcase3_Elements.class);
	}
	
	public void Textgetting() {
		myLogObject.info("Send Email Page Verification");
		Testcase1_Elements.Tea.click();
		String OurInfoText=Testcase3_Elements.ourinfo.getText();
		System.out.println(OurInfoText);
		
		String SendText=Testcase3_Elements.sendusemail.getText();
		System.out.println(SendText);
		
	}
	
	
	public void DataMail() {
		Testcase3_Elements.name.sendKeys("Finch");
		Testcase3_Elements.email.sendKeys("Reese");
		Testcase3_Elements.subject.sendKeys("AI");
		Testcase3_Elements.Msg.sendKeys("Lets Hope");
		
		Testcase3_Elements.name.clear();
		Testcase3_Elements.email.clear();
		Testcase3_Elements.subject.clear();
		Testcase3_Elements.Msg.clear();
		
		Testcase1_Elements.Welcome.click();
		myLogObject.info("Testcase 3 Passed and Verified");
	}
	
	@Test
	public void Testcase3() {
		objectCreation();
		Textgetting();
		DataMail();
	}
	
	

}
