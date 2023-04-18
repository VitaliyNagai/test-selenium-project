package test.selenium.project;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.selenium.project.driver.DriverFactory;
import test.selenium.project.pages.GoogleResultPage;
import test.selenium.project.pages.GoogleSearchPage;

public class GoogleSearchTest extends BaseTest {
    private final String SEARCH_TEXT = "Selenium";

    @Test
    public void googleSearchTest() {
        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        GoogleResultPage googleResultPage = new GoogleResultPage();

        DriverFactory.getDriver().get("https://www.google.com");
        googleSearchPage.enterTextInSearchInput(SEARCH_TEXT);
        googleSearchPage.clickOnSubmitButton();

        for (String textLink: googleResultPage.getLinkResultList()) {
            System.out.println(textLink);
            Assert.assertTrue(textLink.contains(SEARCH_TEXT));

        }

    }

}
