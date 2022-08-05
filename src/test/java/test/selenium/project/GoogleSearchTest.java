package test.selenium.project;

import org.testng.annotations.Test;
import test.selenium.project.driver.DriverFactory;
import test.selenium.project.pages.GoogleSearchPage;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void googleSearchTest() {
        DriverFactory.getDriver().get("https://www.google.com.ua");
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        googleSearchPage.enterTextInSearchInput("TestNG");
    }

}
