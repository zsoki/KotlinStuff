package hu.deadpool.kotlinstuff

import org.testng.annotations.Test

class ExampleTest {

    private val example = Example()

    @Test
    fun isNull() {
        assert(example.imLate == null)
    }

    @Test
    fun isNotNull() {
        assert(example.imLate != null)
    }

    @Test(expectedExceptions = [(UninitializedPropertyAccessException::class)])
    fun isNotNotNullNeitherNull() {
        example.nothinToSeeHereJustAccessinLength()
    }
}