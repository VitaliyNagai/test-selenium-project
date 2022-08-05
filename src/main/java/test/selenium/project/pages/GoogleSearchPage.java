package test.selenium.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends AbstractPage{
    @FindBy(css = "input[name='q']")
    private WebElement searchInput;

    @FindBy(xpath = "//input[@name='btnK']")
    private WebElement submitButton;

    public void enterTextInSearchInput(String text){
        searchInput.sendKeys(text);
    }

    public void clickOnSubmitButton() {
        submitButton.submit();
    }
}
