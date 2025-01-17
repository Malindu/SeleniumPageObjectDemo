package com.zone24x7.test;

import com.zone24x7.base.BaseTest;
import com.zone24x7.pages.HomePage;
import org.testng.annotations.Test;

public class DynamicElementTest extends BaseTest {

    HomePage homePage;


    @Test
    public void dynamic_element_test(){

        homePage = new HomePage(driver);

    }


}
