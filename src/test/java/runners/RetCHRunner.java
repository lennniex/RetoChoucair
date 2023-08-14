package runners;

import io.cucumber.junit.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register.feature",
        glue = "stepdefinitions",
        tags = " @ScenarioSinEjemplos",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)

public class RetCHRunner {
}
