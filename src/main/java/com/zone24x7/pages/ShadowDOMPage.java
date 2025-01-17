package com.zone24x7.pages;

import com.zone24x7.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShadowDOMPage extends BasePage {

    private final By page_header = By.xpath("//h1[contains(text(),'Simple template')]");
    private final By list_box_Txt_slot = By.xpath("//li[contains(text(),'In a list!')]");

    public ShadowDOMPage(WebDriver driver) {
        super(driver);
    }

    public void pageLoaderCheck(){
        super.waitForElementToBeVisible(page_header);
    }

    public String getTextFromFirstShadowElement(){
        // Locate all 'my-paragraph' custom elements
        List<WebElement> shadowHost = uiDriver.findElements(By.tagName("my-paragraph"));

        // Use JavaScriptExecutor to get the shadow root and find input element
        JavascriptExecutor jsExecutor = (JavascriptExecutor) uiDriver;
        String slotContent = (String) jsExecutor.executeScript(
                "return arguments[0].shadowRoot.querySelector('slot[name=\"my-text\"]').assignedNodes()[0].textContent;", shadowHost.get(0)
                //We use querySelector('slot[name="my-text"]') to target the <slot> element with the name my-text
                //The assignedNodes() method retrieves the nodes assigned to this slot (in this case, the <span> element). We then access the textContent of the first assigned node
        );
        return slotContent;
    }

    private WebElement getSecondShadowElement(){
        // Locate all 'my-paragraph' custom elements
        List<WebElement> shadowHost = uiDriver.findElements(By.tagName("my-paragraph"));

        // Use JavaScriptExecutor to get the shadow root and find input element
        JavascriptExecutor jsExecutor = (JavascriptExecutor) uiDriver;
        WebElement slotElement = (WebElement) jsExecutor.executeScript(
                "return arguments[0].shadowRoot.querySelector('slot[name=\"my-text\"]').assignedNodes()[0];", shadowHost.get(1)
        );
        return slotElement;
    }

    public String getTextFromSecondShadowElement(){
       return getSecondShadowElement().getText();
    }

}
