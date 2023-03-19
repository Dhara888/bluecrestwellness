package com.bluecrestwellness.steps;


import com.bluecrestwellness.pages.Checkout;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CheckoutStepdefs {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }


    @When("^I click on accept cookies$")
    public void iClickOnAcceptCookies() {
        new Checkout().clickAcceptCookies();
    }


    @And("^I  mousehover on Health Checks$")
    public void mousehoverOnHealthChecks() {
    new Checkout().mouseHoverOnHeathchecks();
    }

    @And("^I click on Base Home Test Kit$")
    public void clickOnBaseHomeTestKit() {

    }

    @And("^I click on Book now$")
    public void iClickOnBookNow() throws InterruptedException {
        new Checkout().clickbookNow();
    }

    @And("^I click continue$")
    public void iClickContinue() {
        new Checkout().clickOnContinueButton();
    }
    @Then("^verify I am on \"([^\"]*)\" checkout Page$")
    public void verifyIAmOnCheckoutPage(String expText) {
       String actText = new Checkout().getPersonalDetailsText();
       Assert.assertEquals(expText,actText);
    }
}
