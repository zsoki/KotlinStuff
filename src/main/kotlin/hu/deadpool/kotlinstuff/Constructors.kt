package hu.deadpool.kotlinstuff

abstract class ParentClass(
        private val someField: String,
        open val defaultValue: String = "Default") {    // TODO make property open for overriding

    fun parentFunction() {
        print(someField)
    }

}

// TODO One way of making a child
class ChildClass(someField: String) : ParentClass(someField) {  // TODO default properties implicitly overloads constructors

    override val defaultValue: String = "DefaultUpdated"

    init {
        print("Child class constructed")
    }
}


class ChildClass2(someField: String, someNumber: Int?) : ParentClass(someField) {

    // TODO Declaring fields in constructor definition is the same as this
    private val someNumber: Int?

    init {
        this.someNumber = someNumber
    }

    // TODO constructor overloading
    constructor(someField: String) : this(someField, null) {
        print("ChildClass2 constructed")
    }

}