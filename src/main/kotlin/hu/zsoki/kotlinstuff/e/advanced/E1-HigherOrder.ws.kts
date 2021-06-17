package hu.zsoki.kotlinstuff.e.advanced

class MessageObserver {

    private val listeners = mutableSetOf<(String) -> Unit>()

    // Property in lambda's outside scope (it's closure)
    var invokeCount = 0

    fun addListener(listener: (String) -> Unit) {
        listeners.add(listener)
    }

    fun notifyListeners(message: String) {
        listeners.forEach { listener ->
            listener(message)

            // Can access the variable in it's closure no problem
            invokeCount++
        }
    }
}

val messageObserver = MessageObserver()

messageObserver.addListener { message -> println("$message, World!") }
messageObserver.addListener { message -> println("$message, Józsi neked is!") }
messageObserver.addListener { message -> println("${message.length}") }

messageObserver.notifyListeners("Hello")
messageObserver.invokeCount