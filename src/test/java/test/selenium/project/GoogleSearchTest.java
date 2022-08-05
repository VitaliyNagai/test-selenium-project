package test.selenium.project;

import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void googleSearchTest() {
        driver.get("https://www.google.com.ua");
    }

}
