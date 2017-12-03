package hu.deadpool.kotlinstuff

abstract class AClass(private val someField: String) {

    fun print() {
        print(someField)
    }

}

// FIXME One way of making a child
class BClass : AClass {

    constructor(someField: String) : super(someField) {
        print()
    }

}

// FIXME correct one, with added parameter
class CClass(someField: String, someNumber: Int?) : AClass(someField) {

    private val someNumber: Int?

    init {
        print()
        this.someNumber = someNumber
    }

    constructor(someField: String) : this(someField, null) {
        print("nextOne")
    }

}