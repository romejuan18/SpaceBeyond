package co.com.spacebeyond.definitions;

import co.com.spacebeyond.steps.SearchFlightStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class SearchFlightDefinition {

  @Steps SearchFlightStep searchFlightStep;

  @Dado("^la pagina web de viajes espaciales$")
  public void openPageSpaceBeyond() {
    searchFlightStep.openPageSpaceBeyond();
  }

  @Cuando("^se ingresa la fecha de inicio del viaje$")
  public void selectDeparting() {
    searchFlightStep.selectDeparting();
  }

  @Cuando("^se ingresa la fecha de regreso del viaje$")
  public void selectReturning() {
    searchFlightStep.selectReturning();
  }

  @Cuando("^se ingresa el numero de adultos y niños a viajar$")
  public void selectNumberAdultChildrenAge() {
    searchFlightStep.selectNumberAdultAge();
    searchFlightStep.selectNumberChildrenAge();
    searchFlightStep.selectDestination();
  }

  @Entonces("^se selecciona un planeta para viajar$")
  public void selectBookFlight() {
    searchFlightStep.selectBookFlight();
  }

  @Entonces("^se diligencia la reservación del viaje$")
  public void fillFlightBooking() {
    searchFlightStep.fillName();
    searchFlightStep.fillEmail();
    searchFlightStep.fillSocialSecurityNumber();
    searchFlightStep.fillPhoneNumber();
    searchFlightStep.agreeTermsConditions();
    searchFlightStep.payBooking();
  }
}
