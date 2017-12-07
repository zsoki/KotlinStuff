package hu.deadpool.kotlinstuff

// TODO: type aliases, can improve readability
// private typealias Action = () -> Unit

class ObserverHigherOrder {
    private val listeners = mutableSetOf<() -> Unit>()

    fun onEvent(callback: () -> Unit) {
        listeners.add(callback)
    }

    fun triggerEvent() {
        listeners.forEach { it() }
    }

}


class SubscriberHigherOrder(observer: ObserverHigherOrder) {

    init {
        var happeningCounter = 0    // Outer scope! (closure)
        observer.onEvent {
            happeningCounter++
            println("That higher event totally happened! It happened $happeningCounter times.")
        }
    }

}