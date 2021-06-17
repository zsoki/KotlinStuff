
// Default implementations in JVM

val userNames = listOf("József", "Lőrinc")
userNames::class

val mutableUsernames = mutableSetOf("Ödön", "Viktor")
mutableUsernames::class

// We can map easily to a mutable list, this will create a copy
val mutableUserNames = userNames.toMutableList()
mutableUserNames::class



// Collection API demo

mutableUserNames += userNames
mutableUserNames.add("Nyero nev")

mutableUserNames.asSequence()
    .filter { it != "Lőrinc" }
    .shuffled()
    .first()