package test.selenium.project;

import org.testng.annotations.Test;
import test.selenium.project.driver.DriverFactory;
import test.selenium.project.pages.GoogleSearchPage;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void googleSearchTest() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();

        DriverFactory.getDriver().get("https://www.google.com.ua");
        googleSearchPage.enterTextInSearchInput("TestNG");
        googleSearchPage.clickOnSubmitButton();
    }

}
