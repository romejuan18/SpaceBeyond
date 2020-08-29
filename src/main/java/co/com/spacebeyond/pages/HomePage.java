package co.com.spacebeyond.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://demo.testim.io/")
public class HomePage extends PageObject {

  @FindBy(xpath = ".//section[1]/div[3]/div/div[1]//input")
  WebElementFacade contDeparting;

  @FindBy(xpath = ".//div[2]/div[29]/span")
  WebElementFacade btnDeparting;

  @FindBy(xpath = ".//div[2]/nav/button[2]")
  WebElementFacade btnConfirmDate;

  @FindBy(xpath = ".//section[1]/div[3]/div/div[2]//input")
  WebElementFacade contReturning;

  @FindBy(xpath = ".//div[2]/div[10]/span")
  WebElementFacade btnReturning;

  @FindBy(xpath = ".//section[1]/div[3]/div/div[3]//input")
  WebElementFacade conNumberAdultAge;

  @FindBy(xpath = ".//div[3]/ul/li[3]")
  WebElementFacade btnNumberAdultAge;

  @FindBy(xpath = ".//section[1]/div[3]/div/div[4]//input")
  WebElementFacade conNumberChildrenAge;

  @FindBy(xpath = ".//div[4]/ul/li[3]")
  WebElementFacade btnNumberChildrenAge;

  @FindBy(xpath = ".//section[1]/div[4]/button")
  WebElementFacade btnSelectDestination;

  @FindBy(xpath = ".//div[1]/div[4]/button")
  WebElementFacade btnBookFlight;

  public void selectDeparting() {
    contDeparting.waitUntilPresent();
    contDeparting.waitUntilClickable().click();
    btnDeparting.waitUntilPresent();
    btnDeparting.waitUntilClickable().click();
    btnConfirmDate.waitUntilPresent();
    btnConfirmDate.waitUntilClickable().click();
  }

  public void selectReturning() {
    contReturning.waitUntilPresent();
    contReturning.waitUntilClickable().click();
    btnReturning.waitUntilPresent();
    btnReturning.waitUntilClickable().click();
    btnConfirmDate.waitUntilPresent();
    btnConfirmDate.waitUntilClickable().click();
  }

  public void selectNumberAdultAge() {
    conNumberAdultAge.waitUntilPresent();
    conNumberAdultAge.waitUntilClickable().click();
    btnNumberAdultAge.waitUntilPresent();
    btnNumberAdultAge.waitUntilClickable().click();
    btnConfirmDate.waitUntilPresent();
    btnConfirmDate.waitUntilClickable().click();
  }

  public void selectNumberChildrenAge() {
    conNumberChildrenAge.waitUntilPresent();
    conNumberChildrenAge.waitUntilClickable().click();
    btnNumberChildrenAge.waitUntilPresent();
    btnNumberChildrenAge.waitUntilClickable().click();
    btnConfirmDate.waitUntilPresent();
    btnConfirmDate.waitUntilClickable().click();
  }

  public void selectDestination() {
    btnSelectDestination.waitUntilPresent();
    btnSelectDestination.waitUntilClickable().click();
  }

  public void selectBookFlight() {
    btnBookFlight.waitUntilPresent();
    btnBookFlight.waitUntilClickable().click();
  }
}
