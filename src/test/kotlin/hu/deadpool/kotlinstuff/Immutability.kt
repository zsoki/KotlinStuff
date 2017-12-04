package hu.deadpool.kotlinstuff

import org.testng.annotations.Test
import kotlin.system.measureTimeMillis

class Immutability {

    private val example = ImmutabilityExample1()

    @Test
    fun `lateinit variable is null`() {
        assert(example.imLate == null)
    }

    @Test
    fun `lateinit variable is not null`() {
        assert(example.imLate != null)
    }

    @Test(expectedExceptions = [(UninitializedPropertyAccessException::class)])
    fun `lateinit variable is neither null, nor not null, what is it then?`() {
        example.nothinToSeeHereJustAccessinLength()
    }

    @Test
    fun `measure construction time and val access WITHOUT lazy`() {
        var notLazy: NotLazyExample? = null

        val constructionTime = measureTimeMillis {
            notLazy = NotLazyExample()
        }

        val accessTime = measureTimeMillis {
            notLazy?.notLazyVal1
            notLazy?.notLazyVal2
            notLazy?.notLazyVal3
            notLazy?.notLazyVal4
        }

        print("Construction in millis: $constructionTime")
        print("Access in millis: $accessTime")
    }

    @Test
    fun `measure construction time and val access WITH lazy`() {
        var lazy: LazyExample? = null

        val constructionTime = measureTimeMillis {
            lazy = LazyExample()
        }

        val accessTime = measureTimeMillis {
            lazy?.lazyVal1
            lazy?.lazyVal2
            lazy?.lazyVal3
            lazy?.lazyVal4
        }

        print("Construction in millis: $constructionTime")
        print("Access in millis: $accessTime")
    }

    @Test(expectedExceptions = [(IllegalStateException::class)])
    fun `not null single value not initialized`() {
        DelegatesExample().nonNullable
    }

    @Test(expectedExceptions = [(IllegalStateException::class)])
    fun `not null single value already initialized`() {
        val delegatesExample = DelegatesExample()
        delegatesExample.nonNullable = LazyExample()
        delegatesExample.nonNullable = LazyExample()
    }
}