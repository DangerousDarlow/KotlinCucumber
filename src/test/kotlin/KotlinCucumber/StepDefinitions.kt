package KotlinCucumber

import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import java.math.BigDecimal

class StepDefinitions {
    private var leftValue: BigDecimal = BigDecimal.ZERO
    private var rightValue: BigDecimal = BigDecimal.ZERO

    @When("^I add numbers (.*) and (.*)$")
    fun blah2(left: String, right: String) {
        leftValue = BigDecimal(left)
        rightValue = BigDecimal(right)
    }

    @Then("^the result is (.*)$")
    fun blah(value: String) {
        assertThat(Addition().Calculate(leftValue, rightValue), equalTo(BigDecimal(value)))
    }
}