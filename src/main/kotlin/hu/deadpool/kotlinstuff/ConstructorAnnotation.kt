package hu.deadpool.kotlinstuff

@Target(AnnotationTarget.VALUE_PARAMETER,
//        AnnotationTarget.PROPERTY,
        AnnotationTarget.PROPERTY_GETTER,
        AnnotationTarget.PROPERTY_SETTER,
        AnnotationTarget.FIELD)
@Retention(AnnotationRetention.SOURCE)
annotation class WhereDoIPootis


class AnnotateThis(@field:WhereDoIPootis val exampleText: String) {

    fun `fun`() {
        print(exampleText)
    }

}

class AnnotateThis2(exampleText: String) {

    @WhereDoIPootis
    val exampleText: String = exampleText

    val example2: String
        @WhereDoIPootis get() = "Test"

    var example3: String = ""
        @WhereDoIPootis set(value) {
            field = value
        }
}


/*
    If you don't specify a use-site target,
    the target is chosen according to the @Target
    annotation of the annotation being used.
    If there are multiple applicable targets,
    the first applicable target from the following list is used:

    param;
    property;
    field.
*/
