package test.selenium.project.pages;

import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import test.selenium.project.driver.DriverFactory;

import static org.openqa.selenium.support.PageFactory.initElements;

public abstract class AbstractPage {
    protected AbstractPage() {
        initElements(new AjaxElementLocatorFactory(DriverFactory.getDriver(), 10), this);
    }

}
