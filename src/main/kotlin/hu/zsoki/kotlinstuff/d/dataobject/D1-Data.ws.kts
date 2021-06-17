package hu.zsoki.kotlinstuff.d.dataobject

data class User(val firstName: String, val lastName: String)

val user1 = User("Teszt", "Elek")
val user2 = User("Teszt", "Elek")

// Equals method generated
user1 == user2

// Copy function is also generated, with overloaded methods as well
val copy = user1.copy();
copy === user1

val wife = user1.copy(lastName = "Elekné")
wife

// Demonstration of componentN destructure functions
val (firstName, lastName) = user1
firstName
lastName

// Data class primary constructor must have at least one property parameter.
// data class User(id: Long)

// They cannot be abstract, open, sealed or inner, and may not extend other classes (but can implement interfaces)