package org.example.Tests;

import org.example.BaseTest.BaseTest;
import org.example.Pages.FramesPage;
import org.example.Pages.HomePage;
import org.example.Pages.IFramesPage;
import org.example.Pages.ShadowDOMPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShadowDOMTest extends BaseTest {

    HomePage homePage;
    ShadowDOMPage shadowDOMPage;

    @Test
    public void TestIFrameContext() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.loadingBannerCheck();
        shadowDOMPage = homePage.clickOnShadowDOMLink();
        shadowDOMPage.pageLoaderCheck();
        shadowDOMPage.getTextFromFirstShadowElement();
        System.out.println(shadowDOMPage.getTextFromFirstShadowElement());
        Assert.assertEquals(shadowDOMPage.getTextFromFirstShadowElement(),"Let's have some different text!","Slot Text is WRONG!!!");
        System.out.println(shadowDOMPage.getTextFromSecondShadowElement());
        Thread.sleep(5000);
    }
}