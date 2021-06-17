package hu.zsoki.kotlinstuff.c.constructors

open class Customer(firstName: String, middleName: String?, lastName: String) {

    open val fullName: String = concatNames(firstName, middleName, lastName)

    // If primary constructor exists, secondary constructor must delegate to the primary
    constructor(firstName: String, lastName: String) : this(firstName, null, lastName)

    protected fun concatNames(firstName: String, middleName: String?, lastName: String) =
        listOfNotNull(firstName, middleName, lastName).joinToString(" ")

}

val customer1 = Customer("Zsíros", "B.", "Ödön")
customer1.fullName

val customer2 = Customer("Sóki", "Zoltán")
customer2.fullName


// One way of inheritance, implicitly calling the parent primary constructor

class TitleCustomer(title: String, firstName: String, middleName: String, lastName: String) : Customer(firstName, middleName, lastName) {

    override val fullName: String = "$title ${concatNames(firstName, middleName, lastName)}"

}

val titleCustomer = TitleCustomer("Dr.", "Tóth", "Tudor", "Tamás")
titleCustomer.fullName



// If you only have secondary constructors, you have more freedom

class Strategy {
    val derivedValue: String

    constructor(number: Int) {
        derivedValue = (100 / number).toString()
    }

    constructor(decimal: Double) {
        derivedValue = (100 / decimal).toString()
    }
}

val strategy1 = Strategy(17)
strategy1.derivedValue

val strategy2 = Strategy(17.0)
strategy2.derivedValue

