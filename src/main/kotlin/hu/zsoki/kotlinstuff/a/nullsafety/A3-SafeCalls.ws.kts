package hu.zsoki.kotlinstuff.a.nullsafety

fun safeCall(input: String?): String {

    // Same as Java's ternary operator (condition ? true : false)
    val length = input?.length ?: 0

    return "String length is $length"
}

safeCall("12345")

safeCall(null)
