package org.example.Tests;

import org.example.BaseTest.BaseTest;
import org.example.Pages.HomePage;
import org.testng.annotations.Test;

public class DynamicElementTest extends BaseTest {

    HomePage homePage;


    @Test
    public void dynamic_element_test(){

        homePage = new HomePage(driver);

    }


}
