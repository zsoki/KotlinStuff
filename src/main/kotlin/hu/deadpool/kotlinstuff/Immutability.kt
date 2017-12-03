package hu.deadpool.kotlinstuff

class Example {

    lateinit var imLate: String

//    TODO unexpected compiler scream:
//    lateinit var imLateAndNullable: String?

    fun nothinToSeeHereJustAccessinLength() {
        imLate.length
    }

}

class Lazy {

    val immaLazyPropertyBoi by lazy {
        "heh."
    }

}