package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TodoListPage {

	WebDriver driver;

	public TodoListPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//body/div[3]/input[3]")
	WebElement ToggleAllButton;

	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement RemoveButton;

	public void ClickToggleAllButton() {

		ToggleAllButton.click();
	}

	public void ClickRemoveButton() {

		RemoveButton.click();
	}

}
