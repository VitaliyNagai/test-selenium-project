package test.selenium.project;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
