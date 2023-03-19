package com.bluecrestwellness.pages;

import com.bluecrestwellness.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout extends Utility {

    private static final Logger log = LogManager.getLogger(Checkout.class.getName());

    public Checkout() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div/button[@id='onetrust-accept-btn-handler']")
    WebElement acceptCookies;


    @FindBy(xpath = "//li[@id= 'menu-item-660']")
   WebElement mousehoverOnHealthChecks;
    @FindBy(xpath = "//a[contains(text(),'Base Home Test Kit')]")
    WebElement clickOnBaseHomeTestKit;

   // @FindBy(xpath = "(//a[contains(text(),'Book now')])[1]")
    @FindBy(xpath = "(//a[@class = 'btn productEntityAddToCart'])[2]")
    WebElement bookNow;

    @FindBy(xpath = "//button[@class = 'CloseButton__ButtonElement-sc-79mh24-0 hvNwnA irvine-CloseButton irvine-close irvine-ClosePosition--top-right']")
    WebElement cancel;

    @FindBy(xpath = "//a[@id = 'checkoutContinueButton']")
    WebElement clickContinue;

    @FindBy(xpath = "//div/h1[@class = 'left custom-title-color']")
    WebElement personalDetailsTextMessage;
    public void clickAcceptCookies() {
        log.info("I click on accept cookies" + acceptCookies);
        clickOnElement(acceptCookies);
    }

    public void mouseHoverOnHeathchecks(){
        log.info("I mousehover to HealthChecks" + mousehoverOnHealthChecks);
      mouseHoverToOneElementAndClickOnAnother(mousehoverOnHealthChecks,clickOnBaseHomeTestKit);
    }

    public void clickbookNow() throws InterruptedException {
        log.info("I click on Book now" + bookNow);
        Thread.sleep(5000);
        clickOnElement(cancel);
        clickOnElement(bookNow);

    }
    public void clickOnContinueButton(){
        log.info("I click on continue" + clickContinue);
        clickOnElement(clickContinue);
    }
    public String getPersonalDetailsText(){
        return getTextFromElement(personalDetailsTextMessage);
    }
}
