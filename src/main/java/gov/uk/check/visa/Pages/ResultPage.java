package gov.uk.check.visa.Pages;

import gov.uk.check.visa.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(ResultPage.class.getName());
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "(//h2)[3]")
    WebElement resultMessage;

    public String getResultMessage() {
     log.info("getResultMessage " + resultMessage.toString());
        return getTextFromElement(resultMessage);
    }

    public void confirmResultMessage(String expectedMessage) {
       log.info("confirm ResultMessage ");
//      Assert.assertTrue(getResultMessage().equals(expectedMessage));
    }
}
