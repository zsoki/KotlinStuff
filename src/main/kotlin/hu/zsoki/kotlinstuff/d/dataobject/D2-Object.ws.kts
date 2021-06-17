package hu.zsoki.kotlinstuff.d.dataobject

// Object declaration to create a singleton
object Handler {

    init {
        // init inside an object: same as static { } in Java
        // Code you want to run at app initialization
    }

    fun doSomething(input: String): String {
        return input.reversed()
    }

}

Handler.doSomething("Erős iramú Mari söre.")


// Example of an object expression to create an anonymous object

interface EventListener {
    fun onHover()
    fun onClick()
}

fun addEventListener(listener: EventListener) { }

// Implementing the methods inline
addEventListener(object : EventListener {
    override fun onHover() = print("onHover")

    override fun onClick() = print("onClick")
})
