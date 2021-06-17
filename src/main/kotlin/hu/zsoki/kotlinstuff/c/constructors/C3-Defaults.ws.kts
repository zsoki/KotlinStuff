package hu.zsoki.kotlinstuff.c.constructors

// Same example as in C2
// Any parameter can have a default value.

class Customer(firstName: String, lastName: String, middleName: String? = null) {

    val fullName: String = concatNames(firstName, middleName, lastName)

    // DON'T NEED THIS ANYMORE!
    // constructor(firstName: String, lastName: String) : this(firstName, null, lastName)

    private fun concatNames(firstName: String, middleName: String?, lastName: String) =
        listOfNotNull(firstName, middleName, lastName).joinToString(" ")

}

val customer1 = Customer("Zsíros", "B.", "Ödön")
customer1.fullName

val customer2 = Customer("Sóki", "Zoltán")
customer2.fullName

// All constructor variations are created implicitly under the hood