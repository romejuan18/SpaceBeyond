package co.com.spacebeyond;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    plugin = {"pretty"},
    features = "src/test/resources/co/com/spacebeyond/features/search_flight.feature",
    glue = {"com.definitions"},
    tags = {"@SpaceBeyondTest"})
public class FlightSearchTest {}
