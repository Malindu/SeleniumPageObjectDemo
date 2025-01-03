package com.zone24x7.steps;

import com.zone24x7.base.BaseTest;
import com.zone24x7.pages.HomePage;
import com.zone24x7.pages.JavaScriptAlertPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class JavaScriptAlertSteps extends BaseTest {

        HomePage homePage;
        JavaScriptAlertPage javaScriptAlertPage;


        @Given("I navigate to The Internet Herokuapp")
        public void iNavigateToTheInternetHerokuapp() {
            homePage = new HomePage(driver);
        }

        @When("I go to the {string} page")
        public void iGoToThePage(String pageName) {
            if (pageName.equals("JavaScriptAlert")) {
                javaScriptAlertPage = homePage.clickOnJavaScriptAlertLink();
            }
        }

        @Then("I click the JS Alert button")
        public void iClickTheJSAlertButton() {
           //
        }

        @Then("I accept the alert popup")
        public void iAcceptTheAlertPopup() {
            //
        }
    }
