package org.example.Pages;

import org.example.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By banner_Txt = By.xpath("//h1[@class='heading']");
    private final By dropDown_Lnk = By.xpath("//a[contains(text(),'Dropdown')]");

    public HomePage(WebDriver uiDriver){
        super(uiDriver);
    }

    public void loadingBannerCheck(){
        super.waitForElementToBeVisible(banner_Txt);
    }

    public DropDownPage clickOnDropDownLink(){
        super.waitForElementToBeClickable(dropDown_Lnk).click();
        return new DropDownPage(uiDriver);
    }
}
