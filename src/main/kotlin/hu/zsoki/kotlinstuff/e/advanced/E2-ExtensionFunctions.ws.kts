package hu.zsoki.kotlinstuff.e.advanced

import java.text.DecimalFormat
import java.util.concurrent.ThreadLocalRandom
import kotlin.math.log10
import kotlin.math.pow

// The implementation is copied from StackOverflow
fun Long.humanReadable(): String {
    if (this <= 0) return "0"
    val units = arrayOf("B", "kB", "MB", "GB", "TB")
    val digitGroups = (log10(this.toDouble()) / log10(1024.0)).toInt()
    return DecimalFormat("#,##0.#").format(this / 1024.0.pow(digitGroups.toDouble())) + " " + units[digitGroups]
}

val randomLong = ThreadLocalRandom.current().nextLong(Long.MAX_VALUE / 10000000)
randomLong.humanReadable()


// Infix function demo

infix fun String.and(other: String): String {
    return "$this & $other"
}

"Tom" and "Jerry"

// Or for an example in the stdlib:

for (i in 1..100 step 2) {
    println(i)
}