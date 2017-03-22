package KotlinCucumber

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

@RunWith(Cucumber::class)
@CucumberOptions(
        format = arrayOf("pretty"),
        features = arrayOf("src/test/resources")
)
class CucumberEntryPoint