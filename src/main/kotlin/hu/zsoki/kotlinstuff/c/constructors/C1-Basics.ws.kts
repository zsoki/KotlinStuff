package hu.zsoki.kotlinstuff.c.constructors

class Example(
    constructorParameter: String,
    val publicProperty: String,
    private val privateProperty: String
) {
    init {
        println("Constructor parameter is: $constructorParameter")
    }

    fun someFunction() {
        // Not visible.
//         println(constructorParameter)

        println("Public property is: $publicProperty")
        println("Private property is: $privateProperty")
    }
}

val example = Example("Puppies", "Kittens", "Hamsters")

example.someFunction()
example.publicProperty