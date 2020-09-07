package project_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import general_Actions.CommonFunctions;

public class Testcase1_Elements extends CommonFunctions {
	
	
	@FindBy(xpath="//a[@href=\"welcome.html\"][@data-title=\"Welcome\"]")
	public static WebElement Welcome;
	
	@FindBy(xpath="//div/h1[contains(text(),'passionate about')]")
	public static WebElement WelcomeText;
	
	@FindBy(xpath="//a[contains(text(),'Our Passion')]")
	public static WebElement Passion;
	
	@FindBy(xpath="//div/h1[contains(text(),'Our Passion')]")
	public static WebElement PassionText;
	
	@FindBy(xpath="//a[@href=\"menu.html\"][contains(text(),'Menu')]")
	public static WebElement Menu;
		
	@FindBy(xpath="//div/h1[contains(text(),'Menu')]")
	public static WebElement MenuText;
	
	@FindBy(xpath="//a[@href=\"let-s-talk-tea.html\"]")
	public static WebElement Tea;
	
	@FindBy(xpath="//div/h1[contains(text(),'Talk Tea')]")
	public static WebElement TeaText;
	
	
	@FindBy(xpath="//a[contains(text(),'Check Out')]")
	public static WebElement Checkout;
	
	@FindBy(xpath="//div/pre[1]")
	public static WebElement checkoutText;
}
