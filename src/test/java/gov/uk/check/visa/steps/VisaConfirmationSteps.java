package gov.uk.check.visa.steps;


import gov.uk.check.visa.Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VisaConfirmationSteps {
    @Given("User on home page")
    public void userOnHomePage() {
    }

    @When("User click on start button")
    public void userClickOnStartButton() throws InterruptedException {
        new StartPage().clickStartNow();
    }

    @And("User Select a Nationality {string}")
    public void userSelectANationality(String country) {
        new SelectNationalityPage().selectNationality(country);
    }

    @And("User Click on Continue button")
    public void userClickOnContinueButton() {
        new SelectNationalityPage().clickNextStepButton();
    }

    @And("User Select reason {string}")
    public void userSelectReason(String reason) {
        new SelectNationalityPage().selectNationality(reason);

    }

    @Then("User verify result {string}")
    public void userVerifyResult(String actualMessage) {
        String expectedMessage = new ResultPage().getResultMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @And("Select intendent to stay for {string}")
    public void selectIntendentToStayFor(String moreOrLess) {
        new DurationOfStayPage().selectLengthOfStay(moreOrLess);
    }

    @And("User Select have planning to work for {string}")
    public void userSelectHavePlanningToWorkFor(String job) {
        new WorkTypePage().selectJobType(job);

    }
}
