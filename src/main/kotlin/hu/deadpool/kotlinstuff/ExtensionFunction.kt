package hu.deadpool.kotlinstuff

import java.util.concurrent.ThreadLocalRandom
import java.text.DecimalFormat

// TODO the implementation is copied from StackOverflow, and autoconverted
fun Long.humanReadable(): String {
    if (this <= 0) return "0"
    val units = arrayOf("B", "kB", "MB", "GB", "TB")
    val digitGroups = (Math.log10(this.toDouble()) / Math.log10(1024.0)).toInt()
    return DecimalFormat("#,##0.#").format(this / Math.pow(1024.0, digitGroups.toDouble())) + " " + units[digitGroups]
}

object FreeSpace {

    fun calculateFreeSpaceKb() : Long {
        return ThreadLocalRandom.current().nextLong(Long.MAX_VALUE / 10000000)
    }

}