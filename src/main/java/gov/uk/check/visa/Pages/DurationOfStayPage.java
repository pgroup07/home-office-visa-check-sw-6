package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement moreThanSixMonths;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement nextStepButton;

    public void selectLengthOfStay(String moreOrLess) {
        log.info("select Length Of Stay " + moreOrLess);

        switch (moreOrLess) {
            case "6 monts or less":
                clickOnElement(lessThanSixMonths);
            case "more Than 6 Months":
                clickOnElement(moreThanSixMonths);
        }

    }

    public void clickNextStepButton() {
        log.info("click Next StepButton " + nextStepButton.toString());
        clickOnElement(nextStepButton);
    }

}
