package test.selenium.project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import test.selenium.project.driver.DriverFactory;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        DriverFactory.createChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.getDriver().quit();
    }
}
