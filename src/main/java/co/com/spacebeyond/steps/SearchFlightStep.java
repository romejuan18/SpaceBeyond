package co.com.spacebeyond.steps;

import co.com.spacebeyond.pages.CheckoutPage;
import co.com.spacebeyond.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class SearchFlightStep {

  @Page HomePage homePage;

  @Page CheckoutPage checkoutPage;

  @Step
  public void openPageSpaceBeyond() {
    homePage.open();
  }

  @Step
  public void selectDeparting() {
    homePage.selectDeparting();
  }

  @Step
  public void selectReturning() {
    homePage.selectReturning();
  }

  @Step
  public void selectNumberAdultAge() {
    homePage.selectNumberAdultAge();
  }

  @Step
  public void selectNumberChildrenAge() {
    homePage.selectNumberChildrenAge();
  }

  @Step
  public void selectDestination() {
    homePage.selectDestination();
  }

  @Step
  public void selectBookFlight() {
    homePage.selectBookFlight();
  }

  @Step
  public void fillName() {
    checkoutPage.fillName();
  }

  @Step
  public void fillEmail() {
    checkoutPage.fillEmail();
  }

  @Step
  public void fillSocialSecurityNumber() {
    checkoutPage.fillSocialSecurityNumber();
  }

  @Step
  public void fillPhoneNumber() {
    checkoutPage.fillPhoneNumber();
  }

  @Step
  public void agreeTermsConditions() {
    checkoutPage.agreeTermsConditions();
  }

  @Step
  public void payBooking() {
    checkoutPage.payBooking();
  }
}
