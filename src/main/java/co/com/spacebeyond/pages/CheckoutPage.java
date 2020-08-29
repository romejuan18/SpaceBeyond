package co.com.spacebeyond.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends PageObject {
  @FindBy(xpath = ".//div[1]/form/div[1]/input")
  WebElementFacade txtName;

  @FindBy(xpath = ".//div[1]/form/div[2]/input")
  WebElementFacade txtEmail;

  @FindBy(xpath = ".//div[1]/form/div[3]/input")
  WebElementFacade txtSocialSecurityNumber;

  @FindBy(xpath = ".//div[1]/form/div[4]/input")
  WebElementFacade txtPhoneNumber;

  @FindBy(xpath = ".//div[5]/div/label/div")
  WebElementFacade chkAgreeTermsConditions;

  @FindBy(xpath = ".//div[7]/div/button")
  WebElementFacade btnPay;

  public void fillName() {
    txtName.waitUntilPresent();
    txtName.sendKeys("Juan Pedro Prueba");
  }

  public void fillEmail() {
    txtEmail.waitUntilPresent();
    txtEmail.sendKeys("juan@test.test");
  }

  public void fillSocialSecurityNumber() {
    txtSocialSecurityNumber.waitUntilPresent();
    txtSocialSecurityNumber.sendKeys("222-22-1243");
  }

  public void fillPhoneNumber() {
    txtPhoneNumber.waitUntilPresent();
    txtPhoneNumber.sendKeys("(212) 324-4152");
  }

  public void agreeTermsConditions() {
    chkAgreeTermsConditions.waitUntilPresent();
    chkAgreeTermsConditions.waitUntilClickable().click();
  }

  public void payBooking() {
    btnPay.waitUntilPresent();
    btnPay.waitUntilClickable().click();
  }
}
