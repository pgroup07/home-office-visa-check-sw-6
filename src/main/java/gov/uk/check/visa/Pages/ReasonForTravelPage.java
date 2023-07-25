package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectReasonForVisit(String reason) {
      log.info("Enter Reason" + reason);
        clickOnElement(By.xpath("//label[contains(normalize-space()," + reason + ")]//parent::*//input"));
    }
    public void clickNextStepButton(){
        log.info("click Next StepButton " + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }
}
