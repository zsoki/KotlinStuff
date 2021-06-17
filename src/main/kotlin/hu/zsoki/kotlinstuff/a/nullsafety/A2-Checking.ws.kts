package hu.zsoki.kotlinstuff.a.nullsafety

// The parameter is non-nullable type String
fun stringManipulation(input: String): String {
    return "Method successfully ran with argument $input"
}

val textNonNullable: String = "Type: String"
val textNullable: String? = "Type: String?"

stringManipulation(textNonNullable)

// Compilation error: type mismatch
// stringManipulation(textNullable)

if (textNullable != null) {
    // Valid because of Kotlin's smart casting from String? to String
    stringManipulation(textNullable)
}






// Note on immutability:
// Smart casting would not be possible if textNullable was a var.