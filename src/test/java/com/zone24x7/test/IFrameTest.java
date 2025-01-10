package org.example.Tests;

import org.example.BaseTest.BaseTest;
import org.example.Pages.FramesPage;
import org.example.Pages.IFramesPage;
import org.example.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IFrameTest extends BaseTest {

    HomePage homePage;
    FramesPage FramesPage;
    IFramesPage IFramesPage;

    @Test
    public void TestIFrameContext() throws InterruptedException {
        homePage = new HomePage(driver);
        homePage.loadingBannerCheck();
        FramesPage = homePage.clickOnFramesLink();
        FramesPage.pageLoaderCheck();
        IFramesPage=FramesPage.navigateToIFramePage();
        Assert.assertEquals("Your content goes here.", IFramesPage.getIframeContent(), "IFrame Content is different!!!");
        Thread.sleep(5000);
    }
}