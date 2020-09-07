package project_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import general_Actions.CommonFunctions;

public class Testcase2_Elements extends CommonFunctions {

	
	@FindBy(xpath="//input[@id=\"email\"]")
	public static WebElement inputEmail;
	
	@FindBy(xpath="//input[@id=\"name\"]")
	public static WebElement inputName;
	
	@FindBy(xpath="//textarea[@id=\"address\"]")
	public static WebElement inputAddress;
	
	@FindBy(xpath="//select[@id=\"card_type\"]")
	public static WebElement inputCardType;
	
	@FindBy(xpath="//input[@id=\"card_number\"]")
	public static WebElement inputCardNumer;
	
	@FindBy(xpath="//input[@id=\"cardholder_name\"]")
	public static WebElement inputcardholder;
	
	@FindBy(xpath="//input[@id=\"verification_code\"]")
	public static WebElement inputVerificationcode;
	
	@FindBy(xpath="//button[contains(text(),'Place Order')]")
	public static WebElement ButtonPlaceholder;
	
}
