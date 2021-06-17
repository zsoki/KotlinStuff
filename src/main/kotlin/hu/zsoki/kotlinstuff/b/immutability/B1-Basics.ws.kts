package hu.zsoki.kotlinstuff.b.immutability

// Variables

val a = "A"
var b = "B"

// Compiler error
// a = b
a


// Classes

class FinalClass

// Compiler error
// class ChildClass : FinalClass()


open class User {

    // We need to initialize.
    open val department = "QualySoft"

}

class SwbuUser : User() {
    override val department: String = "SWBU"
}

User().department
SwbuUser().department