package hu.deadpool.kotlinstuff

object Main {

    @JvmStatic
    fun main(args: Array<String>) {

//        NullSafety().`nullable and nonnullable types are totally different`()
//        NullSafety().`if you check beforehand, its ok`()
//        NullSafety().`either way, you need to initialize both nullable and non-nullable types`()
//        NullSafety().`safe calls`(null)
//
//        TODO no default constructor
//        ChildClass()
//        ChildClass("text")

//        val companionExample = CompanionExample("Ninjaa", "Fleex")
//        val companionExample2 = CompanionExample("Fleex", "Ninjaa")
//
//        println(UserRepository.getRepository())
//        println(UserRepository.getRepository())
//
//        val friendZone = UserRepository.funWithData(User("Pista", "777777777sdfg", 0))

//        TODO compiler has no idea anymore about the anonymous type
//        friendZone.boy
//        println(friendZone.toString())

//        TODO observer-listener
//        val observer = Observer()
//        Subscriber(observer)
//        observer.triggerEvent()

//        TODO observer-listerner higher order
//        val observerHigher = ObserverHigherOrder()
//        SubscriberHigherOrder(observerHigher)
//        observerHigher.triggerEvent()
//        observerHigher.triggerEvent()
//        observerHigher.triggerEvent()

        val freeSpace = FreeSpace.calculateFreeSpaceKb().humanReadable()
        print(freeSpace)
    }

}