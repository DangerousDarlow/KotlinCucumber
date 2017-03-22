package KotlinCucumber

import java.math.BigDecimal

interface Operation {
    fun Calculate(left: BigDecimal, right: BigDecimal) : BigDecimal
}