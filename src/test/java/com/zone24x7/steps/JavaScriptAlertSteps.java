package com.zone24x7.steps;

import com.zone24x7.pages.DropDownPage;
import com.zone24x7.pages.HomePage;
import com.zone24x7.pages.IframePage;
import com.zone24x7.pages.JavaScriptAlertPage;
import com.zone24x7.utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertSteps {

        HomePage homePage;
        JavaScriptAlertPage javaScriptAlertPage;

        DropDownPage dropDownPage;

        IframePage iframePage;

        WebDriver  driver;

       @Given("I navigate to The Internet Herokuapp's Home Page")
        public void iNavigateToTheInternetHerokuapp() {
            driver= DriverFactory.getDriver();
            driver.get("https://the-internet.herokuapp.com/");
            homePage = new HomePage(driver);
        }

        @When("I go to the {string} page")
        public void iGoToThePage(String pageName) {
            if (pageName.equals("JavaScriptAlert")) {
                System.out.println(">>>>>>");
                javaScriptAlertPage = homePage.clickOnJavaScriptAlertLink();

            }else if (pageName.equals("DropDown")){

                dropDownPage = homePage.clickOnDropDownLink();

            }else if (pageName.equals("Frames")){
                iframePage = homePage.clickOnIframePageLink();

            }
        }

        @Then("I click the JS Alert button")
        public void iClickTheJSAlertButton() {

        }

        @Then("I accept the alert popup")
        public void iAcceptTheAlertPopup() {
            //
        }
    }
