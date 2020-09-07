package project_Execution;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import general_Actions.CommonFunctions;
import project_Elements.Testcase1_Elements;

public class Testcase1_Execution extends CommonFunctions {

	//Page object model
	String CallusText;
	String BlogText;
	String HelpText;
	public static void PageobjectCreation() {
		myLogObject.info("Testcase 1 Object Creation");
		PageFactory.initElements(driver,Testcase1_Elements.class);
		}
	
	
	public void WelcomePageVerification() {
		myLogObject.info("Welcome Page Verification");
		Testcase1_Elements.Welcome.click();
		String WelcomeURL=driver.getCurrentUrl();
		System.out.println(WelcomeURL);
		
		String Welcomepage=Testcase1_Elements.WelcomeText.getText();
		System.out.println(Welcomepage);
		//Assert.assertEquals(Welcomepage,"We're passionate about tea");
	}
	
	
	public void PassionpageVerification() {
		myLogObject.info("Passiong Page Verification");
		Testcase1_Elements.Passion.click();
		String PText=Testcase1_Elements.PassionText.getText();
		System.out.println(PText);
		//Assert.assertEquals(PText, "Our Passion");
		
	}

	public void MenuPageVerification() {
		myLogObject.info("Menu Page Verification");
		Testcase1_Elements.Menu.click();
		String MenuPageText=Testcase1_Elements.MenuText.getText();
		System.out.println(MenuPageText);
		//Assert.assertEquals(MenuPageText, "Menu");
	}
	
	public void TeaPageVerification() {
		myLogObject.info("Tea Page Verification");
		Testcase1_Elements.Tea.click();
		String TeaPageText=Testcase1_Elements.TeaText.getText();
		System.out.println(TeaPageText);
		//Assert.assertEquals(TeaPageText, "Let's Talk Tea");
	}
	public void CheckoutPageVerification() {
		myLogObject.info("Checkout Page Verification");
		Testcase1_Elements.Checkout.click();
		String CheckpageText=Testcase1_Elements.checkoutText.getText();
		System.out.println(CheckpageText);
		Testcase1_Elements.Welcome.click();
		myLogObject.info("Main Page Verification Passed");
	}

	
	@Test
	public void TestCase1() {
		PageobjectCreation();
		WelcomePageVerification();
		PassionpageVerification();
		MenuPageVerification();
		TeaPageVerification();
		CheckoutPageVerification();		
	}



}
