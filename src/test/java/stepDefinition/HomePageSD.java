package stepDefinition;

import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import runnerTest.Webpages.HomePage;
import utils.BasePage;

public class HomePageSD {
    private HomePage homepage=new HomePage();
    @Given("^I am on Darksky HomePage$")
    public void verifyTitle(){
        Assert.assertEquals(BasePage.get().getTitle(),"Dark Sky - Broadway, New York, NY");
    }
    @When("^I click today area on homepage$")
    public void clickToday(){
        homepage.temperature();
    }
    @And("^I get temperatures on homepage$")
    public void getTemperature(){
        System.out.println(homepage.getTempList());
    }
    @And("^I get min temperature on homepage$")
    public void getMinTemp(){
        System.out.println(homepage.minTemp());
    }
    @And("^I get max temperature on homepage$")
    public void getMaxTemp(){
        System.out.println(homepage.maxTemp());
    }
    @Then("^I verify min temperature on homepage$")
    public void verifyminTemp(){
        boolean result=homepage.verifymintemp()==homepage.minTemp();
        Assert.assertFalse("Diffrent value",result);
    }
    @Then("^I verify max temperature on homepage$")
    public void verifyMaxTemp(){
        boolean result2=homepage.verifymaxtemp()==homepage.maxTemp();
        Assert.assertFalse("Different value",result2);
    }



}
