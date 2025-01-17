package com.zone24x7.test;

import com.zone24x7.base.BaseTest;
import com.zone24x7.pages.FramesPage;
import com.zone24x7.pages.IFramesPage;
import com.zone24x7.pages.HomePage;
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