package KotlinCucumber

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import java.math.BigDecimal

class AdditionTest {
    @Test
    fun `addition returns sum of values`() {
        assertThat(Addition().Calculate(BigDecimal("1.23"), BigDecimal("4.56")), equalTo(BigDecimal("5.79")))
    }
}