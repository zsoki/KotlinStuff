package hu.deadpool.kotlinstuff

class ImmutabilityExample1 {

    lateinit var imLate: String

//    TODO unexpected compiler scream:
//    lateinit var imLateAndNullable: String?

    fun nothinToSeeHereJustAccessinLength() {
        imLate.length
    }

}

class LazyExample {

    val lazyVal1 by lazy { expensiveCalculation("ReturnString") }
    val lazyVal2 by lazy { expensiveCalculation("ReturnString") }
    val lazyVal3 by lazy { expensiveCalculation("ReturnString") }
    val lazyVal4 by lazy { expensiveCalculation("ReturnString") }

}

class NotLazyExample {

    val notLazyVal1 = expensiveCalculation("ReturnString")
    val notLazyVal2 = expensiveCalculation("ReturnString")
    val notLazyVal3 = expensiveCalculation("ReturnString")
    val notLazyVal4 = expensiveCalculation("ReturnString")

}

private fun expensiveCalculation(stringToReturn: String) : String {
    Thread.sleep(500)
    return stringToReturn
}