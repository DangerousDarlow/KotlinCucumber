package KotlinCucumber

import java.math.BigDecimal

fun main(args: Array<String>) {
    println(Addition().Calculate(BigDecimal("1.23"), BigDecimal("4.56")))
}