package hu.deadpool.kotlinstuff

// TODO this is technically a trait ¯\_(ツ)_/¯ Adam?
interface Printer {

    fun myPrinter(vararg params: Any) {
        params.forEachIndexed { index, param -> print("$index=$param ") }
    }

}

class CompanionExample(val aProperty: String, val anoterOne: String) {

    init {
        countInstance(this)
    }

    companion object : Printer {
        var counter: Int = 0

        fun countInstance(instance: CompanionExample) {
            counter++
            myPrinter(counter, instance.aProperty, instance.anoterOne)
        }
    }
}