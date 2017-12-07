package hu.deadpool.kotlinstuff

class NullSafety {

//    fun `nullable and nonnullable types are totally different`() : String {
//
//        var textNonNullable: String
//        var textNullable: String?
//
//        // FIXME type mismatch!
//        textNonNullable = textNullable
//
//        // FIXME I'm sure nothing bad will happen
//        textNonNullable = textNullable!!
//
//        // FIXME some nullable variants of types have extra methods
//        textNonNullable = textNullable.orEmpty()
//
//        return textNullable
//    }

//    fun `if you check beforehand, its ok`() : String {
//
//        var textNonNullable: String
//        var textNullable: String?
//
//        textNonNullable = textNullable
//
//        if (textNullable == null) {
//            throw RuntimeException()
//        }
//
//        textNullable.plus(5)
//
//        return textNonNullable
//    }
//
//
//    fun `either way, you need to initialize both nullable and non-nullable types`() : String? {
//
//        var textNullable: String?
//
//        return textNullable
//    }
//
//    fun `safe calls`(nullableString: String?) : Int {
//
//        val verbose = if (nullableString != null) nullableString.length else 5
//
//        val conscise = nullableString?.length ?: 5
//
//        return listOf(verbose, conscise)
//                .shuffled()
//                .first()
//    }

}