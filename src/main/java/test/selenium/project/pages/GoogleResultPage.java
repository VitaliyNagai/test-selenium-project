package test.selenium.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GoogleResultPage extends AbstractPage{
    @FindBy(css = "div[data-sokoban-container]")
    private List<WebElement> linkResultList;

    public List<String> getLinkResultList() {
        List<String> linkTextResultList = linkResultList.stream()
                .map(WebElement::getText)
                .toList();
        return linkTextResultList;
    }
}
