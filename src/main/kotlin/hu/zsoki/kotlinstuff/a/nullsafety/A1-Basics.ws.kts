package hu.zsoki.kotlinstuff.a.nullsafety

var textNonNullable: String = "Valami"
var textNullable: String? = null

// Type mismatch!
// textNonNullable = textNullable

// Ignore compile-time null check with "!!" operator
// This will result in a NPE
textNullable!!.reversed()

// Nullable variants can have different members
//textNullable.orEmpty() + " Test 2"
