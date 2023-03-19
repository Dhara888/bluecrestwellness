$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("checkout.feature");
formatter.feature({
  "line": 1,
  "name": "Contact",
  "description": "",
  "id": "contact",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5415911100,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "search contact on home page",
  "description": "",
  "id": "contact;search-contact-on-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on accept cookies",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I  mousehover on Health Checks",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I click on Base Home Test Kit",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Book now",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click continue",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "verify I am on \"Personal details\" checkout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckoutStepdefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 187397600,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStepdefs.iClickOnAcceptCookies()"
});
formatter.result({
  "duration": 335943700,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStepdefs.mousehoverOnHealthChecks()"
});
formatter.result({
  "duration": 2167405900,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStepdefs.clickOnBaseHomeTestKit()"
});
formatter.result({
  "duration": 23300,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStepdefs.iClickOnBookNow()"
});
formatter.result({
  "duration": 6941727200,
  "status": "passed"
});
formatter.match({
  "location": "CheckoutStepdefs.iClickContinue()"
});
formatter.result({
  "duration": 600723700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Personal details",
      "offset": 16
    }
  ],
  "location": "CheckoutStepdefs.verifyIAmOnCheckoutPage(String)"
});
formatter.result({
  "duration": 38989300,
  "status": "passed"
});
formatter.after({
  "duration": 742001000,
  "status": "passed"
});
});