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
//        BClass()
//        BClass("text")

        val companionExample = CompanionExample("Ninjaa", "Fleex")
        val companionExample2 = CompanionExample("Fleex", "Ninjaa")

        println(Singleton.getRepository())
        println(Singleton.getRepository())

        val friendZone = Singleton.funWithData(User("Pista", "777777777sdfg", 0))

//        TODO compiler has no idea anymore about the anonymous type
//        friendZone.boy
        println(friendZone.toString())
    }

}