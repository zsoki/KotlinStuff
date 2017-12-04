package hu.deadpool.kotlinstuff

interface EventListener {

    fun onEvent()

}

class Observer {

    private val listeners = mutableSetOf<EventListener>()

    fun addListener(listener: EventListener) {
        listeners.add(listener)
    }

    fun triggerEvent() {
        listeners.forEach { it.onEvent() }
    }

}

class Subscriber(observer: Observer) {

    init {
        observer.addListener(object : EventListener {
            override fun onEvent() {
                println("That event totally happened!")
            }
        })
    }

}