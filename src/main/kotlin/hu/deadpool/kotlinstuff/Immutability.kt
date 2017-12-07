package hu.deadpool.kotlinstuff

class ImmutabilityExample {

    lateinit var imLate: String
//    lateinit var imLateAndNullable: String? TODO unexpected compiler scream:

    fun nothinToSeeHereJustAccessinLength() {
        imLate.length
    }

}

// TODO initializing properties lazily
class LazyExample {

    val lazyVal1 by lazy { expensiveCalculation("ReturnString") }
    val lazyVal2 by lazy { expensiveCalculation("ReturnString") }
    val lazyVal3 by lazy { expensiveCalculation("ReturnString") }
    val lazyVal4 by lazy { expensiveCalculation("ReturnString") }

}


// TODO initializing properties at instantiation
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

// TODO custom delegate example
class DelegatesExample {
    var nonNullable: LazyExample by DelegatesExt.notNullSingleValue()
}