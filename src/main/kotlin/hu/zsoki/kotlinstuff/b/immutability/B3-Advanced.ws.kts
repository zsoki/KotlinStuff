package hu.zsoki.kotlinstuff.b.immutability

class Address {

    // Can be initialized AFTER instantiation.
    lateinit var country: String

    // Kotlin provides lazy initialization out of the box
    val city: String by lazy { "Balatonakarattya" }

    fun initCountry() {
        country = "Magyarország"
    }
}

val address = Address()

// Careful! UninitializedPropertyAccessException.
// address.country

address.initCountry()

"Location: ${address.country}, ${address.city}"