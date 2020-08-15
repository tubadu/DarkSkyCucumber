package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import runnerTest.Webpages.LoginPage;
import utils.BasePage;

public class LoginPageSD {
    private LoginPage loginPage=new LoginPage();
    @Given("^I am on HomePage$")
    public void verifytitle(){
        Assert.assertEquals(BasePage.get().getTitle(),"Dark Sky - Broadway, New York, NY");

    }

    @When("^I click buttons$")
    public void clicklogin(){
        loginPage.clickbuttons();
    }
    @And("^I enter (.+) into (username|password) text fields on home screen$")
    public void enterEmail(String value, String text){
        switch (text){
            case "username":
                loginPage.sendEmail(value);
                break;
            case  "password":
                loginPage.sendpass(value);
                break;

        }
    }
    @And("^I click on login button on login screen$")
    public void clicklogins(){
        loginPage.clicklogin();

    }
    @Then("^I verify invalid login message on sign in page$")
    public void verifyerrorMessage(){
        Assert.assertEquals(loginPage.geterror(),"Username and password do not match");
    }


}
