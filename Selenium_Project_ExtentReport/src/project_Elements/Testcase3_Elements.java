package project_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Testcase3_Elements {

	
	@FindBy(xpath="//div/h2[contains(text(),'Our Info')]")
	public static WebElement ourinfo;
	
	@FindBy(xpath="//div/h2[contains(text(),'Send us an email')]")
	public static WebElement sendusemail;
	
	@FindBy(xpath="//input[@name=\"name\"]")
	public static WebElement name;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	public static WebElement email;
	
	
	@FindBy(xpath="//input[@name=\"subject\"]")
	public static WebElement subject;
	
	@FindBy(xpath="//textarea[@name=\"message\"]")
	public static WebElement Msg;

}
