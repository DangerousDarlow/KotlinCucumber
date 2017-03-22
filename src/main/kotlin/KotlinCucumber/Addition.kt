package KotlinCucumber

import java.math.BigDecimal

class Addition : Operation {
    override fun Calculate(left: BigDecimal, right: BigDecimal): BigDecimal {
        return left + right
    }
}