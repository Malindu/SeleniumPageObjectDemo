package org.example.Tests;

import org.example.BaseTest.BaseTest;
import org.example.Pages.DropDownPage;
import org.example.Pages.HomePage;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    HomePage homePage;
    DropDownPage dropDownPage;

    @Test
    public void TestClientSideDelay() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.loadingBannerCheck();
        dropDownPage = homePage.clickOnDropDownLink();
        dropDownPage.loadingBannerCheck();
        dropDownPage.selectDropdownByValue("Option 2");
        Thread.sleep(5000);
    }
}
