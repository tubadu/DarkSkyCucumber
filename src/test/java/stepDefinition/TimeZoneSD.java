package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import runnerTest.Webpages.TimeZone;

public class TimeZoneSD {
    private TimeZone timeZone=new TimeZone();
    @Given("^I am on DarkSky HomePage$")
    public void verifyHomePage() throws InterruptedException {
        Assert.assertEquals(timeZone.getDarkSkyPageTitle(), "Dark Sky - Broadway, New York, NY");
    }
    @When("^I entered (.+) in search box$")
    public void verifyChosenLocation(String location) throws InterruptedException {
        timeZone.chooseLocation(location);
        Assert.assertEquals(timeZone.getDarkSkyPageTitle(), "Dark Sky - Willow Bend Dr, Murphy, TX");
    }
    @Then("^I verify timeline is displayed with two hours incremented$")
    public void verifyTimelineFormat() throws InterruptedException {
        Assert.assertTrue(timeZone.verifyHourFormat("America/Murphy"));
    }



}
