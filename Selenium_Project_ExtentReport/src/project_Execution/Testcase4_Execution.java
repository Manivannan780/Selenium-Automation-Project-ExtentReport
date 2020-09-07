package project_Execution;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import general_Actions.CommonFunctions;
import project_Elements.Testcase1_Elements;
import project_Elements.Testcase4_Elements;

public class Testcase4_Execution extends CommonFunctions {

	
	public void Case4objectCreation() {
		myLogObject.info("Testcase 4 Object Creation");
		PageFactory.initElements(driver, Testcase4_Elements.class);
	}
	
	public void GettheTeaNames() {
		myLogObject.info("Fetching  all the Tea Names using List");
		Testcase1_Elements.Menu.click();
		for (WebElement MyData :Testcase4_Elements.Teanames ) {
			String Data=MyData.getText();
			System.out.println(Data);
		}
		myLogObject.info("Testcase 4 Passed and Verified");
	}
	@Test
	public void Testcase4() {
		Case4objectCreation();
		GettheTeaNames();
		
	}
}
